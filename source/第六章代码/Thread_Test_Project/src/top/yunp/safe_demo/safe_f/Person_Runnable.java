package top.yunp.safe_demo.safe_f;

public class Person_Runnable implements Runnable{

    //如果这样来写，lm在每一个Person_Runnable的对象中都对存在一个单独！
    //这样达不到锁的作用！
//    public Lucky_Money lm = new Lucky_Money();

    //将这个变量更改为static修饰是可以的，这个时候 reduceMoney方法 也没有必要使用static修饰 就可以完成加锁操作
    public static Lucky_Money lm = new Lucky_Money();
    @Override
    public void run() {


        while(Lucky_Money.money > 0)
        {
            lm.reduceMoney();
        }

    }
}















































































//        Thread-0---红包剩余：99
//        Thread-0---红包剩余：98
//        Thread-0---红包剩余：97
//        Thread-0---红包剩余：96
//        Thread-4---红包剩余：95
//        Thread-4---红包剩余：94
//        Thread-2---红包剩余：93
//        Thread-2---红包剩余：92
//        Thread-2---红包剩余：91
//        Thread-3---红包剩余：90
//        Thread-3---红包剩余：89
//        Thread-3---红包剩余：88
//        Thread-3---红包剩余：87
//        Thread-3---红包剩余：86
//        Thread-3---红包剩余：85
//        Thread-3---红包剩余：84
//        Thread-3---红包剩余：83
//        Thread-3---红包剩余：82
//        Thread-3---红包剩余：81
//        Thread-3---红包剩余：80
//        Thread-3---红包剩余：79
//        Thread-3---红包剩余：78
//        Thread-1---红包剩余：77
//        Thread-1---红包剩余：76
//        Thread-1---红包剩余：75
//        Thread-1---红包剩余：74
//        Thread-1---红包剩余：73
//        Thread-1---红包剩余：72
//        Thread-1---红包剩余：71
//        Thread-1---红包剩余：70
//        Thread-3---红包剩余：69
//        Thread-2---红包剩余：68
//        Thread-2---红包剩余：67
//        Thread-4---红包剩余：66
//        Thread-0---红包剩余：65
//        Thread-0---红包剩余：64
//        Thread-4---红包剩余：63
//        Thread-2---红包剩余：62
//        Thread-2---红包剩余：61
//        Thread-3---红包剩余：60
//        Thread-3---红包剩余：59
//        Thread-3---红包剩余：58
//        Thread-3---红包剩余：57
//        Thread-3---红包剩余：56
//        Thread-3---红包剩余：55
//        Thread-3---红包剩余：54
//        Thread-3---红包剩余：53
//        Thread-3---红包剩余：52
//        Thread-1---红包剩余：51
//        Thread-3---红包剩余：50
//        Thread-2---红包剩余：49
//        Thread-2---红包剩余：48
//        Thread-2---红包剩余：47
//        Thread-2---红包剩余：46
//        Thread-2---红包剩余：45
//        Thread-2---红包剩余：44
//        Thread-2---红包剩余：43
//        Thread-4---红包剩余：42
//        Thread-4---红包剩余：41
//        Thread-0---红包剩余：40
//        Thread-0---红包剩余：39
//        Thread-4---红包剩余：38
//        Thread-4---红包剩余：37
//        Thread-4---红包剩余：36
//        Thread-2---红包剩余：35
//        Thread-2---红包剩余：34
//        Thread-2---红包剩余：33
//        Thread-2---红包剩余：32
//        Thread-3---红包剩余：31
//        Thread-3---红包剩余：30
//        Thread-3---红包剩余：29
//        Thread-3---红包剩余：28
//        Thread-3---红包剩余：27
//        Thread-3---红包剩余：26
//        Thread-1---红包剩余：25
//        Thread-1---红包剩余：24
//        Thread-3---红包剩余：23
//        Thread-3---红包剩余：22
//        Thread-3---红包剩余：21
//        Thread-3---红包剩余：20
//        Thread-3---红包剩余：19
//        Thread-3---红包剩余：18
//        Thread-3---红包剩余：17
//        Thread-3---红包剩余：16
//        Thread-3---红包剩余：15
//        Thread-3---红包剩余：14
//        Thread-3---红包剩余：13
//        Thread-2---红包剩余：12
//        Thread-2---红包剩余：11
//        Thread-2---红包剩余：10
//        Thread-2---红包剩余：9
//        Thread-2---红包剩余：8
//        Thread-2---红包剩余：7
//        Thread-4---红包剩余：6
//        Thread-4---红包剩余：5
//        Thread-4---红包剩余：4
//        Thread-0---红包剩余：3
//        Thread-0---红包剩余：2
//        Thread-0---红包剩余：1
//        Thread-0---红包剩余：0



