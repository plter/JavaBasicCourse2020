package top.yunp.oopdemo.abstractdemo;

public class AbstractTest {

    public static void main(String[] args)
    {

        /**
         * 抽象类的组成：
         *
         *      成员变量：
         *      构造方法：
         *           问题： 抽象类 不能创建对象 那么要构造方法 有何用？
         *
         *              在构造方法的第一行 默认会 存在 super()，其作用就是调用父类的无参构造方法
         *              辅助子类去创建对象
         *
         *              一个类对象的创建，需要依赖其父类，直到 Object
         *                  Cat --- cat
         *                      super() --- Animal
         *                                  super()  ---  Object
         *
         *              this:
         *                  this代指当前的Java类
         *                  this()  this(参数列表) --> 可以用来调用当前类的 构造方法
         *                  this: 代指 当前类创建的 某个对象
         *              super:
         *                  代指当前类的父类
         *                  super()  super(参数列表)  ---> 可以用来调用父类 的 构造
         *      非抽象的成员方法：
         *              书写时按照 自定义方法的规则
         *
         *      抽象的成员方法：
         *              格式：
         *                  修饰符 ：abstract
         *                  没有方法体
         *                  方法声明最后 要加上 分号
         *              注意：
         *                  一个抽象类 中 可以没有任何的抽象方法
         *                  如果一个类中 有一个抽象方法 那么这个类 必须标识为 抽象类
         *      代码块
         *          构造代码块
         *          静态代码块
         *          局部代码块
         *
         *  Java普通类组成：
         *
         *      成员变量
         *      成员方法
         *      构造方法
         *      代码块
         *          构造代码块
         *          静态代码块
         *          局部代码块
         *
         *      注意：Java类继承抽象类：
         *          a、实现抽象类中所有的抽象方法
         *          b、将当前类 自己 标识为 abstract 抽象类
         *
         *  =================================================
         *  几个默认：
         *      1、无参构造默认：
         *              一个Java类 默认存在一个无参构造，建议手动写出
         *      2、super()
         *              在构造方法第一行默认存在一行代码  super()
         *              调用的是父类的无参构造，辅助子类创建对象
         *      3、Object
         *              一个Java类直接或者间接的继承自 Object
         *      4、toString
         *              Worker wk = new Worker();
         *              System.out.println(wk);
         *              System.out.println(wk.toString());
         *              在输出某个类的对象时，默认调用了 toString方法
         *
         */


    }
}
