package top.yunp.server;

import java.io.*;
import java.net.Socket;

public class FileReceive {

    public static void doJob(Socket sk, String dir) throws IOException {

        InputStream is = sk.getInputStream();
        OutputStream os = sk.getOutputStream();

        DataInputStream nameDis = new DataInputStream(is);
        String fileName = nameDis.readUTF();

        String absPath = dir+"/"+fileName;
        System.out.println(Thread.currentThread().getName()+"正在准备保存文件："+fileName);
        System.out.println("该文件的保存路径为："+absPath);

        DataOutputStream nameDos = new DataOutputStream(os);
        nameDos.writeUTF(fileName);
        nameDos.flush();

        //边从网络接收数据 边向本地存储
        BufferedInputStream netBis = new BufferedInputStream(is);

        int len = 0;
        byte[] buff = new byte[1024*1024*2];

        FileOutputStream nativeFos = new FileOutputStream(absPath);
        BufferedOutputStream nativeBos = new BufferedOutputStream(nativeFos);

        while ((len = netBis.read(buff))!=-1)
        {
            nativeBos.write(buff,0,len);
            nativeBos.flush();
        }

        nativeBos.close();
        nativeFos.close();

        //确认信息
        System.out.println("该文件已经保存到路径："+absPath);
        File file = new File(absPath);
        long size = file.length();

        DataOutputStream sizeDos = new DataOutputStream(os);
        sizeDos.writeLong(size);
        sizeDos.flush();
    }
}
