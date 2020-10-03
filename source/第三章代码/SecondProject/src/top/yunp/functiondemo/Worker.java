package top.yunp.functiondemo;

public class Worker {


    public void doJob(Technology toc)
    {
        System.out.println("工作的基本能力需求：");
        toc.computer();
    }

    public static void doWork(MyMath myMath)
    {
        System.out.println("工作需要数学能力");
//        int result = myMath.math(10,20);
        int result = myMath.math(10);
        System.out.println("result == "+result);
    }


}
