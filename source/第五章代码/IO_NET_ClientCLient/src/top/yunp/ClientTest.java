package top.yunp;

import top.yunp.bio_net_demo.SendMsg_Client;

import java.io.IOException;

public class ClientTest {

    public static void main(String[] args) throws IOException {

        SendMsg_Client.doSendMsg("127.0.0.1",10003);
    }
}
