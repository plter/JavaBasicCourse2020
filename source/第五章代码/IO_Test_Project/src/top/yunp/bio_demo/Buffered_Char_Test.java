package top.yunp.bio_demo;

import java.io.*;

public class Buffered_Char_Test {

    public static void main(String[] args) throws IOException {

//        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String fromPath = "E:/AAAA/Student.java";
        String toPath = "E:/BBBB/Student.java";
        doCopyByBUfferedChar(fromPath,toPath);

    }

    public static void doCopyByBUfferedChar(String fromPath, String toPath) throws IOException {

        FileReader fr = new FileReader(fromPath);
        BufferedReader br = new BufferedReader(fr);

        int len = 0;
        char[] chs = new char[1024];

        FileWriter fw = new FileWriter(toPath);
        BufferedWriter bw = new BufferedWriter(fw);

        while ((len = br.read(chs))!=-1)
        {
            bw.write(chs,0,len);
            bw.flush();

        }
        bw.close();
        fw.close();
        br.close();
        fr.close();

    }
}
