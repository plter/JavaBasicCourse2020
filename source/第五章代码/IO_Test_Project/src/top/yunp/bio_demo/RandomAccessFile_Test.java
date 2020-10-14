package top.yunp.bio_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_Test {

    public static void main(String[] args) throws IOException {

        test_read();

    }

    public static void test_read() throws IOException {
        String path = "E:/BBBB/a.txt";
        File file = new File(path);
        RandomAccessFile random = new RandomAccessFile(file,"rw");

        System.out.println(random.readUTF());
        System.out.println(random.readUTF());
        System.out.println(random.readUTF());
        System.out.println(random.readUTF());
        System.out.println(random.readUTF());
        System.out.println(random.readUTF());
        System.out.println(random.readUTF());

        random.close();
    }

    public static void test_write() throws IOException {
        /**
         * AAABBBCCC
         */
        String path = "E:/BBBB/a.txt";
        File file = new File(path);
        RandomAccessFile random = new RandomAccessFile(file,"rw");

        long len = random.length();
        random.seek(len);
//        long 	length()
//        void 	seek​(long pos)
        random.writeUTF("EEE");
        random.writeUTF("FFF");
        random.writeUTF("GGG");

        random.close();
    }
}
