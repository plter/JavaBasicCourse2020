package top.yunp.bio_demo;

import java.io.File;
import java.io.IOException;

public class File_Demo {

    public static void main(String[] args) throws IOException {


//        二、对文件本身是否存在影响
//        boolean 	createNewFile()
        String parent = "E:/DDD/AAA";
        String fileName1 = "a.txt";
        File file1 = new File(parent,fileName1);
        file1.createNewFile();

//        boolean 	mkdir()
        String dirName1 = "BBB";
        File file2 = new File(parent,dirName1);
        file2.mkdir();
//        boolean 	mkdirs()
        String dirName2 = "CCCC/FFF/EEE";
        File file3 = new File(parent,dirName2);
        file3.mkdirs();

        String fileName2 = "b.txt";
        File file4 = new File(parent,fileName2);
        file4.mkdirs();

//        boolean 	renameTo​(File dest)
        File newFile = new File(parent,"aa.txt");
        file1.renameTo(newFile);

//        boolean 	delete()
        System.out.println("file1== "+file1.getName());
        System.out.println("file1删除操作："+file1.delete());
        System.out.println("newFile删除操作："+newFile.delete());

//        void 	deleteOnExit()
//        file2.deleteOnExit();
//        file3.deleteOnExit();
        file3.delete();

        //对于删除操作，如果删除的是目录，只能删除一层目录。不能直接删除多层

    }
}
