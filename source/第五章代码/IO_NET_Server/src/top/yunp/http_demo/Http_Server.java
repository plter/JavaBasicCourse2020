package top.yunp.http_demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Http_Server {

    /**
     * JavaWeb 、JavaEE
     *
     * Servlet
     * Spring  SpringMVC  SpringBoot
     */
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10101);

        System.out.println("服务端已经开启！");
        Socket sk = ss.accept();

        InputStream is = sk.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line ;

        while((line = br.readLine())!=null)
        {
            System.out.println(line);
        }

        OutputStream os =  sk.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("AAAA");
        dos.flush();

        //这里如果需要回复信息 ，需要将信息 按照HTTP协议的规则去封装！
    }
}
