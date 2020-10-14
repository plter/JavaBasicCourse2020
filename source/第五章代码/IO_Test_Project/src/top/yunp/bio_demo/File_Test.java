package top.yunp.bio_demo;

import java.io.File;

public class File_Test {

    /**
     * File
     * 文件：
     *     将单个文件， 一个文件夹 统称为 文件
     *
     * 文件类型：
     *      普通文件  a.txt c.mp3
     *      文件夹（目录）
     *      管道文件
     *      链接文件
     *
     * 文件格式：
     *      根据后缀来区分： .mp3  .jpg
     *
     *
     * 绝对路径：
     *      人们可以达成统一认知的一个起始位置，
     *
     *      对于计算机来说，起始位置： Windows： 盘符  C:/  D:/
     *                           Linux :  根 /
     *
     *
     * 相对路径：
     *
     *      对于计算机来说， 某一层的目录
     *
     *  File​(String pathname) 	  ---> 指定一个绝对路径
     *  File​(String parent, String child)  ---> parent：父目录  child：子目录
     *
     *  E:/DDD/FFF/a.txt
     *
     *
     *
     */
    public static void main(String[] args)
    {

        String parent = "E:/DDD/HHH";

        String fileName1 = "c.txt";

        File file1 = new File(parent,fileName1);



//        一、判断性质的操作
//        boolean 	canExecute()
        //某个文件所具有的权限与其真正体现出来的效果是不同，比如执行权限，可以给一个普通的任何文件有执行权限
        //但是如果在Windows下 其不是一个可执行的程序，即使具有了执行权限也是没有作用的。
        //如果执行权限标识在目录上，表示这个目录是可用进入
        String fileName2 = "VirtualBox-6.1.14-140239-Win.exe";
        File file2 = new File(parent,fileName2);
        File file3 = new File(parent);

        System.out.println("file1的执行权限："+file1.canExecute());
        System.out.println("file2的执行权限："+file2.canExecute());
        System.out.println("file3的执行权限："+file3.canExecute());


//        boolean 	canRead()
        System.out.println("file1的可读权限"+file1.canRead());
//        boolean 	canWrite()
        System.out.println("file1的可写权限"+file2.canWrite());
//        boolean 	isAbsolute()
        String path1 = "E:/DDD/HHH";
        String path2 = "/DDD/HHH";

        File file4 = new File(path1);
        File file5 = new File(path2);
        System.out.println("file4是否代表绝对路径："+file4.isAbsolute());
        System.out.println("file5是否代表绝对路径："+file5.isAbsolute());
//        boolean 	exists()
        System.out.println("file4指向的位置是否存在："+file4.exists());
//        boolean 	isHidden()
        String fileName3 = "b.txt";
        File file6 = new File(parent,fileName3);
        System.out.println("file6是否为隐藏文件："+file6.isHidden());
//        boolean 	isDirectory()
//        boolean 	isFile()

//        判断File的对象是否 是一个 文件、目录时  最好是这个文件已经存在
        System.out.println("file4是否为目录："+file4.isDirectory());
        System.out.println("file6是否为目录："+file6.isDirectory());
        System.out.println("file4是否为文件："+file4.isFile());
        System.out.println("file6是否为文件："+file6.isFile());



//
//        二、对文件本身是否存在影响
//        boolean 	createNewFile()
//        boolean 	mkdir()
//        boolean 	mkdirs()
//        boolean 	renameTo​(File dest)
//        boolean 	delete()
//        void 	deleteOnExit()

//        三、获取基本信息
//        File 	getAbsoluteFile()
//        String 	getAbsolutePath()
//        String 	getName()
//        String 	getParent()
//        File 	getParentFile()
//        String 	getPath()
//        int 	hashCode()
//        long 	lastModified()
//        long 	length()
//
//        四、获取目录内容
//        File[] 	listFiles()
//
//        五、AIO、NIO中使用
//        Path 	toPath()


    }
}
