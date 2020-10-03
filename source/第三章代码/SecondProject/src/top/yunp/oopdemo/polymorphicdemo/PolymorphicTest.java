package top.yunp.oopdemo.polymorphicdemo;

public class PolymorphicTest {


    public static void main(String[] args)
    {

        //这样书写 依然不是多态
        Student stu = new Student();
        stu.eat();

        //这样才会出现多态
        //向上转型
        Person p1 = new Student();
        p1.eat();

        //强制转换
        Student stu2 = (Student) p1;
        stu2.eat();

        Person p2 = new Teacher();
        p2.eat();

        //代码编译时期 没有出现错误
//        Student stu3 = (Student)p2;
//        stu3.eat();

        //代码运行时期 出现错误 异常
//        Exception in thread "main" java.lang.ClassCastException:
//        class top.yunp.oopdemo.polymorphicdemo.Teacher
//        cannot be cast to
//        class top.yunp.oopdemo.polymorphicdemo.Student
//        (top.yunp.oopdemo.polymorphicdemo.Teacher and top.yunp.oopdemo.polymorphicdemo.Student
//        are in unnamed module of loader 'app')
//        at top.yunp.oopdemo.polymorphicdemo.PolymorphicTest.main(PolymorphicTest.java:25)

        doJob(stu);
        doJob(p1);
        doJob(p2);

//        Worker wk = new Worker();
//        不是Person的子类 是不可以传入
//        doJob(wk);


        /**
         * Java代码的操作过程：
         *
         *  1、编译时期 ---> javac --->  Student.java ---> javac Student.java ---> Student.class
         *                                                      源代码              字节码
         *
         *  2、运行时期 ---> java  --->  java Student ---> 得到结果
         */

    }

    /**
     * 这样 使用 多态的方式 来编写代码 比较灵活 容易扩展
     *
     * 在后续的学习中，Java官方提供的API 大量使用了这种方式
     *
     *  多个Java类之间 肯定有 继承 实现关系
     *
     *
     * @param p
     */
    public static void doJob(Person p)
    {
        if(p instanceof Student)
        {
            System.out.println("传入的是 Student 的对象");
        }
        else if(p instanceof Teacher)
        {
            System.out.println("传入的是 Teacher 的对象");
        }
        else
        {
            System.out.println("出现错误");
        }

    }

    public static void doJob(double d)
    {

    }
}
