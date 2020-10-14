package top.yunp;

public class ThreadTest {

    public static void main(String[] args)
    {


        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        /**
         * 对于进程来说 最终是通过线程来实现的，一个进程 至少存在一个线程！
         *
         * 这个线程是 主线程  main线程
         *
         * 截止到这一时刻之前我们书写的代码都是 “单线程” 程序！
         *
         * ServerSocket  ss =
         *   while(true)
         *       ss.accept()
         *
         * 线程技术的使用 是为了更好的利用CPU资源！
         */
//        int result = 1/0;

        System.out.println("HHHH");

        /**
         * Class Thread
         * Thread类是对应于线程资源的一个抽象，表示成为了一个类！
         *
         * Thread()
         *
         * Thread​(Runnable target)
         * static Thread 	currentThread()
         * long 	getId()
         * String 	getName()
         * void 	start()
         *
         * Interface Runnable
         * @FunctionalInterface
         * public interface Runnable
         * Thread的构造方法需要一个Runnable对象，但是Runnable是一个接口，所以需要实现类
         * 1、自定义一个实现类
         * 2、使用匿名内部类
         * 3、如果是函数式接口  可用使用Lamda表达式
         */

        Thread th1 = Thread.currentThread();
        long th1_id = th1.getId();
        String th1_name = th1.getName();

        System.out.println("id == "+th1_id);
        System.out.println("name == "+th1_name);

        //可用完成创建，但是现在貌似没有加入代码逻辑！
        Thread th2 = new Thread();
        th2.start();
        System.out.println("id == "+th2.getId());
        System.out.println("name == "+th2.getName());


    }
}
