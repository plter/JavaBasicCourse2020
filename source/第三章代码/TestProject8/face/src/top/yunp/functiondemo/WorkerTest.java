package top.yunp.functiondemo;

public class WorkerTest {

    public static void main(String[] args)
    {

//        doFunction();


        doMath();

    }


    public static void doMath()
    {

        Worker.doWork( (int a, int b)->{return a+b;} );
        Worker.doWork( (a,b)->{return a-b;} );
        Worker.doWork( (a,b)-> a*b );

        //             这里理解成为某种计算规则
//        Worker.doWork(a->a*100 );



    }



}
