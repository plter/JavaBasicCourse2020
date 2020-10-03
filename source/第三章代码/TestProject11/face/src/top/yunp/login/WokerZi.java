package top.yunp.login;

import top.yunp.javabean.Worker;

public class WokerZi extends Worker {

    public void doJob()
    {
        name = "李四";
        age = 30;
        System.out.println("name = "+name);
        System.out.println("age == "+age);
//        System.out.println("sex == "+sex);
//        System.out.println("address == "+address);

        eat();
        sleep();

//        study();
//        play();
    }
}
