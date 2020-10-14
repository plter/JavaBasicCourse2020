package top.yunp.exception_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Utils {

    private IO_Utils()
    {

    }


    public static void doCopy(String fromPath, String toPath) throws MyException, IOException {

        if(null == fromPath || null == toPath)
        {
            throw new MyException("您传入的参数路径存在问题，不可以为null！");
        }

        if(!fromPath.startsWith("E:") || !toPath.startsWith("E:"))
        {
            throw new MyException("您传递进来的参数，在当前Windows系统盘符中不存在！");
        }

        File fromFile = new File(fromPath);
        FileInputStream fis = new FileInputStream(fromFile);

        File toFile = new File(toPath);
        FileOutputStream fos = new FileOutputStream(toFile);

        int len = 0;
        byte[] buff = new byte[1024];
        while ((len = fis.read(buff))!=-1)
        {
            fos.write(buff,0,len);
            fos.flush();
        }
        fos.close();
        fis.close();
    }
}
