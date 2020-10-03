package top.yunp.modifydemo.modify2;

import top.yunp.modifydemo.modify1.Person;
import top.yunp.modifydemo.modify1.Student;

public class StudentTest {

    public static void main(String[] args)
    {

        Person p1 = new Person();
        p1.name = "张三";
//        p1.age = 19;
//        p1.sex = "男";


        System.out.println(p1);

        p1.eat();
//        p1.sleep();
//        p1.study();

        Teacher tea = new Teacher();
        tea.doJob();



    }
}
