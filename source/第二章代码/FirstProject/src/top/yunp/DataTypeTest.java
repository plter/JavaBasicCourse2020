package top.yunp;

/**
 * 文档注释
 * 当前代码用来演示，围绕着数据类型的相关使用
 */
public class DataTypeTest {

    //程序入口  main程序  main方法
    public static void main(String[] args)
    {
        //进行代码编写的区域
        //Java的数据类型：
        //基本数据类型：
        //  整数： byte 1 short 2  int 4  long 8
//               byte：8    2^8  = 256   --> 符号位： -128 --  +127
//               short： 16  2^16 = 65536  -->  符号位： -32768  +32767
//               int：  32                      符号位：-2^31    +2^31-1
//               long: 64                      符号位： -2^63    +2^63-1

        //浮点数： float(4)   double(8)
//        3.14 ---> 0.314*10^1
//            float:   8位   --->  指数位很大了    有效位：
//            double： 11位  --->  指数很大        有效位：

        //字符类型: char(2)
//        A  B  C  ---> ASCII码表
//        汉字： 学（占用两个字节）   英文单个字母：（占用1个字节）

        //布尔类型： true false


        //变量的定义格式： 数据类型   变量名  = 值;

        byte b1 = -128;
        //变量的使用：  加减乘除 是对变量的使用，  向屏幕输出也是对变量的使用
        System.out.println("HelloWorld!");
        System.out.println(b1);

        byte b2 = 127;
        System.out.println(b2);

        short s1 = 500;
        System.out.println(s1);

        int i1 = 1000;
        System.out.println(i1);

        //在进行数值的赋值操作 时，需要经历几个步骤：
        //1、整数： 赋值号右侧，书写的一个整数的数值，其在Java中默认为 int类型
        //       赋值时 首先要检查 右侧的数值是否超过了int的范围
        //2、若 右侧的整数数值没有超出int 的范围，那么进行赋值操作
        //     检查 赋值号左侧的数据类型 如果想要赋值的值没有超出该类型的范围，则可以赋值
        //     否则报错
        //byte b5 = -130;

        long l1 = 123456789123456789L;
        long l2 = 123456789123456789l;

        System.out.println(l1);
        System.out.println(l2);

        //浮点数 ： float  double

        float f1 = 3.14F;
        float f2 = 3.14f;

        System.out.println(f1);
        System.out.println(f2);

        double d1 = 1.2345D;
        double d2 = 1.2345d;

        System.out.println(d1);
        System.out.println(d2);

        //单精度
        float f3 = 0.123456789123456789F;
        float f4 = 12345.123456789123456789F;
        float f5 = -12345.123456789123456789F;
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
//        Ctrl + /
//        0.12345679   8位
//        12345.123
//        -12345.123

//        双精度
        double d3 = 0.123456789123456789D;
        double d4 = 12345.123456789123456789D;
        double d5 = -12345.123456789123456789D;

        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

//        0.12345678912345678  17位
//        12345.123456789124
//        -12345.123456789124

        //字符类型： char(2)   用来标识单个字符

        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = '学';
        System.out.println(ch2);

        char ch3 = ' ';
        System.out.println(ch3);

        System.out.println("HelloWorld!");

        //字符串：String类型  ---> 单个字符 好多个组合在一起 就是一个字符串

        String str1 = "AAAA";
        String str2 = "好好学习，天天向上！";

        System.out.println(str1);
        System.out.println(str2);

        //布尔类型： boolean  真-true 假-false
        boolean boo1 = true;
        boolean boo2 = false;

        System.out.println(boo1);
        System.out.println(boo2);

        System.out.println(5>3);
        System.out.println(5<3);


        //变量定义的注意事项：
        //1、在同一个作用范围内，变量名是不允许重复的！
        //2、对于基本数据类型来说，在变量进行使用之前，必须完成赋值操作
        int boo11 = 333;

        //变量的定义 以及 变量的赋值 一起完成了
        int num = 12;
        int num1;
        num1 = 111;
        System.out.println(num);
        System.out.println(num1);

        //输出语句
        //1、直接输出具体的值，常量值
        System.out.println(1);
        System.out.println('A');
        System.out.println(true);
        System.out.println(2.14);
        //2、将某个变量对应的值进行输出
        System.out.println(num);
        //3、输出操作时，在输出内容之前或之后加入一些说明内容
        //   有一个特殊符号：+ 表示拼接作用
        System.out.println("输出的是int类型的值，变量名为num="+num);
        System.out.println("输出的是int类型的值，变量名为num=  "+num+"  注意整数的范围检查！");
    }
}
