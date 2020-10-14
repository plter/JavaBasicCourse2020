package top.yunp.bio_net_demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReciveMsg_Server {

    public static void doReceive(int port) throws IOException {
        /**
         * ServerSocket​(int port)
         * Socket 	accept()
         */

//        while(true)
//        {
//
//        }


        //准备服务器
        ServerSocket ss = new ServerSocket(port);
        System.out.println("服务器已经启动，可用接收访问操作！");
        //服务器端 接收到了 客户端的某一次网络访问
        //Socket : 两个作用： 代表客户端的API  表示某次网络连接建立后这一条连接
        //阻塞
        while(true) {
            Socket sk = ss.accept();

            //在这个连接的基础上 可用进行 I/O操作
            InputStream is = sk.getInputStream();
            //getInputStream获取了输入流对象，这个对象也是InputStream某个子类的具体实例
            //获取到这个实例 是基于网络构建的， 可以说是指向了 网络中的某个位置

//        FileOutputStream是作为OutputStream的一个子类，这个子类代表的是 指向了 某个磁盘文件
//        FileOutputStream fos = new FileOutputStream(path)
//        DataOutputStream dos = new DataOutputStream(OutputStream)

            //基于网络中的 InputStream实例 进行读取操作
            DataInputStream dis = new DataInputStream(is);

            String recMsg = dis.readUTF();

            System.out.println("服务器端收到信息： " + recMsg);
            System.out.println("服务器端的业务处理");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            OutputStream os = sk.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("你好，您的信息已经被收到，请耐心等待！");
            dos.flush();

            System.out.println("继续努力处理工作");

            DataInputStream dis1 = new DataInputStream(is);
            String recMsg1 = dis1.readUTF();
            System.out.println("收到客户端信息：" + recMsg1);

            System.out.println("工作已经处理结束！");

            DataOutputStream dos1 = new DataOutputStream(os);
            dos1.writeUTF("工作已经处理了，您的业务已经完成！");
            dos1.flush();
        }

    }
}
