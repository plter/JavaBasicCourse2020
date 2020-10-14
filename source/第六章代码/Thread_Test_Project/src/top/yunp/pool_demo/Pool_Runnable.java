package top.yunp.pool_demo;

public class Pool_Runnable implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"AAAAAA");
    }
}
