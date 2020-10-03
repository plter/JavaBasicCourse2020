package top.yunp.modifydemo.modify2;

import top.yunp.modifydemo.modify1.Person;

public class Teacher extends Person {

    public void doJob()
    {
        System.out.println("name == "+name);
        System.out.println("age == "+age);


        eat();
        sleep();

    }

//    @Override
//    void study()
//    {
//        System.out.println(" 学习 -- Person -- 默认修饰");
//    }

}
