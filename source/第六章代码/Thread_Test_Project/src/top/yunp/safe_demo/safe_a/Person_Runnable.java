package top.yunp.safe_demo.safe_a;

public class Person_Runnable implements Runnable{

    //作为成员变量，每次创建对象时，都会初始化一次
    Lucky_Money lm = new Lucky_Money();
    @Override
    public void run() {
        //代码在这里的话，每次run方法执行 都会调用一次，导致创建多次对象，每个对象中都有一份单独的数据
        Lucky_Money lm = new Lucky_Money();
        while(lm.money > 0)
        {
            lm.reduceMoney();
        }

    }
}
