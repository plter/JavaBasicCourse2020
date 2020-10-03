package top.yunp.numberdemo;

import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.Integer;

public class NumberTest {

    public static void main(String[] args)
    {

        /**
         * 对于基本数据类型：
         *  整数： byte short int long
         *  浮点数： float double
         *
         *  引用数据类型：
         *  Byte Short Integer Long
         *  Float Double
         */

//        成员变量
//        static int 	MAX_VALUE
//        static int 	MIN_VALUE


        //java.lang这个包 不需要 import
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        成员方法

//        1、static int 	compare​(int x, int y)

        int result = Integer.compare(20,10);
        System.out.println("result == "+result);
//        result == -1    10 20   第一个参数小于第二个参数时，返回-1
//        result == 0     10 10   两个参数相等时，返回0
//        result == 1     20 10   第一个参数大于第二个参数时，返回+1

//        2、int 	compareTo​(Integer anotherInteger)

        Integer num1 = new Integer(2);
        Integer num2 = new Integer("2");
//        对于Integer构造方法，如果传入了非数字的字符串，会导致这个异常出现
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "Q"
//            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//            at java.base/java.lang.Integer.parseInt(Integer.java:652)
//            at java.base/java.lang.Integer.<init>(Integer.java:1096)
//            at top.yunp.numberdemo.NumberTest.main(NumberTest.java:43)


        result = num1.compareTo(num2);
        System.out.println("result == "+result);
//        result == -1
//        result == 1
//        result == 0

//        3、由基本数据类型 到 他们对应的引用数据类型
//          int --> Integer  long --> Long
//          由基本数据类型 到 对应的引用数据类型 这个过程称为 装箱 自动
//        int 	intValue()
//        long 	longValue()

//        Integer num3 = new Integer(20);
        Integer num3 = 20;  //自动装箱的过程

        int num4 = num3.intValue();
        System.out.println("num4 == "+num4);

        long num5 = num3.longValue();
        System.out.println("num5 == "+num5);

        int num6 = num3 + 20; //自动拆箱过程
        System.out.println("num6 == "+num6);

//        4、
//        static int 	max​(int a, int b)
//        static int 	min​(int a, int b)

        result = Integer.max(11,22);
        System.out.println("两者比较大的是："+result);
        result = Integer.min(11,22);
        System.out.println("两者比较小的是："+result);

        Integer num7 = 12;
        Integer num8 = 32;
        result = Integer.max(num7,num8);
        System.out.println("利用自动拆箱并比较大小：较大的是："+result);

//        5、
//        static int 	parseInt​(String s)
//        static int 	parseInt​(String s, int radix)

        result = Integer.parseInt("1");
        System.out.println("字符串解析后的数字是："+result);
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
//        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//        at java.base/java.lang.Integer.parseInt(Integer.java:652)
//        at java.base/java.lang.Integer.parseInt(Integer.java:770)
//        at top.yunp.numberdemo.NumberTest.main(NumberTest.java:94)

        //十六进制  0-9 ABCDEF   AFFF
        result = Integer.parseInt("A",16);
        System.out.println("按照指定的进制，字符串解析后的数字是："+result);

        result = Integer.parseInt("101",2);
//                                   4 0 1
        System.out.println("按照指定的进制，字符串解析后的数字是："+result);

        result = Integer.parseInt("a",16);
        System.out.println("按照指定的进制，字符串解析后的数字是："+result);

//        Exception in thread "main" java.lang.NumberFormatException: For input string: "z"
//            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//            at java.base/java.lang.Integer.parseInt(Integer.java:652)
//            at top.yunp.numberdemo.NumberTest.main(NumberTest.java:110)

//        6、
//        static Integer 	valueOf​(String s)
//        static Integer 	valueOf​(String s, int radix)

        Integer num9 =Integer.valueOf("1");
        System.out.println("num9 == "+num9);

        Integer num10 =Integer.valueOf("A",16);
        System.out.println("num10 == "+num10);

        int num11 = Integer.parseInt("1");
        Integer num12 = num11;

        Integer num13 = Integer.valueOf("1");


        /**
         * 测试一下Double
         */
//        static double 	max​(double a, double b)
//        static double 	min​(double a, double b)
        Double dou1 = 2.34;
        Double dou2 = 1.23;

        double dou3 = Double.max(dou1,dou2);
        System.out.println("double 类型比较大小，较大的是："+dou3);

//        static double 	parseDouble​(String s)
        Double dou4 = Double.parseDouble("1.11");
        System.out.println("double 进行解析后的数据是："+dou4);

//        Exception in thread "main" java.lang.NumberFormatException: For input string: "1.11A"
//            at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//            at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
//            at java.base/java.lang.Double.parseDouble(Double.java:543)
//            at top.yunp.numberdemo.NumberTest.main(NumberTest.java:146)

        Double dou5 = Double.parseDouble("1.123456789123456789123456789");
        System.out.println("double 进行解析后的数据是："+dou5);

        double dou6 = 1.123456789123456789123456789;

//        static int 	compare​(char x, char y)

        int chch = Character.compare('B','A');
        System.out.println("chch == "+chch);

        //ASCII码表   A-65  B-66




    }

}
