package top.yunp.innerdemo;

public class OuterInnerTest {

    public static void main(String[] args)
    {

        OuterInner oi = new OuterInner();
//        O_I_language lan = new O_I_language();
//        Im_Language im = new Im_Language();
//        oi.doJob(im);

        //遇到某个成员方法的形式参数 其类型时某个接口

        //匿名内部类

        oi.doJob(
         new O_I_language() {
            @Override
            public void speakEnglish() {
                System.out.println("匿名内部类实现的功能");
                System.out.println("英语口语很厉害！");
            }
         }
        );

        /**
         * 函数式 编程
         *
         * 1、函数接口  --->  接口内部只有一个抽象方法的接口
         * 2、Lamda表达式
         */

    }
}
