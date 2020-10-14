package top.yunp.server;

import top.yunp.domain.User;

import java.io.*;
import java.net.Socket;

public class ServerWork {

    public static  void doJob(Socket sk) throws IOException {

        InputStream is = sk.getInputStream();
        OutputStream os = sk.getOutputStream();

        DataInputStream dis = new DataInputStream(is);
        String name = dis.readUTF();
        System.out.println("收到的姓名息为："+name);

        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好---"+name);
        dos.flush();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DataInputStream ageDis = new DataInputStream(is);
        int age = ageDis.readInt();
        System.out.println("收到的年龄："+age);

        DataInputStream sexDis = new DataInputStream(is);
        String sex = sexDis.readUTF();
        System.out.println("收到的性别信息："+sex);

        User uu = new User(name,age,sex);

        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(uu);
        oos.flush();

    }
}
