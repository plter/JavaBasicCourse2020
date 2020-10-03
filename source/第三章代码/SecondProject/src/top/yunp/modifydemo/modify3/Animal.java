package top.yunp.modifydemo.modify3;

import top.yunp.modifydemo.modify1.Student;

public class Animal {

    public final String name = "AAA";

    public int age;

    public String sex;

    public final void eat()
    {
        final String str = "AAA";

        final int a = 10;
//        a = 20;

//                     0x000001111           0x000001111
        final Student student  = new Student();
        student.name = "李四";
//                   0x0000022222
//        student = new Student();

        System.out.println("吃饭");
    }

    public static void doWork()
    {

    }
}
