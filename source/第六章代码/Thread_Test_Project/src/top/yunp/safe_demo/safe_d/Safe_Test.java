package top.yunp.safe_demo.safe_d;

public class Safe_Test {

    /**
     * 需求： 通过多线程模拟抢红包操作
     *
     * 分析：
     *      红包： 变量  int  100
     *      抢红包的人：  Thread
     *            每个人可用无限次强红包  为了方便 每次只能抢到1元
     *
     * 线程安全问题的产生原因：
     *
     *      1、Java代码操作的非原子性
     *          money--;   money = money - 1;
     *
     *          money = 10;
     *      2、操作系统分配时间片的随机性导致的
     *          张三  李四   王五
     *
     *      3、程序中存在多个线程共同执行
     *
     *      4、多个线程必须共同操作同一个数据
     *
     * 解决：
     *
     *      1、加上锁
     *
     *      2、直接使用支持线程安全的API  java.util.concurrent
     */

    public static void main(String[] args)
    {

        Person_Runnable p1 = new Person_Runnable();
        Thread th1 = new Thread(p1);
        th1.start();

        Person_Runnable p2 = new Person_Runnable();
        Thread th2 = new Thread(p2);
        th2.start();

        Person_Runnable p3 = new Person_Runnable();
        Thread th3 = new Thread(p3);
        th3.start();

        Person_Runnable p4 = new Person_Runnable();
        Thread th4 = new Thread(p4);
        th4.start();

        Person_Runnable p5 = new Person_Runnable();
        Thread th5 = new Thread(p5);
        th5.start();













































//        Thread-0---红包剩余：99
//        Thread-0---红包剩余：98
//        Thread-0---红包剩余：97
//        Thread-0---红包剩余：96
//        Thread-4---红包剩余：95
//        Thread-1---红包剩余：94
//        Thread-3---红包剩余：93
//        Thread-3---红包剩余：92
//        Thread-3---红包剩余：91
//        Thread-2---红包剩余：90
//        Thread-2---红包剩余：89
//        Thread-3---红包剩余：88
//        Thread-3---红包剩余：87
//        Thread-3---红包剩余：86
//        Thread-3---红包剩余：85
//        Thread-1---红包剩余：84
//        Thread-1---红包剩余：83
//        Thread-4---红包剩余：82
//        Thread-4---红包剩余：81
//        Thread-0---红包剩余：80
//        Thread-0---红包剩余：79
//        Thread-0---红包剩余：78
//        Thread-0---红包剩余：77
//        Thread-0---红包剩余：76
//        Thread-0---红包剩余：75
//        Thread-4---红包剩余：74
//        Thread-4---红包剩余：73
//        Thread-4---红包剩余：72
//        Thread-1---红包剩余：71
//        Thread-1---红包剩余：70
//        Thread-1---红包剩余：69
//        Thread-1---红包剩余：68
//        Thread-1---红包剩余：67
//        Thread-3---红包剩余：66
//        Thread-3---红包剩余：65
//        Thread-3---红包剩余：64
//        Thread-2---红包剩余：63
//        Thread-3---红包剩余：62
//        Thread-3---红包剩余：61
//        Thread-3---红包剩余：60
//        Thread-3---红包剩余：59
//        Thread-3---红包剩余：58
//        Thread-3---红包剩余：57
//        Thread-3---红包剩余：56
//        Thread-3---红包剩余：55
//        Thread-3---红包剩余：54
//        Thread-1---红包剩余：53
//        Thread-1---红包剩余：52
//        Thread-4---红包剩余：51
//        Thread-4---红包剩余：50
//        Thread-0---红包剩余：49
//        Thread-4---红包剩余：48
//        Thread-1---红包剩余：47
//        Thread-1---红包剩余：46
//        Thread-1---红包剩余：45
//        Thread-1---红包剩余：44
//        Thread-3---红包剩余：43
//        Thread-3---红包剩余：42
//        Thread-2---红包剩余：41
//        Thread-2---红包剩余：40
//        Thread-3---红包剩余：39
//        Thread-1---红包剩余：38
//        Thread-4---红包剩余：37
//        Thread-4---红包剩余：36
//        Thread-4---红包剩余：35
//        Thread-4---红包剩余：34
//        Thread-4---红包剩余：33
//        Thread-0---红包剩余：32
//        Thread-4---红包剩余：31
//        Thread-4---红包剩余：30
//        Thread-1---红包剩余：29
//        Thread-3---红包剩余：28
//        Thread-2---红包剩余：27
//        Thread-3---红包剩余：26
//        Thread-1---红包剩余：25
//        Thread-1---红包剩余：24
//        Thread-1---红包剩余：23
//        Thread-4---红包剩余：22
//        Thread-0---红包剩余：21
//        Thread-0---红包剩余：20
//        Thread-4---红包剩余：19
//        Thread-1---红包剩余：18
//        Thread-1---红包剩余：17
//        Thread-1---红包剩余：16
//        Thread-1---红包剩余：15
//        Thread-1---红包剩余：14
//        Thread-1---红包剩余：13
//        Thread-1---红包剩余：12
//        Thread-1---红包剩余：11
//        Thread-1---红包剩余：10
//        Thread-3---红包剩余：9
//        Thread-2---红包剩余：8
//        Thread-3---红包剩余：7
//        Thread-3---红包剩余：6
//        Thread-3---红包剩余：5
//        Thread-1---红包剩余：4
//        Thread-4---红包剩余：3
//        Thread-0---红包剩余：2
//        Thread-0---红包剩余：1
//        Thread-0---红包剩余：0

















//        Thread-0---红包剩余：99
//        Thread-0---红包剩余：98
//        Thread-0---红包剩余：97
//        Thread-0---红包剩余：96
//        Thread-0---红包剩余：95
//        Thread-0---红包剩余：94
//        Thread-0---红包剩余：93
//        Thread-0---红包剩余：92
//        Thread-0---红包剩余：91
//        Thread-0---红包剩余：90
//        Thread-0---红包剩余：89
//        Thread-0---红包剩余：88
//        Thread-0---红包剩余：87
//        Thread-0---红包剩余：86
//        Thread-0---红包剩余：85
//        Thread-0---红包剩余：84
//        Thread-0---红包剩余：83
//        Thread-0---红包剩余：82
//        Thread-0---红包剩余：81
//        Thread-0---红包剩余：80
//        Thread-0---红包剩余：79
//        Thread-0---红包剩余：78
//        Thread-0---红包剩余：77
//        Thread-0---红包剩余：76
//        Thread-0---红包剩余：75
//        Thread-0---红包剩余：74
//        Thread-0---红包剩余：73
//        Thread-0---红包剩余：72
//        Thread-0---红包剩余：71
//        Thread-0---红包剩余：70
//        Thread-0---红包剩余：69
//        Thread-0---红包剩余：68
//        Thread-0---红包剩余：67
//        Thread-0---红包剩余：66
//        Thread-0---红包剩余：65
//        Thread-0---红包剩余：64
//        Thread-0---红包剩余：63
//        Thread-0---红包剩余：62
//        Thread-0---红包剩余：61
//        Thread-0---红包剩余：60
//        Thread-0---红包剩余：59
//        Thread-0---红包剩余：58
//        Thread-0---红包剩余：57
//        Thread-0---红包剩余：56
//        Thread-0---红包剩余：55
//        Thread-0---红包剩余：54
//        Thread-0---红包剩余：53
//        Thread-0---红包剩余：52
//        Thread-0---红包剩余：51
//        Thread-0---红包剩余：50
//        Thread-0---红包剩余：49
//        Thread-0---红包剩余：48
//        Thread-0---红包剩余：47
//        Thread-0---红包剩余：46
//        Thread-0---红包剩余：45
//        Thread-0---红包剩余：44
//        Thread-0---红包剩余：43
//        Thread-0---红包剩余：42
//        Thread-0---红包剩余：41
//        Thread-0---红包剩余：40
//        Thread-0---红包剩余：39
//        Thread-0---红包剩余：38
//        Thread-0---红包剩余：37
//        Thread-0---红包剩余：36
//        Thread-0---红包剩余：35
//        Thread-0---红包剩余：34
//        Thread-0---红包剩余：33
//        Thread-0---红包剩余：32
//        Thread-0---红包剩余：31
//        Thread-0---红包剩余：30
//        Thread-0---红包剩余：29
//        Thread-0---红包剩余：28
//        Thread-0---红包剩余：27
//        Thread-0---红包剩余：26
//        Thread-0---红包剩余：25
//        Thread-0---红包剩余：24
//        Thread-0---红包剩余：23
//        Thread-0---红包剩余：22
//        Thread-0---红包剩余：21
//        Thread-0---红包剩余：20
//        Thread-0---红包剩余：19
//        Thread-0---红包剩余：18
//        Thread-0---红包剩余：17
//        Thread-0---红包剩余：16
//        Thread-0---红包剩余：15
//        Thread-0---红包剩余：14
//        Thread-0---红包剩余：13
//        Thread-0---红包剩余：12
//        Thread-0---红包剩余：11
//        Thread-0---红包剩余：10
//        Thread-0---红包剩余：9
//        Thread-0---红包剩余：8
//        Thread-0---红包剩余：7
//        Thread-0---红包剩余：6
//        Thread-0---红包剩余：5
//        Thread-0---红包剩余：4
//        Thread-0---红包剩余：3
//        Thread-0---红包剩余：2
//        Thread-0---红包剩余：1
//        Thread-0---红包剩余：0






    }
}
