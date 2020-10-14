package top.yunp.bio_net_demo;

import top.yunp.domain.Student;

import java.io.*;
import java.net.Socket;

public class SendObject_Client {

    public static void doSendObject(String host,int port) throws IOException {

        Socket sk = new Socket(host,port);

        OutputStream os= sk.getOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(os);

        Student stu = new Student("张三",10,"男");

        oos.writeObject(stu);

        oos.flush();

        InputStream is = sk.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();

        System.out.println("收到服务端的回复："+msg);

    }
}
