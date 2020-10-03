package top.yunp.functiondemo;

public class WorkerTest {

    public static void main(String[] args)
    {

//        doFunction();


        doMath();

    }


    public static void doMath()
    {

//        Worker.doWork( (int a, int b)->{return a+b;} );
//        Worker.doWork( (a,b)->{return a-b;} );
//        Worker.doWork( (a,b)-> a*b );

        //             这里理解成为某种计算规则
        Worker.doWork( a->a*100 );



    }


    public static void doFunction()
    {
        //方式一：实现类
        Worker wk1 = new Worker();
        Im_Technology im1 = new Im_Technology();
        wk1.doJob(im1);

        //方式二：匿名内部类
        Worker wk2 = new Worker();
        wk2.doJob(new Technology() {
            @Override
            public void computer() {
                System.out.println("计算机使用能力 --- 匿名内部类");
            }
        });

        //方式三：函数式编程
        Worker wk3 = new Worker();
        wk3.doJob(  ()->{System.out.println("计算机使用能力 --- 函数式编程");}  );

        /**
         * Lamda表达式
         *
         *  (形式参数列表)->{逻辑代码}
         */
    }
}
