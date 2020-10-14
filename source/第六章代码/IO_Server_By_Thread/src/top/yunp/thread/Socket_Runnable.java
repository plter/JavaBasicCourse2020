package top.yunp.thread;

import top.yunp.domain.User;
import top.yunp.server.ServerWork;

import java.io.*;
import java.net.Socket;

public class Socket_Runnable implements Runnable{

    private Socket sk = null;

    public Socket_Runnable(Socket sk)
    {
        this.sk = sk;
    }

    @Override
    public void run() {

        try {
            ServerWork.doJob(sk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
