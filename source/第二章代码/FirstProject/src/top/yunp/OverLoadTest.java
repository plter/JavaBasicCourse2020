package top.yunp;

/**
 * 这里主要讲解 Java自定义方法 中 方法重载
 *
 * 可变长的参数
 */
public class OverLoadTest {

    public static void main(String[] args)
    {
        /**
         * 需求：
         *      定义一个方法 用来完成两个整数的求和
         *      定义一个方法 用来完成两个浮点数的求和
         *      定义一个方法 用来完成三个整数  两个浮点数与一个整数
         *
         * 方法重载：
         *      1、在同一个Java类
         *
         *      2、方法名称相同
         *
         *      3、形式参数列表不同
         *          a、参数的个数不同
         *          或
         *          b、形式参数的对应位置的数据类型不同
         */

        sum(1,2);
        sum(1.1,2.2);
        sum(1,2,3);
        sum(1.1,2.2,3);

        sum(1,2,3,4);

        sum(1.1,2.2,1,2,3,4);
        sum(1.1,2.2,1,2,3,4,5);
    }

    //定义一个方法 用来完成两个整数求和
    /**
     * 修饰符： public static
     * 返回值类型：void
     * 方法名称： sum
     * 形式参数列表： 2  int num1 int num2
     * 方法体：加法
     */
    public static void sum(int num1,int num2)
    {
        int result = num1+num2;

//        int result = 0;

        System.out.println("两个整数的和为："+result);
    }

    public static void sum(double num1, double num2)
    {
        double result = num1+num2;
        System.out.println("两个浮点数的和："+result);
    }

    public static void sum(int num1, int num2, int num3)
    {
        int result = num1+num2+num3;

        System.out.println("三个整数的和为："+result);
    }
//    public static void sum(int num1, int num2, int num3)
//    {
//        int result = num1+num2+num3;
//
//        System.out.println("三个整数的和为："+result);
//    }
    public static void sum(double num1, int num2, int num3)
    {
        double result = num1+num2+num3;

        System.out.println("三个数的和为："+result);
    }
    public static void sum(double num1, double num2, int num3)
    {
        double result = num1+num2+num3;

        System.out.println("三个数的和为："+result);
    }


    /**
     * 可变长 形式参数
     */

    public static void sum(int ... num)
    {
        int sum = 0;

        int len = num.length;

        for(int i =0; i<len; i++)
        {
            sum += num[i];
        }

        System.out.println("可变长的和："+sum);
    }

    public static void sum(double num1,double num2, int ... num)
    {
        int sum = 0;

        int len = num.length;

        for(int i =0; i<len; i++)
        {
            sum += num[i];
        }

        double result = num1+num2+sum;

        System.out.println("可变长的和："+result);
    }

//    public static void sum(double ... num1 ,int ... num2)
//    {
//
//    }

    public static void sum(double ... num)
    {
        double sum = 0;

        int len = num.length;

        for(int i =0; i<len; i++)
        {
            sum += num[i];
        }

        System.out.println("可变长的和："+sum);

    }
}

