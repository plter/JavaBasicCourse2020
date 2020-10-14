package top.yunp.nio_demo.net_demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RecFile_By_BIO {

    public static void main(String[] args)
    {

    }

    public static void recFile(int port) throws IOException {

        ServerSocket ss = new ServerSocket(port);

        while (true)
        {
            Socket sk = ss.accept();
            //对于接收到的某个客户端的连接分别开启不同的线程
            //1、每个都单独开启
            //2、使用线程池的方式
            Socket_Runnable sr = new Socket_Runnable(sk);
            Thread th1 = new Thread(sr);
            th1.start();
        }
    }
}
