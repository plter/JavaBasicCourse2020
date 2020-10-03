package top.yunp.oopdemo.abstractdemo;

public abstract class Animal {

    //成员变量
    public String name;
    public int age;
    public String sex;
    public double high;

    //无参构造
    public Animal()
    {
        super();
    }

    //有参构造
    public Animal(String name,int age,String sex,double high)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.high = high;
    }

    static{
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }

    //非抽象的成员方法
    public void eat()
    {
        {
            System.out.println("局部代码块");
        }

        System.out.println("吃饭");
    }

    public void sleep()
    {
        System.out.println("睡觉");
    }

    //抽象的成员方法
    public abstract void play();
}
