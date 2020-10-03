package top.yunp.oopdemo.interfacedemo;

/**
 * 这里讲解的是 Java的接口
 *
 * Java普通类：
 *
 * Java抽象类： 多了一个关于抽象方法的含义
 *
 *      抽象类  有构造方法  但是 不能直接用来创建 抽象类的对象！
 *
 *      创建对象依赖于  子类来完成
 *
 * 想要做?  能否定义一个类，使得其中全部的成员方法 都为抽象方法
 *
 * Java接口：
 *
 *      组成：
 *          成员变量
 *
 *              有：
 *
 *              固定修饰： public static final
 *          成员方法
 *
 *              有： 都是抽象的
 *
 *          构造方法：
 *
 *              接口：不可以用来创建对象
 *
 *              不能有构造方法
 *
 *          代码块
 *
 */
public interface Language {

//    Interface abstract methods cannot have body
//    接口中不可以存在构造方法
//    public Language()
//    {
//
//    }

//    Variable 'name' might not have been initialized
    public static final String name = "AAAA";


//    Interface abstract methods cannot have body
    public abstract void speakEnglish();

    public abstract void speakChinese();
}
