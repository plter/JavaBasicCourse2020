package top.yunp.thread;

import top.yunp.client.FileSend;

import java.io.File;
import java.io.IOException;

public class Client_File_Runnable implements Runnable{

    private String ipAddress = null;
    private int port;
    private File file= null;

    public Client_File_Runnable(String ipAddress, int port, File file)
    {
        this.ipAddress = ipAddress;
        this.port = port;
        this.file = file;

    }
    @Override
    public void run() {
        try {
            FileSend.doSendFile(ipAddress,port,file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
