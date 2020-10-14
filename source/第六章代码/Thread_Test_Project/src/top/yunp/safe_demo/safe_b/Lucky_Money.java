package top.yunp.safe_demo.safe_b;

/**
 * 当前这个类表示 红包
 *
 * 1、成员变量  表示红包金额
 * 2、成员方法  表示抢红包功能
 */
public class Lucky_Money {

    public static int money = 100;

    public static void reduceMoney()
    {
        //money = 1
        //张三  时间片耗完
        //李四  时间片耗完
        //王五  时间片耗完
        if(money > 0)
        {
            //张三  时间片 耗完
            //李四  时间片 耗完
            //王五  时间片 耗完

            money--;
            //代码执行的非原子 --->
            //money = money - 1;
            //张三   money = 1   0 将要进行赋值时  时间片 耗完
            //王五   money = 1   0 将要进行赋值时  时间片 耗完
            //李四   money = 1   0 将要赋值时     时间片 耗完

            System.out.println(Thread.currentThread().getName()+"---红包剩余："+money);

            //张三：  0
            //李四：  -1
            //王五：  -2
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
