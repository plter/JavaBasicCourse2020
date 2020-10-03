package top.yunp;

//1、导包
import java.util.Scanner;


/**
 * 这里用来讲解关于Java中键盘录入的操作
 */
public class ScannerTest {

    public static void main(String[] args)
    {
        /**
         * 基本词组、单词： 具有一定含义
         * 基础语法：命名 for if 自定义方法
         * API：Application Programing Interface
         *
         *      计算机：硬件 软件
         *
         *                        接口       接口
         *      操作系统（键盘、鼠标） ---> API ---> 程序员
         *
         *      Java类：
         *
         *          Scanner ---> java.util
         *
         * JDK IDEA
         */

        //2、创建类的实例对象
        //数据类型  变量名 = 值;
        //int  a = 10;
        //引用数据类型
        Scanner sc = new Scanner(System.in);

        //System.out.println("AA");

        System.out.println("请录入姓名");
        //3、调用具体的功能 完成操作
        String name = sc.next();

        String[] names = new String[10];
        names[0] = name;

        System.out.println("name == "+name);

        System.out.println("请录入一个整数");
        int num = sc.nextInt();

        System.out.println("num == "+num);

    }
}
