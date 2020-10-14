package top.yunp.server;

import top.yunp.thread.File_Runnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileServer {

    public static void doReceiveFilesByThread(int port, String dir) throws IOException {

        ServerSocket ss = new ServerSocket(port);
        System.out.println("服务器端已经开启！");

        ExecutorService pool = Executors.newFixedThreadPool(5);

        while (true)
        {
            Socket sk = ss.accept();

            File_Runnable fr = new File_Runnable(sk,dir);
//            Thread th = new Thread(fr);
//            th.start();
            pool.submit(fr);
        }

    }
}
