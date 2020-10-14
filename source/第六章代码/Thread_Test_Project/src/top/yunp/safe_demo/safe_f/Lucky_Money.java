package top.yunp.safe_demo.safe_f;

/**
 * 当前这个类表示 红包
 *
 * 1、成员变量  表示红包金额
 * 2、成员方法  表示抢红包功能
 */
public class Lucky_Money {

    public static int money = 100;

    /**
     * synchronized 在方法声明上时，对应的锁对象依然存在，这个时候 谁调用这个方法 这个锁对象就是谁？
     * 代码使用的是 lm对象， 说明锁对象是 lm ，lm.reduceMoney();
     */
    public synchronized void reduceMoney()
    {


        if (money > 0) {
            money--;
            System.out.println(Thread.currentThread().getName() + "---红包剩余：" + money);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}












































//        Thread-0---红包剩余：99
//        Thread-3---红包剩余：98
//        Thread-3---红包剩余：97
//        Thread-3---红包剩余：96
//        Thread-3---红包剩余：95
//        Thread-3---红包剩余：94
//        Thread-1---红包剩余：93
//        Thread-4---红包剩余：92
//        Thread-2---红包剩余：91
//        Thread-4---红包剩余：90
//        Thread-1---红包剩余：89
//        Thread-3---红包剩余：88
//        Thread-0---红包剩余：87
//        Thread-3---红包剩余：86
//        Thread-3---红包剩余：85
//        Thread-3---红包剩余：84
//        Thread-1---红包剩余：83
//        Thread-4---红包剩余：82
//        Thread-2---红包剩余：81
//        Thread-4---红包剩余：80
//        Thread-1---红包剩余：79
//        Thread-1---红包剩余：78
//        Thread-3---红包剩余：77
//        Thread-3---红包剩余：76
//        Thread-3---红包剩余：75
//        Thread-0---红包剩余：74
//        Thread-3---红包剩余：73
//        Thread-1---红包剩余：72
//        Thread-1---红包剩余：71
//        Thread-4---红包剩余：70
//        Thread-4---红包剩余：69
//        Thread-2---红包剩余：68
//        Thread-4---红包剩余：67
//        Thread-4---红包剩余：66
//        Thread-1---红包剩余：65
//        Thread-3---红包剩余：64
//        Thread-0---红包剩余：63
//        Thread-3---红包剩余：62
//        Thread-1---红包剩余：61
//        Thread-4---红包剩余：60
//        Thread-4---红包剩余：59
//        Thread-2---红包剩余：58
//        Thread-4---红包剩余：57
//        Thread-4---红包剩余：56
//        Thread-1---红包剩余：55
//        Thread-3---红包剩余：54
//        Thread-0---红包剩余：53
//        Thread-3---红包剩余：52
//        Thread-1---红包剩余：51
//        Thread-1---红包剩余：50
//        Thread-4---红包剩余：49
//        Thread-2---红包剩余：48
//        Thread-2---红包剩余：47
//        Thread-4---红包剩余：46
//        Thread-1---红包剩余：45
//        Thread-3---红包剩余：44
//        Thread-0---红包剩余：43
//        Thread-3---红包剩余：42
//        Thread-3---红包剩余：41
//        Thread-3---红包剩余：40
//        Thread-3---红包剩余：39
//        Thread-1---红包剩余：38
//        Thread-4---红包剩余：37
//        Thread-2---红包剩余：36
//        Thread-2---红包剩余：35
//        Thread-4---红包剩余：34
//        Thread-1---红包剩余：33
//        Thread-3---红包剩余：32
//        Thread-0---红包剩余：31
//        Thread-3---红包剩余：30
//        Thread-1---红包剩余：29
//        Thread-4---红包剩余：28
//        Thread-2---红包剩余：27
//        Thread-2---红包剩余：26
//        Thread-2---红包剩余：25
//        Thread-2---红包剩余：24
//        Thread-2---红包剩余：23
//        Thread-4---红包剩余：22
//        Thread-1---红包剩余：21
//        Thread-3---红包剩余：20
//        Thread-3---红包剩余：19
//        Thread-0---红包剩余：18
//        Thread-3---红包剩余：17
//        Thread-1---红包剩余：16
//        Thread-4---红包剩余：15
//        Thread-2---红包剩余：14
//        Thread-4---红包剩余：13
//        Thread-1---红包剩余：12
//        Thread-3---红包剩余：11
//        Thread-3---红包剩余：10
//        Thread-0---红包剩余：9
//        Thread-3---红包剩余：8
//        Thread-3---红包剩余：7
//        Thread-1---红包剩余：6
//        Thread-1---红包剩余：5
//        Thread-4---红包剩余：4
//        Thread-2---红包剩余：3
//        Thread-2---红包剩余：2
//        Thread-2---红包剩余：1
//        Thread-4---红包剩余：0








