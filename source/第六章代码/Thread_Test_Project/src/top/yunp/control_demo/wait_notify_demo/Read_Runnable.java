package top.yunp.control_demo.wait_notify_demo;

import java.io.BufferedReader;
import java.io.IOException;

public class Read_Runnable implements Runnable{

    public Read_Runnable(BufferedReader br)
    {
        ReadWriteFile.br = br;
    }

    @Override
    public void run() {

        while (true)
        {
            try {
                ReadWriteFile.readFile();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
