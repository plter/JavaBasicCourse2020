package top.yunp.native_demo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CopyFile_By_NIO {

    public static void main(String[] args) throws IOException {
        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String toPath = "E:/CCCC/a.pptx";
        doCopy(fromPath,toPath);
    }

    public static void doCopy(String fromPath, String toPath) throws IOException {
        //1、创建一个指向fromPath的输入流  输入的Channel
        /**
         * Class FileChannel
         *      static FileChannel 	open​(Path path, OpenOption... options)
         *
         *      abstract int 	read​(ByteBuffer dst)
         *
         * Enum StandardOpenOption
         *      READ
         *      WRITE
         *      CREATE
         *
         * java.nio.ByteBuffer
         *      static ByteBuffer 	allocate​(int capacity)
         *      Buffer 	flip()
         */
        File fromFile = new File(fromPath);
        Path p1 = fromFile.toPath();
        //输入的Channel
        FileChannel inputChannel = FileChannel.open(p1, StandardOpenOption.READ);

        int len = 0;
        ByteBuffer buff = ByteBuffer.allocate(1024);

        File toFile = new File(toPath);
        Path p2 = toFile.toPath();
        //输出的Channel
        FileChannel outputChannel = FileChannel.open(p2,StandardOpenOption.WRITE,StandardOpenOption.CREATE);

        //数组：  索引 0
        //ByteBuffer  ABCDEFG
        while ((len = inputChannel.read(buff))!=-1)
        {
            buff.flip();
            outputChannel.write(buff);
            buff.clear();
        }

        outputChannel.close();
        inputChannel.close();




    }

    public static void doCopyBYBIO(String fromPath, String toPath) throws IOException {

        File fromFile = new File(fromPath);
        FileInputStream fis = new FileInputStream(fromFile);

        int len = 0;
        byte[] buff = new byte[1024];

        File toFile = new File(toPath);
        FileOutputStream fos = new FileOutputStream(toFile);

        while ((len = fis.read(buff))!=-1)
        {
            fos.write(buff,0,len);
            fos.flush();
        }

        fos.close();
        fis.close();
    }
}
