package top.yunp.callable_demo;

import java.util.concurrent.Callable;

public class Imp_Callable implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("Callable的实现类");
        System.out.println("Callable的实现类 ---id == "+Thread.currentThread().getId());
        System.out.println("Callable的实现类 ---name == "+Thread.currentThread().getName());

        return "AAAA";
    }
}
