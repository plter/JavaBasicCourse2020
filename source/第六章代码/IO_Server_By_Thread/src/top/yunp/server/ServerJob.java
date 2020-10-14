package top.yunp.server;

import top.yunp.thread.Socket_Runnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerJob {

    /**
     * 需求：定义一个方法 用来开启ServerSocket 并且准备接受 以及 处理数据
     *
     * 分析：
     *      ServerSocket ss = new ServerSocket(port);
     *      while(true)
     *      {
     *          Socket sk = ss.accept();
     *
     *          服务器开启之后，不断的去接受访问的连接，每一个连接接受之后，将该连接交给单独的线程去处理
     *
     *          sk.getInputStream
     *          sk.getOutputStream
     *      }
     */

    public static void startServer(int port) throws IOException {

        ServerSocket ss = new ServerSocket(port);

        System.out.println("服务器端开启了！");

        while (true)
        {
            Socket sk = ss.accept();
            Socket_Runnable sr = new Socket_Runnable(sk);
            Thread th = new Thread(sr);
            th.start();
        }
    }
}
