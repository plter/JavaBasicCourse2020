package top.yunp.modifydemo.modify1;

public class PersonTest {

    public static void main(String[] args)
    {

        //在一个类A 中 想要使用 另外一个类B 中 内容 需要怎么做？
        //a、创建对应类B的对象 通过对象来使用 其成员
        //b、直接通过 类B的类名 调用静态的部分

        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 19;
        p1.sex = "男";
//        private 修饰符 表示私有  ---> 在其他类中不可以被访问
//        p1.address = "北京";

        System.out.println(p1);

        p1.eat();
        p1.sleep();
        p1.study();
//        private 修饰符 表示私有  ---> 在其他类中不可以被访问
//        p1.play();

        Student stu = new Student();
        stu.doJob();

    }
}
