package top.yunp.bio_net_demo;

import java.io.*;
import java.net.Socket;

public class SendMsg_Client {

    public static void doSendMsg(String host, int port) throws IOException {
        /**
         * Class Socket
         *  Socket​(String host, int port)
         *  InputStream 	getInputStream()
         *  OutputStream 	getOutputStream()
         *  void 	close()
         */

        Socket sk = new Socket(host,port);

        //先发送信息给服务端
        OutputStream os = sk.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("你好，服务端，我是李四，请多多关照！");
        dos.flush();

        //等待服务端的回复
        InputStream is = sk.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();
        System.out.println("接收到信息："+msg);

        //客户端接收到服务端的信息 等待了一些时间
        //再次询问服务端是否完成功能
        //不要重复调用 getOutputStream 、getInputStream
        //对于已经打开的 InputStream、OutputStream 可用使用多次
//        OutputStream is1  = sk.getOutputStream();

//        dos.writeUTF("请问处理完成了吗？ 等了五分钟了！");
//        dos.flush();

        DataOutputStream dos1 = new DataOutputStream(os);
        dos1.writeUTF("请问处理完成了吗？ 等了五分钟了！");
        dos1.flush();

        DataInputStream dis1 = new DataInputStream(is);
        String msg1 = dis1.readUTF();
        System.out.println("处理结果："+msg1);

//        sk.close();

    }
}
