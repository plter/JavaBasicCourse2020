package top.yunp.bio_demo;

import java.io.File;

public class FileMsg_Test {

    public static void main(String[] args)
    {

        String path = "E:/HHH/AAA/a.txt";
        File file = new File(path);
//        三、获取基本信息
//        File 	getAbsoluteFile()
//        String 	getAbsolutePath()
        System.out.println("绝对路径："+file.getAbsolutePath());
//        String 	getName()
        System.out.println("文件名称："+file.getName());
//        String 	getParent()
        System.out.println("父目录："+file.getParent());
//        File 	getParentFile()
//        String 	getPath()
        System.out.println("路径："+file.getPath());
//        int 	hashCode()
        System.out.println("哈希值："+file.hashCode());
//        long 	lastModified()
        System.out.println("修改时间："+file.lastModified());
//        long 	length()
        System.out.println("文件长度："+file.length());
    }
}
