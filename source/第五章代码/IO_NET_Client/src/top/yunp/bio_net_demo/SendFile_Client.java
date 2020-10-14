package top.yunp.bio_net_demo;

import java.io.*;
import java.net.Socket;

public class SendFile_Client {

    /**
     * 需求： 通过网络编程 从客户端发送一个文件 到服务端
     *
     * 分析：
     *
     *      Socket
     *      ServerSocket
     *
     *      客户端代码： 从本地读取文件的内容， 将读的内容通过网络发送出去
     *
     *      服务端代码： 从网络线接受内容， 将接受到的内容 存储到服务端的本地文件
     *
     *      sk.getInputStream  InputStream
     *
     *      BufferedInputStream
     *      BufferedOutputSteam
     */

    public static void doSendFile(String host, int port, String filePath) throws IOException {

        Socket sk = new Socket(host,port);

        //1、发送前准备工作

        File nativeFile = new File(filePath);
        String name = nativeFile.getName();
        long size = nativeFile.length();
        String sendMsg = name+","+size;

        OutputStream os = sk.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(sendMsg);
        dos.flush();

        //1.1等待服务器端的回复  约定 回复文件名称即可
        InputStream is = sk.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String recMsg = dis.readUTF();

        if(name.equals(recMsg))
        {
            //2、发送文件具体内容
            FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream nativeBis = new BufferedInputStream(fis);

            byte[] buff = new byte[1024];
            int len = 0;

            BufferedOutputStream netBos = new BufferedOutputStream(os);

            while((len = nativeBis.read(buff))!= -1)
            {
                //边从本地读取内容 边向网络中发送内容
                netBos.write(buff,0,len);
                netBos.flush();
            }

            //将客户端对外的输出流 关闭， 关闭之后 不能再次打开，也不能重复使用之前输出流
            sk.shutdownOutput();

            nativeBis.close();
            fis.close();
        }
        else
        {
            System.out.println("服务器端回复的名称存在问题！");
        }

        //3、文件发送完毕之后，等待确认信息  约定： 回复文件的大小

        DataInputStream sizeDis = new DataInputStream(is);
        long sizesize = sizeDis.readLong();

        if(size == sizesize)
        {
            System.out.println("文件大小相同");
            sk.close();
        }
        else
        {
            System.out.println("文件发送失败，请重新发送！");
        }



    }
}
