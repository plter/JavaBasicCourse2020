package top.yunp;

public class WorkerTest {

    public static void main(String[] args)
    {

        Worker wk1 = new Worker("李四",24);

        wk1.doJob();

        Worker wk2 = new Worker("张三","男");

        wk2.doJob();

        System.out.println(wk1);
        System.out.println(wk2.toString());

        //Worker.doJob();

        wk1.sum(10,20);

        Worker.sum(20,30);

    }
}
