package top.yunp.control_demo.wait_notify_demo;

import java.io.BufferedWriter;
import java.io.IOException;

public class Write_Runnable implements Runnable{

    public Write_Runnable(BufferedWriter bw)
    {
        ReadWriteFile.bw = bw;
    }

    @Override
    public void run() {

        while (true)
        {
            try {
                ReadWriteFile.writeFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
