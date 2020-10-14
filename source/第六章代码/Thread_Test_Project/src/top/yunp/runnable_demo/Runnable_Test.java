package top.yunp.runnable_demo;

public class Runnable_Test {

    public static void main(String[] args)
    {

        //Thread类的子类来创建 子线程
        //匿名对象
        //Student stu = new Student();
//        new Thread(){
//            @Override
//            public void run() {
//
//                System.out.println("匿名对象中 重写 run方法！！");
//                System.out.println("匿名对象中 ---id == "+Thread.currentThread().getId());
//                System.out.println("匿名对象中 ---name == "+Thread.currentThread().getName());
//            }
//        }.start();

//        new Thread(new Runnable() {
//            //这里是重写的Runnable中run方法
//            @Override
//            public void run() {
//                System.out.println("BBBBB");
//            }
//        }){
//            //这里重写的是Thread类的run方法
//            @Override
//            public void run() {
//
//                System.out.println("AAAAA");
//            }
//        }.start();

        /**
         * 1、继承、实现
         * 2、重写规则
         * 3、super
         * 4、源码分析
         * 5、这个操作中 只是 new Thread 了一次，所以只有一个线程！！
         */
        new Thread(new Runnable() {
            //这里是重写的Runnable中run方法
            @Override
            public void run() {
                System.out.println("BBBBB");
                System.out.println("id == "+Thread.currentThread().getId());
                System.out.println("name == "+Thread.currentThread().getName());
            }
        }){
            //这里是对Thread类的run方法重写
            @Override
            public void run() {
                super.run();
                System.out.println("AAAAA");
                System.out.println("id == "+Thread.currentThread().getId());
                System.out.println("name == "+Thread.currentThread().getName());
            }
        }.start();


    }
}
