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

public class RecFiles_By_NIO {

    /**
     * 现在讲述的I/O操作中，NIO编程逻辑是最复杂，需要考虑很多，如果个人编写一个NIO框架用于开发，有点困难！
     * 通过示例了解一下 NIO的编程思路 以及 NIO组成部分：
     * Channel
     * Buffer
     * Selector
     * SelectionKey
     *     READ WRITE
     *
     * 实际工作中：
     *      Netty
     *    大数据开发中：
     *       分布式：  主从结构  主从节点之间 需要大量通信 NIO
     *
     */
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
//                keyOfChannel.cancel();

                if(keyOfChannel.isValid())
                {

                    if(keyOfChannel.isReadable())
                    {
                        SocketChannel channel = (SocketChannel) keyOfChannel.channel();

                        //读取信息 文件名
                        ByteBuffer nameBuff = ByteBuffer.allocate(1024);
                        nameBuff.clear();

                        channel.read(nameBuff);
                        byte[] buff = new byte[1024];
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
                        FileChannel outChannel = FileChannel.open(p1, StandardOpenOption.WRITE,StandardOpenOption.CREATE);

                        ByteBuffer netBuff = ByteBuffer.allocate(1024);
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

                        keyOfChannel.cancel();


                    }

                }

            }
        }
    }

}
