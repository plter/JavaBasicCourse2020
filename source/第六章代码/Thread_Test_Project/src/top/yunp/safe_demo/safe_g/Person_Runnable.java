package top.yunp.safe_demo.safe_g;

public class Person_Runnable implements Runnable{


    @Override
    public void run() {


        while(Lucky_Money.money > 0)
        {
            Lucky_Money.reduceMoney();
        }

    }
}
