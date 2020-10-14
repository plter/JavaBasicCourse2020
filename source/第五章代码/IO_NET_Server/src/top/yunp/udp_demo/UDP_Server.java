package top.yunp.udp_demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP_Server {

    public static void main(String[] args) throws IOException {

        // 	DatagramSocket​(int port)
        DatagramSocket server = new DatagramSocket(10090);

        //先准备接受信息
        //DatagramPacket​(byte[] buf, int length)
        byte[] buff = new byte[1024*10];
        DatagramPacket empty = new DatagramPacket(buff,1024*10);

        server.receive(empty);

        String msg = new String(buff);
        System.out.println("收到："+msg);

        String sendMsg = "UDP的客户端，你好！";
        //DatagramPacket​(byte[] buf, int length, InetAddress address, int port)
        byte[] sendBuff = sendMsg.getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket sendPacket = new DatagramPacket(sendBuff,sendBuff.length,ip,10091);

        server.send(sendPacket);



    }
}
