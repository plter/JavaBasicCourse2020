package top.yunp.safe_demo.safe_e;

public class Person_Runnable implements Runnable{

    private Lucky_Money lm;

    public Person_Runnable(Lucky_Money lm)
    {
        this.lm = lm;
    }

    @Override
    public void run() {


        while(Lucky_Money.money > 0)
        {
            lm.reduceMoney();
        }

    }
}













































































//Thread-0---红包剩余：99
//        Thread-0---红包剩余：98
//        Thread-3---红包剩余：97
//        Thread-4---红包剩余：96
//        Thread-4---红包剩余：95
//        Thread-2---红包剩余：94
//        Thread-2---红包剩余：93
//        Thread-1---红包剩余：92
//        Thread-1---红包剩余：91
//        Thread-1---红包剩余：90
//        Thread-2---红包剩余：89
//        Thread-4---红包剩余：88
//        Thread-3---红包剩余：87
//        Thread-0---红包剩余：86
//        Thread-3---红包剩余：85
//        Thread-4---红包剩余：84
//        Thread-4---红包剩余：83
//        Thread-4---红包剩余：82
//        Thread-4---红包剩余：81
//        Thread-4---红包剩余：80
//        Thread-4---红包剩余：79
//        Thread-4---红包剩余：78
//        Thread-4---红包剩余：77
//        Thread-4---红包剩余：76
//        Thread-4---红包剩余：75
//        Thread-4---红包剩余：74
//        Thread-4---红包剩余：73
//        Thread-4---红包剩余：72
//        Thread-4---红包剩余：71
//        Thread-4---红包剩余：70
//        Thread-4---红包剩余：69
//        Thread-4---红包剩余：68
//        Thread-4---红包剩余：67
//        Thread-2---红包剩余：66
//        Thread-2---红包剩余：65
//        Thread-2---红包剩余：64
//        Thread-2---红包剩余：63
//        Thread-1---红包剩余：62
//        Thread-1---红包剩余：61
//        Thread-2---红包剩余：60
//        Thread-4---红包剩余：59
//        Thread-4---红包剩余：58
//        Thread-3---红包剩余：57
//        Thread-3---红包剩余：56
//        Thread-0---红包剩余：55
//        Thread-0---红包剩余：54
//        Thread-0---红包剩余：53
//        Thread-0---红包剩余：52
//        Thread-3---红包剩余：51
//        Thread-4---红包剩余：50
//        Thread-4---红包剩余：49
//        Thread-4---红包剩余：48
//        Thread-4---红包剩余：47
//        Thread-2---红包剩余：46
//        Thread-2---红包剩余：45
//        Thread-1---红包剩余：44
//        Thread-2---红包剩余：43
//        Thread-2---红包剩余：42
//        Thread-2---红包剩余：41
//        Thread-2---红包剩余：40
//        Thread-4---红包剩余：39
//        Thread-4---红包剩余：38
//        Thread-4---红包剩余：37
//        Thread-4---红包剩余：36
//        Thread-4---红包剩余：35
//        Thread-4---红包剩余：34
//        Thread-3---红包剩余：33
//        Thread-3---红包剩余：32
//        Thread-0---红包剩余：31
//        Thread-0---红包剩余：30
//        Thread-3---红包剩余：29
//        Thread-3---红包剩余：28
//        Thread-4---红包剩余：27
//        Thread-2---红包剩余：26
//        Thread-2---红包剩余：25
//        Thread-1---红包剩余：24
//        Thread-1---红包剩余：23
//        Thread-1---红包剩余：22
//        Thread-2---红包剩余：21
//        Thread-2---红包剩余：20
//        Thread-2---红包剩余：19
//        Thread-2---红包剩余：18
//        Thread-2---红包剩余：17
//        Thread-2---红包剩余：16
//        Thread-2---红包剩余：15
//        Thread-4---红包剩余：14
//        Thread-4---红包剩余：13
//        Thread-3---红包剩余：12
//        Thread-0---红包剩余：11
//        Thread-0---红包剩余：10
//        Thread-3---红包剩余：9
//        Thread-4---红包剩余：8
//        Thread-4---红包剩余：7
//        Thread-4---红包剩余：6
//        Thread-2---红包剩余：5
//        Thread-1---红包剩余：4
//        Thread-1---红包剩余：3
//        Thread-1---红包剩余：2
//        Thread-1---红包剩余：1
//        Thread-1---红包剩余：0






