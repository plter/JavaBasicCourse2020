package top.yunp.bio_net_demo;

import com.alibaba.fastjson.JSON;
import top.yunp.domain.Worker;

import java.io.*;
import java.net.Socket;

public class SearchJob_Client {

    public static void main(String[] args) throws IOException {
        String word = "张三";
        doSearch(word);
    }

    public static void doSearch(String keyWord) throws IOException {

        Socket sk = new Socket("127.0.0.1",10100);

        OutputStream os = sk.getOutputStream();
        InputStream is = sk.getInputStream();

        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF(keyWord);
        dos.flush();

        DataInputStream dis = new DataInputStream(is);
        String jsonResult = dis.readUTF();

        Worker wk = JSON.parseObject(jsonResult, Worker.class);
        System.out.println(wk);
    }
}
