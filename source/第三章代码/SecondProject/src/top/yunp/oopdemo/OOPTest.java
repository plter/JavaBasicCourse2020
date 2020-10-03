package top.yunp.oopdemo;

/**
 * 这里 去使用 Java类
 *
 * OOP : Object Oriented Programming
 */
public class OOPTest {

    public static void main(String[] args)
    {
        Worker wk1 = new Worker("张三",20,"男",1.85,"钳工",5);

        System.out.println(wk1.toString());

        wk1.eat();
        wk1.sleep();
        wk1.doJob();

//        Person p1 = new Person();
//        System.out.println(p1);

        int result = Person.sum(10,20);

        System.out.println("result == "+result);
    }
}
