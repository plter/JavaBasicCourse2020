package top.yunp.client;

import java.io.*;
import java.net.Socket;

public class FileSend {

    public static void doSendFile(String ipAddress, int port, File file) throws IOException {

        Socket sk = new Socket(ipAddress,port);

        OutputStream os = sk.getOutputStream();
        InputStream is = sk.getInputStream();

        String fileName = file.getName();
        System.out.println(Thread.currentThread().getName()+"正在发送文件："+fileName);

        DataOutputStream nameDos = new DataOutputStream(os);
        nameDos.writeUTF(fileName);
        nameDos.flush();

        DataInputStream nameDis = new DataInputStream(is);
        String msg = nameDis.readUTF();

        if(msg.equals(fileName))
        {
            FileInputStream nativeFis = new FileInputStream(file);
            BufferedInputStream nativeBis = new BufferedInputStream(nativeFis);

            int len = 0;
            byte[] buff = new byte[1024*1024*2];

            BufferedOutputStream netBos = new BufferedOutputStream(os);

            while ((len = nativeBis.read(buff))!=-1)
            {
                netBos.write(buff,0,len);
                netBos.flush();
            }
            nativeBis.close();
            nativeFis.close();
            //当前的Socket连接 只处理一个文件的传输操作，文件传输结束结束之后，关闭客户端对外的输出
            //目的是为了让服务端可以收到 -1
            sk.shutdownOutput();
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"发送文件"+fileName+"失败"+msg);
            doSendFile(ipAddress,port,file);
        }

        //说明文件传输基本完成，但是需要最后的确认！
        long length = file.length();
        DataInputStream sizeDis = new DataInputStream(is);
        long size = sizeDis.readLong();

        if(length == size)
        {
            System.out.println(Thread.currentThread().getName()+"完成了文件："+fileName+"传输操作");
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"在传输文件过程中出现错误，需要重新传输："+fileName);
            doSendFile(ipAddress,port,file);
        }

    }
}
