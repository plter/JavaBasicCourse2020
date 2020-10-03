package top.yunp.processdemo;

/**
 * 这里讲解关于 面向过程的编程思想
 */
public class ProcessTest {

    public static void main(String[] args)
    {
        /**
         * 问题： 工资结算
         *
         *  1、录入员工的基本信息
         *  2、对于信息进行查验
         *  3、计算工资
         *  4、将工资表输出
         *
         * ====> 将各个步骤 按照一定的顺序 串联在一起
         *
         * 问题：  做平台：
         *   1、商家
         *   2、平台
         *   3、消费者
         *   4、商品
         */

        enterMsg();
        checkMsg();
        mathMsg();
        printMsg();
    }

    public static void enterMsg()
    {
        System.out.println("录入基本信息");
    }

    public static void checkMsg()
    {
        System.out.println("进行信息查验");
    }

    public static void mathMsg()
    {
        System.out.println("计算工资");
    }

    public static void printMsg()
    {
        System.out.println("打印工资");
    }

}
