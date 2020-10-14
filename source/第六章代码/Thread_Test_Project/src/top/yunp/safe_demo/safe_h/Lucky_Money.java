package top.yunp.safe_demo.safe_h;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 当前这个类表示 红包
 *
 * 1、成员变量  表示红包金额
 * 2、成员方法  表示抢红包功能
 */
public class Lucky_Money {

    public static int money = 100;

    /**
     * public class ReentrantLock extends Object implements Lock, Serializable
     * void 	lock()
     * void 	unlock()
     *
     * 注意：如果使用Lock的对象，对于多个线程 同样也需要同一把锁，这时候没有了之前关于锁对象的选择
     *      但是一定要注意 lock对象 创建了多少次，如果多个线程共同操作同一个数据
     *      这些线程之间必须共用同一个lock对象，否则起不到锁操作的作用，解决不了线程安全问题！！！
     */
    // public ReentrantLock lock = new ReentrantLock();
    public static ReentrantLock lock = new ReentrantLock();
    public void reduceMoney()
    {
        lock.lock();


        if (money > 0) {
            money--;
            System.out.println(Thread.currentThread().getName() + "---红包剩余：" + money);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        lock.unlock();
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








