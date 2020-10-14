package top.yunp.control_demo.join_demo;

public class Thread_join_Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程："+Thread.currentThread().getId());
        System.out.println("主线程："+Thread.currentThread().getName());


        Thread th1 = new Thread(){
            @Override
            public void run() {

                System.out.println("子线程："+Thread.currentThread().getId());
                System.out.println("子线程："+Thread.currentThread().getName());
                System.out.println("AAAA");
                System.out.println("BBBB");
                System.out.println("CCCC");

            }
        };

        th1.start();

        /**
         * 作用：在某一个线程中调用该方法时，表示当前线程等待 被调用的那个线程执行完成之后 当前线程再去执行
         *
         *     例： main 线程代码中  使用 th1对象调用了 join 那么表示main线程需要等待th1代表的线程执行完成
         *         之后再去执行。
         */
        th1.join();

        //主线程想要等待 子线程执行完成之后 再去执行
        System.out.println("DDDD");
        System.out.println("EEEE");
    }
}
