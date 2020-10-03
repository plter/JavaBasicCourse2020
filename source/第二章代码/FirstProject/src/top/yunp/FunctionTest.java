package top.yunp;

/**
 * 这里讲解的是Java的自定义方法
 */
public class FunctionTest {

    //程序入口   main方法  函数
    public static void main(String[] args) {
        //这里用来书写代码

//        int sum = 0;
//        for (int i = 1; i <= 10; i++)
//        {
//            sum+=i;
//        }
//        System.out.println("sum == "+sum);

        //自定义方法的使用
        //格式：  方法名称(实际参数列表);
        //无返回值的自定义方法的使用
        sum();


        //书写后续的代码：需要使用 sum计算后的结果
        //对于有返回值的方法的使用：
        //数据类型 变量名 =方法名称(实际参数列表);
        //这里的数据类型： 与自定义方法的返回值类型要一致 int  long  double
        // boolean（不行）
        int result = sumsum();

        System.out.println("result == "+result);


        //有返回值的方法调用的基础之上 还要传递实际参数

        //这里的result表示的是 实际参数
        int res = check(result);

        System.out.println("res == "+res);



        System.out.println("========================================");

        printXing();

        System.out.println("========================================");
        pringOu();

    }

    /**
     * 问题：在求和的结果之上，进行判断，如果超过60 奖励100 如果不超过 仍然是原来的数值
     *
     * 自定义方法：
     *
     *  修饰符： public static
     *
     *  返回值：
     *      有： int
     *
     *  方法名称：
     *      check
     *  形式参数列表：
     *      (形式参数列表)
     *      (参数1,参数2,参数3,....)
     *      (数据类型1 变量名1,数据类型2 变量名2,数据类型3 变量名3,....)
     *      有：
     *          确定有几个：
     *                  1个
     *          确定数据类型：
     *                  int
     *      无：
     *  方法体：
     *      有什么？  条件：60  100  和（未知）
     *      做什么？  加法   return
     *      怎么做？  选择逻辑
     *
     *
     */

    //这里的sum 表示的是 形式参数
    public static int check(int sum)
    {

        if(sum > 50)
        {
            return sum+100;
        }
        else
        {
            return sum;
        }

//        return 0;
    }

    /**
     * 问题：使用自定义方法完成 ，1-10的求和操作，并且将结果输出到屏幕上
     *                      1-n
     * 分析：
     *  修饰符： public static
     *  返回值类型：
     *      返回值？
     *          有：
     *          无: void
     *  方法名称：sum
     *
     *  形式参数列表：
     *      有：
     *
     *      无：暂时无
     *
     *  方法体：
     *      有什么？  1-10
     *      做什么？  求和  输出
     *      怎么做？ 循环
     */

    //方法的定义与书写过程
    public static void sum()
    {
        int sum =0 ;
        for(int i =1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("和："+sum);

        //对于没有返回值的方法，在最后自动添加了return,建议不要书写
        return;
    }


    /**
     * 返回值：
     *  判断：如果后续的代码操作需要当前的方法计算之后的结果，那么当前方法必须具有返回值
     *      有：
     *        值：---> 数据类型
     *
     *        1-10 ：整数加法 ---> 整数（byte 、short  int long）
     *
     *        int
     *      无：
     *
     *  方法体：
     *
     *      需要将结果返回回去
     *
     *      return sum;
     *
     */

    public static int sumsum()
    {
        int sumsum = 0;

        for(int i =1; i<=10;i++)
        {
            sumsum += i;
        }

        return sumsum;
    }


    public static void printXing()
    {
        for(int i =0; i<5; i++)
        {
            for(int j =0;j<10;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pringOu()
    {
        for(int i =1; i<=10; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("偶数："+i);
            }
        }
    }
    /**
     * 自定义方法格式：
     *
     * 修饰符  返回值类型  方法名称(形式参数列表)  ---> 方法声明
     * {
     *     方法体
     * }
     *
     * 修饰符：public static   访问权限修饰符：public(公共的) protected(受保护的) private(私有的) 默认
     *
     * 返回值类型：
     *      返回值：某个功能完成之后的结果
     *
     *          有：
     *
     *          无：
     *
     *      类型：数据类型
     *          基本数据类型（四型8种）
     *              整数： byte short int long
     *              浮点数： float double
     *              字符： char
     *              布尔： boolean
     *          引用数据类型
     *              String
     *              数组
     *              Java类
     *                  官方定义好的类
     *                  程序员自己定义的类
     *          void
     *      方法名称：
     *          类名、方法名、变量名、常量名 ： Java的标识符
     *          A-Z a-z 0-9 $ _ 数字不可以开头 不要与官方的关键字重复
     *          方法名： 一个单词：小写  多个单词： 第一个单词小写 从第二个开始首字母大写
     *
     *      形式参数列表：
     *          形式参数：
     *             在完成功能的时候 需要的前提条件
     *          列表：数量的概念（0-n）
     *
     *      方法体：
     *          具体完成某个功能所需要的编写的代码
     *              有什么？
     *              做什么？
     *              怎么做？
     *
     *
     */



}
