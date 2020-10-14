package top.yunp.bio_demo;

import java.io.*;

public class File_DirCopy_Test {

    /**
     * 需求： 完成一个整个目录的复制操作
     *
     * 分析：
     *      1、目录递归
     *      2、单个文件 执行复制
     *      3、某个文件夹  创建  mkDirs
     *
     */
    public static void main(String[] args) throws IOException {

        String fromDir = "E:/AAAA";
        String toDir = "E:/CCCC";
        doJob(fromDir,toDir);
    }

    public static void doJob(String fromDir, String toDir) throws IOException {

        if(null == fromDir || null == toDir)
        {
            return;
        }

        File fromFile = new File(fromDir);

        if(!fromFile.exists())
        {
            return;
        }

        if(fromFile.isFile())
        {
            String name = fromFile.getName();
            //E:/AAAA/qq.txt  ---> E:/CCCC/qq.txt
            String saveFilePath = toDir+"/"+name;
            String absPath = fromFile.getAbsolutePath();

            doCopy(absPath,saveFilePath);
        }
        if(fromFile.isDirectory())
        {
            File[] files = fromFile.listFiles();

            for(File f : files)
            {
                if(f.isFile())
                {
                    String name = f.getName();
                    String savePath = toDir+"/"+name;
                    String absPath = f.getAbsolutePath();
                    doCopy(absPath,savePath);
                }
                if (f.isDirectory())
                {
                    //E:/AAAA/BBB ---> E:/CCCC/BBB
                    String dirName = f.getName();
                    String saveDirPath = toDir+"/"+dirName;
                    File dir = new File(saveDirPath);
                    dir.mkdirs();
                    String absDir = f.getAbsolutePath();
                    doJob(absDir,saveDirPath);
                }
            }
        }

    }

    public static void doCopy(String fromPath, String toPath) throws IOException {
        if(null == fromPath || null == toPath)
        {
            return;
        }
        File fromFile = new File(fromPath);
        FileInputStream fis = new FileInputStream(fromFile);

        FileOutputStream fos = new FileOutputStream(toPath);

        byte[] buff = new byte[1024*1024*10];

        int len = 0;

        while((len = fis.read(buff))!=-1)
        {
            fos.write(buff,0,len);
            fos.flush();

        }
        fos.close();
        fis.close();
    }
}
