package top.yunp.bio_net_demo;

import top.yunp.domain.Student;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReciveObject_Server {

    public static void doReciveObject(int port) throws IOException, ClassNotFoundException {

        ServerSocket ss = new ServerSocket(port);

        System.out.println("服务器已经运行，准备接受Object");
        Socket sk = ss.accept();

        InputStream is = sk.getInputStream();

        ObjectInputStream ois = new ObjectInputStream(is);

        Student stu = (Student)ois.readObject();

        System.out.println("服务端收到信息："+stu);

        String name = stu.getName();

        OutputStream os = sk.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF(name);
        dos.flush();


    }
}
