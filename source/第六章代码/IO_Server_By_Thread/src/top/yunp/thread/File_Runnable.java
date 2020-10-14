package top.yunp.thread;

import top.yunp.server.FileReceive;

import java.io.IOException;
import java.net.Socket;

public class File_Runnable implements Runnable{

    private Socket sk = null;
    private String dir = null;

    public File_Runnable(Socket sk , String dir)
    {
        this.sk = sk;
        this.dir = dir;

    }

    @Override
    public void run() {

        try {
            FileReceive.doJob(sk,dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
