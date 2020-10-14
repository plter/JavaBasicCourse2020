package top.yunp.safe_demo.safe_a;

/**
 * 当前这个类表示 红包
 *
 * 1、成员变量  表示红包金额
 * 2、成员方法  表示抢红包功能
 */
public class Lucky_Money {

    public int money = 100;

    public void reduceMoney()
    {
        if(money > 0)
        {
            money--;
            System.out.println("红包剩余："+money);
        }
    }
}
