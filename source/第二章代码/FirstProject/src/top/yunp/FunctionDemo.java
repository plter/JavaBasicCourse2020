package top.yunp;


import java.util.Scanner;

/**
 * 这里通过比较复杂的问题处理，使用自定义方法 以及 API-Scanner
 */
public class FunctionDemo {

    //程序入口
    public static void main(String[] args)
    {

        /**
         * 要求：为某个公司开发一个简便的工资结算程序
         *
         * 分析：
         *
         *      人员名单：姓名
         *      工资计算方式：基本工资+绩效工资+奖金
         *
         *      第一层：
         *          人员录入进工资结算系统
         *          工资的计算方式
         *          人的姓名  ---  人的基本工资
         *          绩效工资：公式
         *          奖金：全勤奖
         *
         *          人的姓名 ---  人的基本工资  ---  绩效工资（总额） --- 绩效达标  --- 奖金（Y/N）
         *
         *      第二层：
         *
         *          姓名需要录入：Scanner
         *          基本工资：2000  3000
         *          绩效工资：1000  1500
         *          绩效达标：0.9 0.89
         *          奖金（200）：30是否满勤
         *
         *          录入进来的数据我们需要先保存起来
         *
         *          根据计算的逻辑 将对应的人的具体工资计算出来，并输出到屏幕上
         *
         *
         */

        //调用方法
        System.out.println("欢迎进入工资信息录入界面");

        int total = 3;
        System.out.println();
        System.out.println("第一项录入：姓名");
        String[] myNames = enterName(total);

        System.out.println();
        System.out.println("第二项录入：基本工资");
        int[] myBaseMoney = enterBaseMoney(total);

        System.out.println();
        System.out.println("第三项录入：绩效工资与绩效考核结果");
        double[] myRiseMoney = enterRiseMoney(total);

        System.out.println();
        System.out.println("第四项录入：奖金");
        boolean[] myYN = enterJiang(total);

        System.out.println();
        System.out.println("请确认是否完成了基本信息的录入,请输入YES/NO");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        switch (choice)
        {
            case "YES":
                //张三 1000 900.0 200 --> 2100
                payMoney(total,myNames,myBaseMoney,myRiseMoney,myYN);
                break;
            case "NO":

                break;
            default:
                System.out.println("确认信息录入失败");
                break;
        }






    }

    /**
     * 问题：张三 基本工资：1000 绩效工资：900.0 奖金：200 --> 实发：2100
     *
     * 分析：
     *  修饰符:public static
     *
     *  返回值类型：
     *      有：
     *
     *      无：void
     *  方法名称：
     *      payMoney
     *
     *  形式参数列表：
     *
     *      有：
     *          几个？5
     *          (int count,String[] names,int[] baseMoney,double[] riseMoney,boolean[] yn)
     *
     *      无：
     *  方法体：
     *      匹配：
     *          索引
     *      计算公式：
     *          baseMoney + riseMoney + yn
     */

    public static void payMoney(int count,String[] names,int[] baseMoney,double[] riseMoney,boolean[] yn)
    {
        for(int i =0; i<count; i++)
        {
            String name = names[i];

            int myBaseMoney = baseMoney[i];

            double myRiseMoney = riseMoney[i];

            int money = (yn[i])?200:0;

            double totalMoney = myBaseMoney + myRiseMoney +money;

            System.out.println("姓名："+name+" 基本："+myBaseMoney+" 绩效："+myRiseMoney+" 奖金："+money+" 实发："+totalMoney);
        }
    }


    /**
     * 问题：通过键盘来录入员工的姓名，并将姓名保存下来，为了与后续的工资匹配在一起进行计算
     *
     * 分析：
     *      键盘录入？
     *      String
     *      存在下来？ ---> 数组
     *      如何匹配？
     *
     * 自定义方法：
     *
     *  修饰符：public static
     *
     *  返回值类型：
     *      有：
     *          基本数据类型
     *
     *          引用数据类型
     *              数据类型[] --->  String[]
     *
     *      无：
     *  方法名称：
     *      enterName
     *
     *  形式参数列表：
     *      有：--->
     *          数量：1
     *          参数数据类型：int
     *
     *      无：暂定无 ---> 不成立
     *
     *  方法体：
     *      有什么？  姓名
     *      做什么？  键盘录入  保存
     *      怎么做？  录入多个人  循环
     *
     *
     */
    public static String[] enterName(int count)
    {
        //分析一下代码的基础逻辑
        //我们需要录入多个人的姓名 并将保存姓名的数组返回出去

        String[] names = new String[count];

        //创建类的实例
        Scanner sc = new Scanner(System.in);

        System.out.println("接下来将要录入"+count+"个名字");

        for(int i = 0; i<count ; i++)
        {
            System.out.println("请录入第"+(i+1)+"个名字");
            String name = sc.next();
            //需要将名称保存到数组中

            names[i] = name;
        }

        return names;

    }

    /**
     * 问题： 录入基本工资
     *
     * 修饰符：public static
     * 返回值类型：
     *      有：int[]
     * 方法名称：enterBaseMoney
     * 形式参数列表：
     *      有：int count
     * 方法体：
     *      有什么？
     *      做什么？
     *      怎么做？
     */
    public static int[] enterBaseMoney(int count)
    {
        //1、准备容器 用来存储多个基本工资的数据
        int[] baseMoney = new int[count];

        //2、创建键盘录入的实例
        Scanner sc = new Scanner(System.in);

        System.out.println("接下来将要录入"+count+"个基本工资");
        //3、通过循环逻辑 多次录入数据 并保存
        for(int i = 0; i<count ; i++)
        {
            System.out.println("请录入第"+(i+1)+"个人对应的基本工资");
            //4、录入某个人的基本工资
            int money = sc.nextInt();

            //5、将录入的工资存入 容器中
            baseMoney[i] = money;
        }

        //6、将录入好的数据 返回
        return baseMoney;
    }

    /**
     * 问题： 录入绩效工资，以及对应绩效标准
     *
     * 修饰符：public static
     * 返回值类型：
     *      有：double[]
     * 方法名称：
     *      enterRiseMoney
     * 形式参数列表：
     *      有：  int count
     * 方法体：
     *      在这里需要 分别录入两个数据，一个 int  double
     *      对于录入后的两个数据进行数学运算
     *      将运算后的结果保存 并返回
     *
     */
    public static double[] enterRiseMoney(int count)
    {
        double[] riseMoney = new double[count];

        Scanner sc = new Scanner(System.in);

        System.out.println("接下来将要录入"+count+"个绩效工资与绩效达标");

        for(int i = 0; i<count ; i++)
        {
            System.out.println("请录入第"+(i+1)+"个人对应的绩效工资");
            int rise = sc.nextInt();
            System.out.println("请录入第"+(i+1)+"个人对应的绩效考核值");
            double percent = sc.nextDouble();

            //对于录入后的两个数据进行运算
            double result = rise*percent;

            riseMoney[i] = result;
        }

        return riseMoney;

    }

    /**
     * 问题：录入奖金情况
     *
     * 修饰符： public static
     * 返回值类型：
     *      boolean[]
     * 方法名称：enterJiang
     * 形式参数： int count
     * 方法体：
     *      同上
     */

    public static boolean[] enterJiang(int count)
    {
        boolean[] yn = new boolean[count];

        Scanner sc = new Scanner(System.in);

        System.out.println("接下来将要录入"+count+"个人的奖金情况");

        for(int i =0 ;i < count; i++)
        {
            System.out.println("请录入第"+(i+1)+"个人奖金");
            yn[i] = sc.nextBoolean();
        }

        return yn;
    }

}
