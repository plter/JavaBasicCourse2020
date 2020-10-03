package top.yunp.innerdemo;

public class OuterClass {

    public static String outName = "外部类";

    //成员内部类  ---> 所有可以使用的修饰符 与 成员变量相同
    public static class InnerClass1
    {
        //成员变量
        public String inName;
        public int inAge;

        //构造方法
        public InnerClass1()
        {

        }

        {
            System.out.println("成员内部类构造代码块");
        }

//        static
//        {
//
//        }
        //成员方法
        public void eat()
        {
            {
                System.out.println("成员内部类的 局部代码块");
            }
            System.out.println("吃饭 -- 成员内部类的成员方法");
        }

//        public static void sleep()
//        {
//            System.out.println("静态方法");
//        }

        public void printMsg()
        {
            System.out.println("outName == "+outName);
            doWork();
        }

        @Override
        public String toString() {
            return "InnerClass1{" +
                    "inName='" + inName + '\'' +
                    ", inAge=" + inAge +
                    '}';
        }
    }

    public void doJob()
    {
        int a = 10;

        //外部类 想要使用 内部类的 成员 ---> 需要创建对象

        InnerClass1 in1 = new InnerClass1();
        in1.inName = "张三";
        in1.inAge = 10;
        //内部类 想要使用 外部类的 成员 ---> 直接使用

        System.out.println(in1);

        in1.eat();

    }

    public static InnerClass1 create()
    {
        return new InnerClass1();
    }

    public static void doWork()
    {
        System.out.println("外部类的成员方法");
    }


}
