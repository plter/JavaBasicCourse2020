package top.yunp.bio_net_demo;

import java.io.*;
import java.net.Socket;

public class SendFiles_Client {


    public static void doEach(String dir,String host, int port) throws IOException {
        File file = new File(dir);

        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for(File f : files)
            {
                if(f.isFile())
                {
                    String absPath = f.getAbsolutePath();
                    doSendFile(host,port,absPath);
                }
                if (f.isDirectory())
                {
                    System.out.println("当前文件对应的是一个目录，暂时不支持网上上传！");
                }
            }

        }
        if(file.isFile())
        {
            String absPath = file.getAbsolutePath();
            doSendFile(host,port,absPath);
        }

    }

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
