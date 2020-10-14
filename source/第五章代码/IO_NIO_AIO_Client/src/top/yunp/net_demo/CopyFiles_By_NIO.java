package top.yunp.net_demo;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CopyFiles_By_NIO {

    public static void main(String[] args)
    {
        /**
         * 需求： 通过NIO传输多个文件
         *
         * 分析：
         *      a.txt b.txt c.pptx
         *
         *      遍历这个目录，获取不同文件
         *      对于每一个文件都要单独创建一个 Channel 尝试连接，并且注册到Selector
         *      对于Selector需要进行监听 ，获取不同状态的Channel 进行分别处理
         *
         */

        String dir = "E:/YYYY";
        String ipAddress = "127.0.0.1";
        int port = 11001;
        try {
            doSendFiles(dir,ipAddress,port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static Selector selector = null;
    private static HashMap<SocketChannel,File> channel_file = new HashMap<>();
    public static void doSendFiles(String dir, String ipAddress, int port) throws IOException {

        selector = Selector.open();

        File file = new File(dir);

        if(file.isFile())
        {
            //如果是一个单个文件，需要开启Channel 并发送出去
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            InetSocketAddress address = new InetSocketAddress(ipAddress,port);

            channel_file.put(socketChannel,file);
            if(socketChannel.connect(address))
            {
                System.out.println("连接成功");
                socketChannel.register(selector, SelectionKey.OP_READ);
                doSendFile(socketChannel, file);
            }
            else
            {
                System.out.println("连接失败");
                socketChannel.register(selector, SelectionKey.OP_CONNECT);
            }
        }

        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for(File f : files)
            {
                if(f.isFile())
                {
                    SocketChannel skChannel = SocketChannel.open();
                    skChannel.configureBlocking(false);
                    channel_file.put(skChannel,f);
                    InetSocketAddress addr = new InetSocketAddress(ipAddress,port);

                    if(skChannel.connect(addr))
                    {
                        System.out.println("连接成功！");
                        skChannel.register(selector,SelectionKey.OP_READ);
                        doSendFile(skChannel,f);
                    }
                    else
                    {
                        System.out.println("连接失败！");
                        skChannel.register(selector,SelectionKey.OP_CONNECT);
                    }

                }
                if(f.isDirectory())
                {
                    System.out.println("暂时不支持多层目录上传！");
                }
            }
        }

        doWhile();

    }

    public static void doWhile() throws IOException {

        while (true)
        {

            int count = selector.select();

            if(count > 0)
            {
                Set<SelectionKey> keys = selector.selectedKeys();

                Iterator<SelectionKey> it = keys.iterator();

                while (it.hasNext())
                {
                    SelectionKey keyOfChannel = it.next();
                    it.remove();


                    if(keyOfChannel.isValid())
                    {
                        SocketChannel skskChannel = (SocketChannel) keyOfChannel.channel();
                        File fil = channel_file.get(skskChannel);

                        if(keyOfChannel.isReadable())
                        {
                            readMsgFromChannl(skskChannel,fil);
                        }

                        if(keyOfChannel.isConnectable())
                        {
                            if(skskChannel.finishConnect())
                            {
                                skskChannel.register(selector,SelectionKey.OP_READ);
                                doSendFile(skskChannel,fil);
                            }

                        }
                    }
                }
            }


        }

    }

    public static void readMsgFromChannl(SocketChannel channel,File file) throws IOException {

        ByteBuffer  buff = ByteBuffer.allocate(1024);

        channel.read(buff);
        buff.flip();
        long size = buff.getLong();
        buff.clear();

        //从本地文件中获取文件大小
        long nativeSize = file.length();

        if(size == nativeSize)
        {
            System.out.println("文件大小相同！");
//            channel.close();

        }
        else
        {
            System.out.println("文件大小不相同！");
        }


    }

    public static void doSendFile(SocketChannel channel, File file) throws IOException {


        //先发送一个文件名字
        String fileName = file.getName();
        System.out.println("正在发送："+fileName);

        byte[] name = fileName.getBytes();
        System.out.println("文件名字长度："+name.length);
        byte[] sendName = Arrays.copyOf(name,1024);

        ByteBuffer buff = ByteBuffer.allocate(1024*1024*10);
        buff.put(sendName);
        buff.flip();
        //ABCDEFG
        channel.write(buff);
        buff.clear();

        //发送完名字之后 接着发送文件内容

        Path p1 = file.toPath();
        FileChannel inputChannel = FileChannel.open(p1, StandardOpenOption.READ);

        int len = 0;

        while ((len = inputChannel.read(buff))!=-1)
        {
            buff.flip();
            channel.write(buff);
            buff.clear();
        }
        channel.shutdownOutput();

        inputChannel.close();


    }
}
