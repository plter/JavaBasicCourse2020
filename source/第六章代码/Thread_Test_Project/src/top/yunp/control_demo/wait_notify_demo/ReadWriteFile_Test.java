package top.yunp.control_demo.wait_notify_demo;

import java.io.*;

public class ReadWriteFile_Test {

    public static void main(String[] args) throws IOException {

        String path = "E:/BBBB/c.txt";

        FileWriter fw = new FileWriter(path);
        FileReader fr = new FileReader(path);

        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        Read_Runnable rr = new Read_Runnable(br);
        Thread th1 = new Thread(rr);
        th1.start();

        Write_Runnable wr = new Write_Runnable(bw);
        Thread th2 = new Thread(wr);
        th2.start();

    }
}
