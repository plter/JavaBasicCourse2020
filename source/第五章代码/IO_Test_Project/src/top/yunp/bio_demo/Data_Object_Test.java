package top.yunp.bio_demo;

import java.io.*;

public class Data_Object_Test {

    public static void main(String[] args) throws IOException {
        String pathName = "E:/DDD/e.txt";
        test_write(pathName);

        test_read(pathName);

    }

    public static void test_write(String pathName) throws IOException {
        File file = new File(pathName);
        //在执行代码时，会创建新的文件，将原来文件覆盖掉
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        //对于数据的写出操作，总是从文件开始位置 以此写入，如果之前存在数据，这些数据会被覆盖掉
        dos.writeUTF("AAA");
        dos.writeUTF("BBB");
        dos.writeUTF("CCC");
        dos.writeUTF("DDD");
//        dos.writeUTF("III");
//        dos.writeUTF("JJJ");

        dos.flush();
        dos.close();
        fos.close();
    }

    public static void test_read(String pathName) throws IOException {
        File file = new File(pathName);
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());

        //Exception in thread "main" java.io.EOFException

        dis.close();
        fis.close();

    }
}
