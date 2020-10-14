package top.yunp.bio_demo;

import java.io.*;
import java.util.ArrayList;

public class Object_Stream_Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //调用向文件写入引用数据类型的 API
        String pathName = "E:/DDD/c.txt";
        ArrayList<String> strs = new ArrayList<>();
        strs.add("AAAA");
        strs.add("BBB");
        strs.add("CCC");
//        test_writeOBject(pathName,strs);

        ArrayList<String> result = test_readObject(pathName);

        for(String ss : result)
        {
            System.out.println("在文件中保存的ArrayList数据为："+ss);
        }


    }

    /**
     * ObjectOutputStream
     * 构造：
     *  	ObjectOutputStream​(OutputStream out)
     * void 	writeObject​(Object obj)
     */

    public static void test_writeOBject(String pathName, Object obj) throws IOException{

        /**
         * 1、准备一个文件的路径
         * 2、使用这个路径创建一个File对象
         * 3、使用这个File的对象创建 FileOutputStream对象
         * 4、使用FileOutputStream创建 ObjectOutputStream
         * 5、使用ObjectOutputStream对象 调用 writeObject功能
         */

        File file = new File(pathName);
        FileOutputStream fos  = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        oos.flush();

        oos.close();
        fos.close();


    }

    /**
     * 构造方法
     *  	ObjectInputStream​(InputStream in)
     *          Object 	readObject()
     * @param pathName
     */
    public static <T> T test_readObject(String pathName) throws IOException, ClassNotFoundException {

        File file = new File(pathName);

        //FileNotFoundException
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        T t = (T) ois.readObject();

        ois.close();
        fis.close();

        return  t;



    }
}
