package top.yunp.runnable_demo;

public class Imp_Runnable_Imp implements  Runnable{
    @Override
    public void run() {
        System.out.println("这里的代码是在Imp_Runnable_Imp中执行的！");
        System.out.println("Imp_Runnable_Imp ---id == "+Thread.currentThread().getId());
        System.out.println("Imp_Runnable_Imp ---name == "+Thread.currentThread().getName());
    }
}
