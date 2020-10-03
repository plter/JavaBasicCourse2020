package top.yunp.functiondemo;

/**
 * 这里对Java中接口 进行 加强
 *
 * 1、接口中 只有抽象方法   常量的成员变量
 *
 * 2、好处：
 *
 *   缺点：强耦合  --->
 *
 * 3、从Java8 开始 引入 default、 static
 *
 * 4、函数式接口 --> 指的是 其内部 只有一个抽象方法 的接口！
 *      对于函数式接口 在使用的使用的时候 可以使用Lamda表达式来简化操作
 */
public interface Language {

    public abstract void speakEnglish();

    public abstract void sprakChinese();

    default void speakFrench()
    {
        System.out.println("父接口的 法语基础知识！");
    }

    static void doJob()
    {
       System.out.println("父接口 进行工作");
    }


}
