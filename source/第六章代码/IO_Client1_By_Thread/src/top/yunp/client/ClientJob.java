package top.yunp.client;

import top.yunp.domain.User;

import java.io.*;
import java.net.Socket;

public class ClientJob {

    public static void sendMsg(String ipAddress, int port) throws IOException, ClassNotFoundException {

        Socket sk = new Socket(ipAddress,port);

        InputStream is = sk.getInputStream();
        OutputStream os = sk.getOutputStream();

        System.out.println("客户端开始发信息了！");

        DataOutputStream nameDos = new DataOutputStream(os);
        nameDos.writeUTF("张三");
        nameDos.flush();

        DataInputStream nameDis = new DataInputStream(is);
        String msg = nameDis.readUTF();
        System.out.println("收到服务端的回复："+msg);

        DataOutputStream ageDos = new DataOutputStream(os);
        ageDos.writeInt(20);
        ageDos.flush();

        DataOutputStream sexDos = new DataOutputStream(os);
        sexDos.writeUTF("男");
        sexDos.flush();

        ObjectInputStream ois = new ObjectInputStream(is);
        User uu  = (User) ois.readObject();

        System.out.println("注册完成："+uu);

    }
}
