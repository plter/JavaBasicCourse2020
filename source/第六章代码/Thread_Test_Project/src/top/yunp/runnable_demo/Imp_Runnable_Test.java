package top.yunp.runnable_demo;

public class Imp_Runnable_Test {

    public static void main(String[] args)
    {
        System.out.println("在main方法中执行的代码逻辑");
        System.out.println("id == "+Thread.currentThread().getId());
        System.out.println("name == "+Thread.currentThread().getName());

        Imp_Runnable imp = new Imp_Runnable();
        Thread th1 = new Thread(imp);
        th1.start();

        doJOb();

        /**
         * 方式一：基于Runnable接口
         *
         *      形式一：
         *          1、自定义一个Java类 实现Runnable接口
         *          2、重写Runnable中run方法，在其中编写对应的逻辑
         *          3、通过Thread类构造方法 Thread​(Runnable target)
         *          4、通过Thread类的对象调用 start方法
         *      形式二：
         *          1、匿名内部类
         *
         *      形式三：
         *          1、函数式编程 Lamda表达式
         *          2、
         *          @FunctionalInterface
         *          public interface Runnable
         *                  void 	run()
         *
         *      形式四：
         *          1、直接通过 Thread类来实现  因为Thread类 就是Runnable的子类
         *          2、自定义一个Java类 重写Thread类中run方法
         *          3、通过Thread 的无参构造来创建对象
         *          4、调用start方法
         *
         *  方式二：  基于 Callable
         *
         */

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这里的代码是在匿名内部类的形式！！！中执行的！");
                System.out.println("匿名内部类--id == "+Thread.currentThread().getId());
                System.out.println("匿名内部类--name == "+Thread.currentThread().getName());
            }
        });
        th2.start();

        Thread th3 = new Thread(()->{
            System.out.println("Lamda表达式形式 ---- ！！！中执行的！");
            System.out.println("Lamda表达式形式 ----id == "+Thread.currentThread().getId());
            System.out.println("Lamda表达式形式 ----name == "+Thread.currentThread().getName());
        });
        th3.start();

        Thread th4 = new Imp_Thread();
        th4.start();

        /**
         * 代码的运行顺序
         * 1、代码从main方法开始
         * 2、顺序向下执行，如果遇到 if for 等的逻辑 按照这些逻辑执行
         * 3、如果遇到方法调用 会执行方法中的操作
         * ----> 之前的代码都是单线程的 ，所以上面的顺序是单线程中代码的执行顺序
         *
         * 多线程代码执行顺序
         * 1、即使是多个线程，每个线程都是独立的，在单独的线程中仍然按照之前的逻辑执行
         * 2、如果某一个代码完成了子线程的创建、从创建完成之后，当前的父线程与该子线程
         *    处于一种并行状态运行，彼此之间不相互干扰
         * 3、多个线程开启之后，具体哪个线程执行快，由资源与系统决定，还有当前程序执行的
         *    操作多少。
         *    但是在想控制台输出时，控制台只有一个，谁先执行完成 就先输出内容。
         *
         */
    }

    public static void doJOb()
    {
        System.out.println("DOJOB");
    }
}
