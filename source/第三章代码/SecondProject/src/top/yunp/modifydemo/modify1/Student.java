package top.yunp.modifydemo.modify1;

public class Student extends Person{

    public void doJob()
    {
        System.out.println("name == "+name);
        System.out.println("age == "+age);
        System.out.println("sex == "+sex);
//        对父类私有的成员变量 子类是 不可以继承的 不能调用
//        System.out.println(address);

        eat();
        sleep();
        study();
//        对于父类 私有的成员方法 子类 是不可以继承 也不能调用
//        play();
    }


}
