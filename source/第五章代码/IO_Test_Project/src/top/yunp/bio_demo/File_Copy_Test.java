package top.yunp.bio_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Copy_Test {

    public static void main(String[] args) throws IOException {
//        test_read();

        doCopy();
    }

    public static void test_read() throws IOException {
        /**
         * FileInputStream​(String name)
         *
         * 返回值： 每一次读取到有效长度  如果读取到文件的结尾 返回的 -1
         * int 	read​(byte[] b)
         */
        String filePath = "E:/BBBB/b.txt";
        FileInputStream fis = new FileInputStream(filePath);

        byte[] buff = new byte[5];
        System.out.println(fis.read(buff));
        System.out.println(new String(buff));
        System.out.println(fis.read(buff));
        System.out.println(new String(buff));
        System.out.println(fis.read(buff));
        System.out.println(new String(buff));
        System.out.println(fis.read(buff));
        System.out.println(new String(buff));

        fis.close();
    }

    public static void doCopy() throws IOException {
        /**
         * FileOutputStream​(String name)
         * void 	write​(byte[] b, int off, int len)
         */

        String fromPath = "E:/BBBB/b.txt";
        String toPath = "E:/BBBB/c.txt";

        FileInputStream fis = new FileInputStream(fromPath);

        byte[] buff = new byte[5];

        int len = 0;

        FileOutputStream fos = new FileOutputStream(toPath);

        while((len = fis.read(buff))!=-1)
        {
            //向新的文件写出
            //FileOutputStream fos = new FileOutputStream(toPath);
            fos.write(buff,0,len);
            fos.flush();
        }

        //先打开的后关闭
        fos.close();
        fis.close();

    }
}
