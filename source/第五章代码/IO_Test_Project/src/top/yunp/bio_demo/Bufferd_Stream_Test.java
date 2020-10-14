package top.yunp.bio_demo;

import java.io.*;

public class Bufferd_Stream_Test {

    public static void main(String[] args) throws IOException {
        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String toPath = "E:/BBBB/a.pptx";
        doCopy(fromPath,toPath);
    }

    public static void doCopy(String fromPath, String toPath) throws IOException {

        if(null == fromPath || null == toPath)
        {
            return;
        }

        FileInputStream fis = new FileInputStream(fromPath);
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] buff = new byte[1024];
        int len = 0;

        FileOutputStream fos = new FileOutputStream(toPath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        while ((len = bis.read(buff))!=-1)
        {
            bos.write(buff,0,len);
            bos.flush();
        }

        bos.close();
        fos.close();
        bis.close();
        fis.close();
    }
}
