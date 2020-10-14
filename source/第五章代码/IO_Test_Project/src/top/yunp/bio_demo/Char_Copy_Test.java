package top.yunp.bio_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Char_Copy_Test {

    public static void main(String[] args) throws IOException {

        /**
         * 对于字符流 我们最好操作的文件 是可以直接被 Windows的记事本打开的文件  或者称为 纯文本
         *
         * 字节流 与 字符流的 区分：
         *
         * 1、字节流 通用在一切未知
         * 2、字符流 主要使用在 纯文本文件中
         *
         * Class FileReader
         * int 	read​(char[] cbuf)
         * Class FileWriter
         * abstract void 	write​(char[] cbuf, int off, int len)
         */
//        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String fromPath = "E:/AAAA/Student.java";
        String toPath = "E:/BBBB/c.java";
        doCopyByChar(fromPath,toPath);

    }

    public static void doCopyByChar(String fromPath, String toPath) throws IOException {

        FileReader fr = new FileReader(fromPath);

        int len = 0;
//        byte[] buff = new byte[1024];
        char[] buff = new char[1024];

        FileWriter fw = new FileWriter(toPath);

        while ((len = fr.read(buff))!=-1)
        {
            fw.write(buff,0,len);
            fw.flush();
        }

        fw.close();
        fr.close();
    }
}
