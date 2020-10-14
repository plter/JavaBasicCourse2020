package top.yunp.safe_demo.safe_c;

public class Person_Runnable implements Runnable{


    @Override
    public void run() {


        while(Lucky_Money.money > 0)
        {
            Lucky_Money.reduceMoney();
        }

    }
}
