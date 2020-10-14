package top.yunp.bio_net_demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveFile_Server {

    public static void doReceiveFile(int port ,String saveDir) throws IOException {

        ServerSocket ss = new ServerSocket(port);
        System.out.println("服务器已经开启！");

        while (true) {
            Socket sk = ss.accept();

            //1、接收文件之前的准备工作
            InputStream is = sk.getInputStream();
            DataInputStream beforeDis = new DataInputStream(is);
            String beforeMsg = beforeDis.readUTF();

            String[] msgs = beforeMsg.split(",");
            String fileName = msgs[0];
            long fileSize = Long.parseLong(msgs[1]);
            System.out.println("收到的文件名：" + fileName);
            System.out.println("收到的文件大小：" + fileSize);

            OutputStream os = sk.getOutputStream();
            DataOutputStream sendDos = new DataOutputStream(os);
            sendDos.writeUTF(fileName);
            sendDos.flush();

            //2、准备接受文件内容

            BufferedInputStream netBis = new BufferedInputStream(is);

            String savePath = saveDir + "/" + fileName;
            FileOutputStream fos = new FileOutputStream(savePath);
            BufferedOutputStream nativeBos = new BufferedOutputStream(fos);

            int len = 0;
            byte[] buff = new byte[1024];

            while ((len = netBis.read(buff)) != -1) {
                //边从网络接收数据  边向本地磁盘存储内容
                nativeBos.write(buff, 0, len);
                nativeBos.flush();
            }

            //关闭本地连接 不要关闭网络的
            nativeBos.close();
            fos.close();

            //3、确认回复  检查对应的文件是否接收完整

            File saveFile = new File(savePath);
            long size = saveFile.length();

            DataOutputStream checkDos = new DataOutputStream(os);
            checkDos.writeLong(size);
            checkDos.flush();

        }

    }
}
