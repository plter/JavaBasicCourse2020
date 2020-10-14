package top.yunp.callable_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable_Test {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("这里是主线程");
        System.out.println("主线程---id == "+Thread.currentThread().getId());
        System.out.println("主线程---name == "+Thread.currentThread().getName());

        /**
         * 准备：
         *      1、Thread类构造  Thread​(Runnable target)
         *      2、使用Runnable的子类 public class FutureTask<V>
         *      3、利用FutureTask 的构造 FutureTask​(Callable<V> callable)
         *         All Implemented Interfaces:
         *         Runnable, Future<V>, RunnableFuture<V>
         *      4、@FunctionalInterface
         *         public interface Callable<V>
         *             V 	call()
         *
         *      5、Future 作为一个任务的封装，其中包含了执行之后的结果
         *
         * 方式二：基于Callable接口  可用具有返回值类型，具体类型可以通过泛型指定
         *
         *      形式一： 通过实现Callable 的实现类
         *           1、创建Callable 的实现类 可用指定泛型
         *           2、重写call方法， 之前run方法中的逻辑 都可以写在这里
         *           3、可用按照需要返回不同类型的数据
         *           4、使用Runnable的官方的子类FutureTask 创建对象 并传入 Callable 的实现类对象
         *           5、使用Thread类的构造方法
         *           6、调用start
         *
         *       形式二：匿名内部类
         *
         *       形式三：函数式编程  Lamda表达式
         *
         *           @FunctionalInterface
         *           public interface Callable<V>
         *                  V 	call()
         *
         *
         */

        Imp_Callable im = new Imp_Callable();
        FutureTask<String> ft = new FutureTask(im);
        Thread th1 = new Thread(ft);
        th1.start();
        //call方法是具有返回操作，返回的内容封装在了 FutureTask中
        System.out.println("子线程执行后的结果在Future中 ： "+ft.get());


        FutureTask<ArrayList<String>> ft2 = new FutureTask<>(new Callable<ArrayList<String>>() {
            @Override
            public ArrayList<String> call() throws Exception {

                ArrayList<String> strs = new ArrayList<>();
                strs.add("AAA");
                strs.add("BBB");
                strs.add("CCC");
                return strs;
            }
        });
        Thread th2 = new Thread(ft2);
        th2.start();
        ArrayList<String> result = ft2.get();
        for(String res : result)
        {
            System.out.println("线程执行后的结果："+res);
        }


        FutureTask<HashMap<String,String>> ft_kv = new FutureTask<>(()->{

            HashMap<String,String> k_v = new HashMap<>();
            k_v.put("1","AAA");
            k_v.put("2","bbb");
            k_v.put("3","ccc");

            return k_v;
        });

        Thread th3 = new Thread(ft_kv);
        th3.start();
        HashMap<String,String> k_vs = ft_kv.get();

        Set<Map.Entry<String, String>> entries = k_vs.entrySet();

        for(Map.Entry<String, String> kv: entries)
        {
            System.out.println("k == "+kv.getKey()+"  v == "+kv.getValue());
        }

    }
}
