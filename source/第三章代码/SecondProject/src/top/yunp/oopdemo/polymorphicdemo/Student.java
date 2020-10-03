package top.yunp.oopdemo.polymorphicdemo;

public class Student extends Person{

    @Override
    public void eat()
    {
        System.out.println("Student --- 四菜一汤");
    }
}
