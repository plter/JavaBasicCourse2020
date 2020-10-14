package top.yunp.safe_demo.safe_h;

public class Person_Runnable implements Runnable{


    public Lucky_Money lm = new Lucky_Money();
    @Override
    public void run() {


        while(Lucky_Money.money > 0)
        {
            lm.reduceMoney();
        }

    }
}
