package top.yunp.exception_demo;

import java.io.IOException;

public class Util_Test {

    public static void main(String[] args)
    {

        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String toPath = "E:/BBBB/UU.pptx";
//        try {
//            IO_Utils.doCopy(fromPath,toPath);
//        } catch (MyException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            IO_Utils.doCopy(fromPath,toPath);
//        } catch (MyException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //try -- catch 操作处理的是 编译时期的异常， 但是运行时期异常 同样可以手动添加到catch中

        try {
            IO_Utils.doCopy(fromPath,toPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        catch (MyException e) {
//            e.printStackTrace();
//        }

        /**
         * JavaSE 基础
         *
         * JavaWeb
         *
         * Hadoop
         * Hive
         * Hbase
         * Spark
         * Flink
         *
         */

    }
}
