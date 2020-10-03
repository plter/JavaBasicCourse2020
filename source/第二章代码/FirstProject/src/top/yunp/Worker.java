package top.yunp;

/**
 * 对于一个Java类书写时，需要写出的几个基础组成部分
 */
public class Worker {

    //属性特征 ---> 成员变量 ---> 私有化

    //无参构造方法

    //有参构造方法

    //配合属性 提供 一系列的 set、get方法

    //行为功能 ---> 当前类代表了 某类角色，这类角色所具有的基本功能

    //toString --> 将当前类的某个实例独享的 成员变量信息 组成一个字符串 直接输出 方便查看

    //代码块 ： {}   构造代码块   局部代码块   静态代码块

    //构造代码块
    {
        //构造代码块：跟着构造方法的使用同时执行的！
        //将多个构造方法中相同的代码逻辑进行一个抽取
       System.out.println("构造代码块");


    }

    private static String country;
    private String name;
    private int age;
    private String sex;

    public Worker()
    {

    }

    public Worker(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public Worker(String name, String sex)
    {
        this.name =name;
        this.sex = sex;
    }
    //静态代码块
    static
    {
        System.out.println("静态代码块");
        country = "中国";
    }

    public void doJob()
    {
        //局部代码块
        {
            //超出代码块的范围之后 变量则失效， 利于系统的内存回收
            int a = 10;
            System.out.println("局部代码块");
        }

        //int b = a;
    }

    public static void sum(int a ,int b )
    {
        int c= a+b;
        System.out.println("c == "+c);
    }


    @Override
    public String toString() {
        return "Worker{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
