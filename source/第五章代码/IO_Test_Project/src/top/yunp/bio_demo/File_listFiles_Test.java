package top.yunp.bio_demo;

import java.io.File;

public class File_listFiles_Test {

    public static void main(String[] args)
    {

//        四、获取目录内容
//        File[] 	listFiles()
        String path = "E:/AAAA";
        //String path1 = null;
        //有逻辑 给 path1赋值

        doJob(path);
    }

    /**
     * 递归：
     *      1、方法直接或者间接调用方法本身
     *      2、递归存在结束条件
     *      3、递归的方法参数需要发生变化
     * @param path
     */
    public static void doJob(String path)
    {
        //1、初步的检查
        if(null == path)
        {
            return;
        }

        File file = new File(path);

        if(file.isFile())
        {
            System.out.println("这是一个文件："+file.getAbsolutePath());
            return;
        }
        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for (File f : files)
            {
                if(f.isFile())
                {
                    System.out.println("这是一个文件："+f.getAbsolutePath());
                }
                if(f.isDirectory())
                {
                    //File[] fils = f.listFiles();
                    //递归： 如果方法 直接或者间接的调用方法本身，这样就形成了递归操作
                    //E:\AAAA\BBB
                    String dir = f.getAbsolutePath();
                    System.out.println("这是一个目录："+dir);
                    doJob(dir);

//                    doWork();
                }
            }

        }


    }

    public static void doWork()
    {
//        doJob(dir);

    }
}
