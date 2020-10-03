package top.yunp.oopdemo.abstractdemo;

public class Cat extends Animal{


    public Cat()
    {
        super();
    }
    public Cat(String name,int age,String sex,double high)
    {
        super(name,age,sex,high);
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.high = high;
    }

    @Override
    public void play() {

    }
}
