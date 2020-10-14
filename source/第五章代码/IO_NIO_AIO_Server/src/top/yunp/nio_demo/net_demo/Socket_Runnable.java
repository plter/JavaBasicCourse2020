package top.yunp.nio_demo.net_demo;

import java.io.IOException;
import java.net.Socket;

public class Socket_Runnable implements Runnable{

    private Socket sk;
    public Socket_Runnable(Socket sk)
    {
        this.sk = sk;
    }
    @Override
    public void run() {
        try {
            sk.getOutputStream();
            sk.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
