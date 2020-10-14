package top.yunp.runnable_demo;

public class Imp_Thread extends Thread{

    @Override
    public void run() {


        System.out.println("这里的代码是在继承Thread类 ---中执行的！");
        System.out.println("继承Thread类 ---id == "+Thread.currentThread().getId());
        System.out.println("继承Thread类 ---name == "+Thread.currentThread().getName());


    }
}
