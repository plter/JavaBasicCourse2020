package top.yunp.safe_demo.safe_i;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyData {


    public static HashMap<String,String> data = new HashMap<>();

    public static ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    public static ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    public static ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();

    public static void saveData()
    {
        writeLock.lock();
        System.out.println("经过逻辑处理之后的数据");
        String data1 = "Hello";
        data.put("1",data1);
        writeLock.unlock();
    }

    public static void removeData()
    {
        writeLock.lock();
        System.out.println("符合某种业务逻辑，将要删除数据！");
        data.remove("2");
        writeLock.unlock();
    }

    public static String getData()
    {
        readLock.lock();
        try {
            System.out.println("因为一些逻辑处理，需要获取某个数据");
            String result = data.get("3");
            return result;
        }finally {
            readLock.unlock();
        }

    }

}
