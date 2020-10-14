package top.yunp;

import top.yunp.client.ClientJob;
import top.yunp.client.FileClient;

import java.io.IOException;

public class ClientTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ClientJob.sendMsg("127.0.0.1",10009);

        FileClient.doDir("127.0.0.1",10010,"E:/AAAA/AAA");

    }
}
