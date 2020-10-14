package top.yunp.bio_demo;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class File_listFiles_Demo {

    /**
     * 需求：
     *      Windows 下可用进行磁盘的文件搜索操作
     *      Linux   find -name  a.txt
     *
     * 分析：
     *
     *      1、目录递归
     *      2、将目录信息存储到一个容器中
     *
     *      E:\AAAA\CCC\a.txt   a.txt
     *
     *      HashMap<K,VS>  ---> K:String 文件名称  V:容器 Set<String>
     *
     *      HashMap<String,Set<String>>
     *
     *      3、将递归信息存储到文件中，避免每次都要执行递归操作
     */

    //成员变量
    static HashMap<String, HashSet<String>> k_vs = new HashMap<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String dir = "E:/AAAA";
        String fileName = "b.txt";
        String savedFilePath = "E:/BBBB/data.txt";

        findByName(dir,fileName,savedFilePath);

    }

    public static void findByName(String dir, String fileName , String saveFilePath) throws IOException, ClassNotFoundException {

        if(null == dir || null == fileName || saveFilePath == null)
        {
            return;
        }

        File saveFile = new File(saveFilePath);

        if(saveFile.exists())
        {
            FileInputStream fis = new FileInputStream(saveFile);
            ObjectInputStream oos = new ObjectInputStream(fis);
            HashMap<String, HashSet<String>> savedMsg = (HashMap<String, HashSet<String>>) oos.readObject();

            HashSet<String> paths = savedMsg.get(fileName);

            System.out.println("文件："+fileName+"存在于下列路径中：");
            for (String path :paths)
            {
                System.out.println("文件存储在："+path);
            }

            oos.close();
            fis.close();
        }
        else
        {
            //1、先进行递归操作
            doJob(dir);

            //2、递归结束之后，数据信息就已经保存到了 HashMap ，将HashMap存储到文件中
            FileOutputStream fos = new FileOutputStream(saveFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(k_vs);
            oos.flush();
            oos.close();
            fos.close();

            //3、路径输出
            HashSet<String> paths = k_vs.get(fileName);
            System.out.println("文件："+fileName+"存在于下列路径中：");
            for (String path :paths)
            {
                System.out.println("文件存储在："+path);
            }

        }

    }

    public static void doJob(String path)
    {
        System.out.println("发生了递归！");
        if(null == path)
        {
            return;
        }
        File file = new File(path);

        if(file.isFile())
        {
            String name = file.getName();
            String absPath = file.getAbsolutePath();

            if(k_vs.containsKey(name))
            {
                HashSet<String> vs = k_vs.get(name);
                vs.add(absPath);
                k_vs.put(name,vs);
            }
            else
            {
                HashSet<String> vs = new HashSet<>();
                vs.add(absPath);
                k_vs.put(name,vs);
            }
        }

        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for(File f : files)
            {
                if(f.isFile())
                {
                    String name1 = f.getName();
                    String newPath1 = f.getAbsolutePath();

                    if(k_vs.containsKey(name1))
                    {
                        HashSet<String> oldPaths = k_vs.get(name1);
                        oldPaths.add(newPath1);
                        k_vs.put(name1,oldPaths);
                    }
                    else
                    {
                        HashSet<String> newPaths = new HashSet<>();
                        newPaths.add(newPath1);
                        k_vs.put(name1,newPaths);
                    }
                }
                if(f.isDirectory())
                {
                    String dir = f.getAbsolutePath();
                    doJob(dir);
                }
            }
        }
    }
}
