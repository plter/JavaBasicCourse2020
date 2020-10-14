package top.yunp.bio_demo;

import java.io.*;

public class InputStreamReader_Test {

    public static void main(String[] args) throws IOException {


//        test_readLine();
        String fromPath = "E:/DDDD/a.txt";
        String toPath = "E:/DDDD/c.txt";
//        doCopy(fromPath,toPath);
        doCopyByStreamChar(fromPath,toPath);
    }

    public static void test_readLine() throws IOException {
        String path = "E:/DDDD/a.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());

        br.close();
        fr.close();
    }

    public static void doCopy(String fromPath, String toPath) throws IOException {

        /**
         * Class BufferedReader
         * String 	readLine()
         */
        FileReader fr = new FileReader(fromPath);
        BufferedReader br = new BufferedReader(fr);

//        int len = 0;
//        char[] chs = new char[1024];

        String line = null;
        FileWriter fw = new FileWriter(toPath);
        BufferedWriter bw = new BufferedWriter(fw);

        while ((line = br.readLine())!=null)
        {
            /**
             * Class BufferedWriter
             * void 	write​(String str)
             * void 	newLine()
             */
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        fw.close();
        br.close();
        fr.close();

    }

    public static void doCopyByStreamChar(String fromPath, String toPath) throws IOException {

        /**
         * java.lang.Object
         *         java.io.Reader
         *             java.io.InputStreamReader
         * InputStreamReader​(InputStream in)
         */
//        FileReader fr = new FileReader(fromPath);
        FileInputStream fis = new FileInputStream(fromPath);
        //转换流： 将字节输入流 转换为 字符输入流
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = null;

        FileOutputStream fos = new FileOutputStream(toPath);

        /**
         * java.lang.Object
         *         java.io.Writer
         *             java.io.OutputStreamWriter
         *   OutputStreamWriter​(OutputStream out)
         */
        //转换流：  字节输流 转为 字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        while((line = br.readLine()) !=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();


        }

        bw.close();
        osw.close();
        fos.close();
        br.close();
        //这样的一个关闭操作，会将给予的基础流都关闭掉

    }
}
