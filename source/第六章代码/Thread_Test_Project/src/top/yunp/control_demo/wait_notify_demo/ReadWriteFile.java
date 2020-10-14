package top.yunp.control_demo.wait_notify_demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteFile {


    public static BufferedWriter bw = null;
    public static BufferedReader br = null;

//    //此时的锁对象是 当前类的字节码
//    public static synchronized void readFile() throws IOException, InterruptedException {
//
//        String msg = br.readLine();
//
//        /**
//         * Class Object
//         *         void 	notify()
//         *         void 	notifyAll()
//         *         String 	toString()
//         *         void 	wait()
//         *         void 	wait​(long timeoutMillis)
//         */
//
//
//        if(null != msg)
//        {
//            System.out.println("读取到的内容为："+msg);
//        }
//        else
//        {
//            System.out.println("等待读取");
//            ReadWriteFile.class.wait();
//        }
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    static int count = 0;
//    public static synchronized void writeFile() throws IOException {
//
//        String data = "QQQQQ"+count;
//        System.out.println("正在写入："+data);
//        bw.write(data);
//        bw.newLine();
//        bw.flush();
//        count++;
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //如果基于当前锁对象约束的线程 有多个进入wait状态，这个时候可用使用 notifyAll
//        ReadWriteFile.class.notifyAll();
//
//    }


//    public static ReentrantLock lock = new ReentrantLock();
//    public static Condition condition = lock.newCondition();
//
//    /**
//     * Interface Condition
//     * void 	await()
//     * void 	signal()
//     * void 	signalAll()
//     */
//    public static void readFile() throws IOException, InterruptedException {
//        lock.lock();
//        String msg = br.readLine();
//
//        if(null != msg)
//        {
//            System.out.println("读取到的内容为："+msg);
//        }
//        else
//        {
//            System.out.println("等待读取");
//            condition.await();
//        }
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        lock.unlock();
//    }
//
//    static int count = 0;
//    public static void writeFile() throws IOException {
//        lock.lock();
//        String data = "QQQQQ"+count;
//        System.out.println("正在写入："+data);
//        bw.write(data);
//        bw.newLine();
//        bw.flush();
//        count++;
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        condition.signalAll();
//        lock.unlock();
//
//    }



    public static ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    public static ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    public static ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();

    //throw new UnsupportedOperationException()  不可以通过读锁获取Condition对象
    //public static Condition readCondition = readLock.newCondition();
    //对于WriteLock是可以获取Condition对象，但是这个对象是不能用 读线程与写线程之间，他应该用于多个写线程之间。
    //public static Condition writeCondition = writeLock.newCondition();
    //对于ReentrantReadWriteLock这个类的对象 没有提供 newCondition操作
    //public static Condition totalCondition = rwLock.newCondition();

    public static void readFile() throws IOException, InterruptedException {
        readLock.lock();
        String msg = br.readLine();

        if(null != msg)
        {
            System.out.println("读取到的内容为："+msg);
        }
        else
        {
            System.out.println("等待读取");
//            readCondition.await();
            //Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
//            writeCondition.await();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        readLock.unlock();
    }

    static int count = 0;
    public static void writeFile() throws IOException {
        writeLock.lock();
        String data = "QQQQQ"+count;
        System.out.println("正在写入："+data);
        bw.write(data);
        bw.newLine();
        bw.flush();
        count++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        readCondition.signalAll();
//        writeCondition.signalAll();
        writeLock.unlock();

    }

}
