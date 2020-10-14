package top.yunp.client;

import top.yunp.thread.Client_File_Runnable;

import java.io.File;

public class FileClient {

    /**
     * 之前：
     *      遍历文件的操作，没得到一个文件就开启一个Socket连接
     *      但是之前的代码都是在main线程中执行，并且只有一个线程
     *      所以即使开启了多个连接，文件传输也没有同时进行，而是
     *      一个个的分别传输
     *
     * 改进：
     *      遍历多个文件，每次得到一个文件 都要单独开启一个线程，
     *      使用这个线程单独处理这个文件
     *      这样的话就可以形成多个线程共同工作！
     */

    public static void doDir(String ipAddress,int port,String dir)
    {
        File file = new File(dir);

        if(file.isFile())
        {
            //直接开启线程去传输文件
            Client_File_Runnable cfr = new Client_File_Runnable(ipAddress,port,file);
            Thread th = new Thread(cfr);
            th.start();
        }
        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for(File f : files)
            {
                if(f.isFile())
                {
                    //直接开启线程去传输文件
                    Client_File_Runnable cfr1 = new Client_File_Runnable(ipAddress,port,f);
                    Thread th1 = new Thread(cfr1);
                    th1.start();
                }

                if(f.isDirectory())
                {
                    System.out.println("暂时不支持整个多层目录的上传！");
                }
            }
        }
    }
}
