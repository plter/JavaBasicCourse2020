package top.yunp.net_demo;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class CopySingleFile_By_NIO {


    public static void main(String[] args) throws IOException {

        String path = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        doSendByNIO(path);

    }

    private  static Selector selector = null;

    public static void doSendByNIO(String fromFilePath) throws IOException {
        //1、打开网络通道
        /**
         * java.nio.channels.SocketChannel
         *      static SocketChannel 	open()
         *      abstract boolean 	connect​(SocketAddress remote)
         *
         * java.net.InetSocketAddress
         *      InetSocketAddress​(String hostname, int port)
         */

        selector = Selector.open();

        SocketChannel client = SocketChannel.open();
        //true表示是阻塞模式   false非阻塞模式
        client.configureBlocking(false);

        InetSocketAddress address = new InetSocketAddress("127.0.0.1",11000);

        boolean result = client.connect(address);

        if(result)
        {

            //通道连接成功
            client.register(selector, SelectionKey.OP_READ);
            doSendFile(client,fromFilePath);

        }
        else
        {

            //通道连接失败
            client.register(selector,SelectionKey.OP_CONNECT);
        }

        //循环遍历selector 从而处理不同的Channel状态

        while (true) {
            doWhile(fromFilePath);

        }

    }

    public static void doWhile(String path) throws IOException {


        /**
         * java.nio.channels.Selector
         *      abstract int 	select()
         *      abstract Set<SelectionKey> 	selectedKeys()
         *
         * Class SelectionKey
         *      abstract SelectableChannel 	channel()
         *      abstract boolean 	isValid()
         *      boolean 	isAcceptable()
         *      boolean 	isConnectable()
         *      boolean 	isReadable()
         */
        int count = selector.select();
        if(count > 0)
        {
            //key 与 channel是一一对应的！
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> it = keys.iterator();

            while (it.hasNext())
            {
                SelectionKey keyOfChannel = it.next();

                it.remove();

                if(keyOfChannel.isValid())
                {
                    SocketChannel channel = (SocketChannel) keyOfChannel.channel();

                    if(keyOfChannel.isReadable())
                    {

                        //此时需要从Channel中读取相关数据
                        readMsgFromChannl(channel,path);
                    }

                    if(keyOfChannel.isConnectable())
                    {

                        //完成之前没有完成的连接操作
                        if(channel.finishConnect())
                        {
                            channel.register(selector,SelectionKey.OP_READ);
                            doSendFile(channel,path);
                        }
                    }

                }


            }
        }

    }

    public static void readMsgFromChannl(SocketChannel channel,String path) throws IOException {

        ByteBuffer  buff = ByteBuffer.allocate(1024);

        channel.read(buff);
        buff.flip();
        long size = buff.getLong();
        buff.clear();

        //从本地文件中获取文件大小
        File nativeFile = new File(path);
        long nativeSize = nativeFile.length();

        if(size == nativeSize)
        {
            channel.close();
        }


    }

    public static void doSendFile(SocketChannel socketChannel, String fromPath) throws IOException {

        //打开指向本地文件的一个通道
        File fromFile = new File(fromPath);


        //先发送一个文件名字
        String fileName = fromFile.getName();

        byte[] name = fileName.getBytes();
        byte[] sendName = Arrays.copyOf(name,1024);

        ByteBuffer buff = ByteBuffer.allocate(1024);
        buff.put(sendName);
        buff.flip();
        //ABCDEFG
        socketChannel.write(buff);
        buff.clear();

        //发送完名字之后 接着发送文件内容

        Path p1 = fromFile.toPath();
        FileChannel inputChannel = FileChannel.open(p1, StandardOpenOption.READ);

        int len = 0;

        while ((len = inputChannel.read(buff))!=-1)
        {
            buff.flip();
            socketChannel.write(buff);
            buff.clear();
        }
        socketChannel.shutdownOutput();

        inputChannel.close();


    }
}
