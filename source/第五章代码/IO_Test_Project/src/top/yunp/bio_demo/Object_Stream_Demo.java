package top.yunp.bio_demo;

import java.io.*;

public class Object_Stream_Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String pathName = "E:/DDD/d.txt";
        Student stu1 = new Student("张三",25,"男");

//        test_writeObject(pathName,stu1);

        Student stu2 = test_readObject(pathName);
        System.out.println("存储在文件中的自定义类的数据："+stu2);

    }

    public static void test_writeObject(String pathName,Object obj) throws IOException {

        File file = new File(pathName);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        //Exception in thread "main" java.io.NotSerializableException: top.yunp.bio_demo.Student
        oos.flush();
        oos.close();
        fos.close();

    }

    public static <T> T test_readObject(String pathName) throws IOException, ClassNotFoundException {

        File file = new File(pathName);

        //FileNotFoundException
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        T t = (T) ois.readObject();

        ois.close();
        fis.close();

        return  t;



    }

}
