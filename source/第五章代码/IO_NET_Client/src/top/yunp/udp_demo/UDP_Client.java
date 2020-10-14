package top.yunp.udp_demo;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;

public class UDP_Client {

    public static void main(String[] args) throws IOException {


        //DatagramSocket()
        DatagramSocket client = new DatagramSocket(10091);

        //准备第一次的信息发送
        String msg = "UDP的服务端，你好！";
        //DatagramPacket​(byte[] buf, int length, InetAddress address, int port)
        byte[] msgBuff = msg.getBytes();
        //static InetAddress 	getByName​(String host)
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket packet = new DatagramPacket(msgBuff,msgBuff.length,ip,10090);

        client.send(packet);

        //准备接受回复

        //DatagramPacket​(byte[] buf, int length)
        //64KB
        byte[] buff = new byte[1024*10];
        DatagramPacket emptyPacket = new DatagramPacket(buff,1024*10);
        client.receive(emptyPacket);

        String recMsg = new String(buff);
        System.out.println("收到："+recMsg);



    }
}
