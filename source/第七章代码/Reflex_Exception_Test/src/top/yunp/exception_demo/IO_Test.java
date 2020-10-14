package top.yunp.exception_demo;

import java.io.*;

public class IO_Test {

    public static void main(String[] args) throws IOException {

        //编译时期异常
        //FileNotFoundException
//        FileInputStream fis = new FileInputStream("");


        //运行时期异常  必须修改代码逻辑
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at top.yunp.exception_demo.IO_Test.main(IO_Test.java:13)

        //int a = 1/0;


//        Exception in thread "main" java.lang.NullPointerException
//        at top.yunp.exception_demo.IO_Test.main(IO_Test.java:23)
//        String str = null;
//        str.length();


        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String toPath = "E:/BBBBB/a.pptx";
        doCopy(fromPath,toPath);

        //所有的异常 抛出操作最终给了 JVM虚拟机去处理

    }

    public static void doCopy(String fromPath, String toPath) throws IOException {
        File fromFile = new File(fromPath);
        //FileNotFoundException 文件找不到的异常
        FileInputStream fis = new FileInputStream(fromFile);

        File toFile = new File(toPath);
        //FileNotFoundException
        FileOutputStream fos = new FileOutputStream(toFile);

        //public class FileNotFoundException extends IOException
        //public class IOException extends Exception
        int len = 0;
        byte[] buff = new byte[1024];
        //IOException
        while ((len = fis.read(buff))!=-1)
        {
            //IOException
            fos.write(buff,0,len);
            fos.flush();
        }
        //IOException
        fos.close();
        fis.close();
    }
}
