package top.yunp.nio_demo.net_demo;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Set;

public class RecFile_By_NIO {

    public static void main(String[] args) throws IOException {

        String saveDir = "E:/GGG";

        doRec(saveDir, 11001);

    }

    private static Selector selector = null;

    public static void doRec(String saveDir, int port) throws IOException {
        /**
         * java.nio.channels.ServerSocketChannel
         *      static ServerSocketChannel 	open()
         *      ServerSocketChannel 	bind​(SocketAddress local)
         * java.net.InetSocketAddress
         *      InetSocketAddress​(int port)
         */

        selector = Selector.open();

        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.configureBlocking(false);
        ss.register(selector, SelectionKey.OP_ACCEPT);

        InetSocketAddress address = new InetSocketAddress(port);
        ss.bind(address);

        System.out.println("NIO的服务端开启了！");
        while (true) {

            SocketChannel skChannel = ss.accept();
            if (null != skChannel) {
                skChannel.configureBlocking(false);
                skChannel.register(selector, SelectionKey.OP_READ);
            }

            doJobWithSelector(saveDir);
        }
    }

    public static void doJobWithSelector(String saveDir) throws IOException {

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

                    if(keyOfChannel.isReadable())
                    {
                        SocketChannel channel = (SocketChannel) keyOfChannel.channel();

                        //读取信息 文件名
                        ByteBuffer nameBuff = ByteBuffer.allocate(1024*1024*10);
                        nameBuff.clear();

                        channel.read(nameBuff);
                        byte[] buff = new byte[512];
                        nameBuff.flip();
                        nameBuff.get(buff);
                        nameBuff.clear();

                        String fileName = new String(buff);

                        //拼接路径
                        String absPath = saveDir+"/"+fileName.trim();
                        System.out.println("文件保存的路径为："+absPath);

                        //从网络接收数据 并保存到本地
                        File nativeFile = new File(absPath);
                        Path p1 = nativeFile.toPath();
                        FileChannel outChannel = FileChannel.open(p1,StandardOpenOption.WRITE,StandardOpenOption.CREATE);

                        ByteBuffer netBuff = ByteBuffer.allocate(1024*1024*10);
                        netBuff.clear();
                        int len = 0;

                        while ((len =channel.read(netBuff) )!=-1)
                        {
                            netBuff.flip();
                            outChannel.write(netBuff);
                            netBuff.clear();
                        }

                        outChannel.close();

                        //回复文件大小
                        long size = nativeFile.length();
                        ByteBuffer sizeBuff = ByteBuffer.allocate(1024);
                        sizeBuff.clear();
                        sizeBuff.putLong(size);
                        sizeBuff.flip();
                        channel.write(sizeBuff);
                        sizeBuff.clear();

                    }

                }

            }
        }
    }



}
