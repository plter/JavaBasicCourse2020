package top.yunp;

import top.yunp.server.FileServer;
import top.yunp.server.ServerJob;

import java.io.IOException;

public class ServerTest {

    public static void main(String[] args) throws IOException {
        /**
         * 需求：将多线程的知识应用起来
         *      将ServerSocket端 改进为多线程处理
         *
         * 分析：
         *      之前：
         *
         *      Client1  ---> AAA
         *      Client2  ---> BBB
         *
         *      Sever    --->  ss.accept()  单线程
         *                     这个时候就会出现如果多个客户端同时访问，最先到的先处理，其他的等待！
         *
         *      改进：
         *
         *      对于客户端 暂时不需要更多的修改！
         *
         *      对于服务端  是否可以做到对于不同的客户端的访问，单独处理！
         *      想要单独处理，需要应用到线程的知识，多个线程之间是彼此独立！
         *
         */

//        ServerJob.startServer(10009);

        FileServer.doReceiveFilesByThread(10010,"E:/EEEE");
    }
}
