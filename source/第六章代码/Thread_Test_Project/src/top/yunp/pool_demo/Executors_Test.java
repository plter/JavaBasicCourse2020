package top.yunp.pool_demo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_Test {

    public static void main(String[] args) throws InterruptedException {

//        ExecutorService pool1  = Executors.newCachedThreadPool();

        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        pool1.submit(new Pool_Runnable());
//        Thread.sleep(1000);
        pool1.submit(new Pool_Runnable());
        pool1.submit(new Pool_Runnable());
        pool1.submit(new Pool_Runnable());
        pool1.submit(new Pool_Runnable());
        pool1.submit(new Pool_Runnable());
        pool1.submit(new Pool_Runnable());

//        List<Runnable> runnables = pool1.shutdownNow();
        pool1.shutdown();
    }
}
