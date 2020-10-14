package top.yunp;

import top.yunp.bio_net_demo.SendFile_Client;
import top.yunp.bio_net_demo.SendFiles_Client;
import top.yunp.bio_net_demo.SendMsg_Client;
import top.yunp.bio_net_demo.SendObject_Client;

import java.io.IOException;

public class ClientTest {

    public static void main(String[] args) throws IOException {

//        SendMsg_Client.doSendMsg("127.0.0.1",10003);

//        SendObject_Client.doSendObject("127.0.0.1",10004);

//        SendFile_Client.doSendFile("127.0.0.1",10005,"E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx");
        SendFiles_Client.doEach("E:/AAAA/AAA","127.0.0.1",10005);
    }
}
