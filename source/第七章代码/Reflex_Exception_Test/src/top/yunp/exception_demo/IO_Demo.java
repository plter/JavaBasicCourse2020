package top.yunp.exception_demo;

import java.io.*;

public class IO_Demo {


    /**
     *
     * 异常处理：
     * 方式一：  抛出
     *      如果自己编写工具类 或者是框架  都要提供给其他人去使用， 如果书写工具类的过程中 有异常的话
     *      最好不要 try catch
     *
     * 方式二:
     *      业务逻辑处理 代码最终还是 需要try catch
     */
    public static void main(String[] args)
    {
        String fromPath = "E:/AAAA/AAA/4、Java的API(基础、集合体系).pptx";
        String toPath = "E:/BBBB/BB.pptx";
        doCopy(fromPath,toPath);
    }

    public static void doCopy(String fromPath, String toPath){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            File fromFile = new File(fromPath);
            fis = new FileInputStream(fromFile);

            File toFile = new File(toPath);
            fos = new FileOutputStream(toFile);

            int len = 0;
            byte[] buff = new byte[1024];

            while ((len = fis.read(buff)) != -1) {

                fos.write(buff, 0, len);
                fos.flush();
            }



            //catch 操作可以有多个 但是这个时候 异常要从小到大排列
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("实际业务处理！");
        } catch(ArithmeticException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源等 最终结尾 放在这里
            try {
                //java.lang.NullPointerException
                if(null != fos) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null != fis)
                {
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
