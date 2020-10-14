package top.yunp.bio_demo;

import java.io.*;

public class Data_Stream_Test {

    public static void main(String[] args) throws IOException {

        /**
         * 需求： 如果计算完成了一个整数求和，想要将这个结果保存到文件中
         *
         * 分析： 从事编程工作，工作更多的时候是寻找解决问题的思路
         *
         *      询问朋友
         *      开讨论会
         *      搜索资料
         *
         *      初步答案1： DataOutputStream
         *
         * 解决：
         *
         *      1、创建DataOutputStream的对象
         *          DataOutputStream​(OutputStream out)
         *      2、从API中找到合适的方法完成 保存整数的操作
         *          void 	writeInt​(int v)
         *
         */

        //1、使用唯一提供的构造创建对象，发现一个问题，需要指定一个OutPutStream这样一个对象
        //2、又发现一个问题，OutputStream 是一个抽象类，不能直接进行对象创建
        //3、寻找其子类来创建对象， 寻找那个子类？
        //4、寻找到FileOutputStream 这样的子类，观察期构造 FileOutputStream​(File file)，需要File对象
        //5、通过观察File 其构造方法 File​(String pathname)
        //6、pathname 是一个已知项，
//        String pathName = "E:/DDD/a.txt";
//        File file = new File(pathName);
//        FileOutputStream fos = new FileOutputStream(file);
//        DataOutputStream dos = new DataOutputStream(fos);
//        dos.writeInt(10000);
//        dos.flush();
//
//        dos.close();
//        fos.close();


        /**
         * 注意： 如果使用Java的API 对外进行的数据输出，如果想要重新获取 读取数据，需要使用Java的对应的API来完成
         *
         * 初步答案： DataInputStream
         *
         * 过程:
         *
         *      1、需要使用DataInputStream 读取已经存储到某个文件的数据
         *          DataInputStream​(InputStream in)
         *      2、发现构造方法中 需要一个  InputStream
         *      3、找到InputStream的子类 FileInputStream
         *          FileInputStream​(File file)
         *      4、File类  构造 File​(String pathname)
         *      5、pathname 作为一个已知的路径
         *      6、找到对应的功能 int 	readInt()
         *
         */
//        String pathNameName = "E:/DDD/a.txt";
//        File file1 = new File(pathNameName);
//        FileInputStream fis = new FileInputStream(file1);
//        DataInputStream dis = new DataInputStream(fis);
//
//        int result = dis.readInt();
//        System.out.println("之前存储的整数："+result);
//
//        dis.close();
//        fis.close();


        /**
         * 学习I/O对应的API 与 集合相关的API 学习时 有不同！
         *
         * ArrayList<String> strs = new ArrayList<String>();
         *
         * strs.add("AAA");
         * strs.add("AAA");
         * strs.add("AAA");
         * strs.remove("AAA");
         *
         * 集合： 也是需要有几个步骤：
         *      1、观察存储什么数据
         *      2、选择API  结合数据结构 以及 集合特性
         *      3、功能
         *
         *
         *
         * 对于I/O的API来说 是需要一套 来完成的！
         * 需要多个方法进行配合完成，这所谓的多个方法 有很大的重复性
         *
         * readXXX
         * writeXXX
         *
         * flush
         * close
         */

        String filePath = "E:/DDD/b.txt";
        String data = "欢迎大家 学习 I/O";
//        test_writeUTF(filePath,data);

        String msg = test_readUTF(filePath);
        System.out.println("保存的数据："+msg);
    }


    public static void test_writeUTF(String pathName,String data) throws IOException {
        /**
         * 需求： 将某个字符串 保存到指定的文件中，然后 另外一个程序将其取出出来
         *
         * 分析：
         *      参数： 指定一个参数，表示文件路径
         */

        File file = new File(pathName);
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF(data);
        dos.flush();

        dos.close();
        fos.close();

    }

    public static String test_readUTF(String pathName) throws IOException {

        File file = new File(pathName);
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        String result = dis.readUTF();


        dis.close();
        fis.close();

        return  result;
    }
}
