package top.yunp.runnable_demo;

public class Imp_Runnable implements Runnable{

    @Override
    public void run() {
        System.out.println("这里的代码是在Runnable中执行的！");
        System.out.println("Runnable实现类 ---id == "+Thread.currentThread().getId());
        System.out.println("Runnable实现类 ---name == "+Thread.currentThread().getName());

        Imp_Runnable_Imp imim = new Imp_Runnable_Imp();
        Thread th1  = new Thread(imim);
        th1.start();
    }
}
