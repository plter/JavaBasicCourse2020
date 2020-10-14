package top.yunp;

import top.yunp.bio_net_demo.ReceiveFile_Server;
import top.yunp.bio_net_demo.ReciveMsg_Server;
import top.yunp.bio_net_demo.ReciveObject_Server;

import java.io.IOException;

public class ServerTest {

    /**
     *
     * 对于网络编程 涉及到 客户端  服务端
     *
     * 客户端：
     *      www.baidu.com ---> IP 绑定在一起的  ---> 客户端端操作的IP是 服务器端提供
     *
     * 服务端：
     *
     *      PC ---> 服务器端程序 就是一段代码 ---> 192.168.130.111
     *      服务器上会运行多个程序， 端口号
     *
     *      0-65535  1024 8080  10001  10002
     *
     * ----------------->
     *      如果自己设计 网络编程的API的话
     *
     *      服务器端： 考虑 端口号 对于API来说 是否需要考虑 IP地址
     *
     *      客户端：  IP  端口号
     *
     */

    public static  void main(String[] args) throws IOException, ClassNotFoundException {
//        ReciveMsg_Server.doReceive(10003);

//        ReciveObject_Server.doReciveObject(10004);

        ReceiveFile_Server.doReceiveFile(10005,"E:/DDDD");
    }


}
