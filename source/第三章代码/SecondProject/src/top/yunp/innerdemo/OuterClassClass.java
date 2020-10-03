package top.yunp.innerdemo;

public class OuterClassClass {

    public String outMsg = "外部类的成员变量";

//    public InnerClass2 in2 = new InnerClass2();

    public void doJob(   )
    {
        System.out.println("外部类的成员方法");

        String msg = "局部变量";

//        对于局部位置来说，代码的作用 都是先定义 后使用
//        InnerClass2 in3 = new InnerClass2();

        //局部内部类  ---> 可以使用的修饰符 与 局部变量等同
        class InnerClass2
        {

            public String inName;
            public int inAge;

            public InnerClass2()
            {

            }

            {
                System.out.println("局部内部类的构造代码块");
            }
            public  void eat()
            {
                {
                    System.out.println("局部内部类的局部代码块");
                }
                System.out.println("局部内部类的成员方法");
            }

            public void doInner()
            {
                System.out.println(outMsg);

                doWork();
            }


            @Override
            public String toString() {
                return "InnerClass2{" +
                        "inName='" + inName + '\'' +
                        ", inAge=" + inAge +
                        '}';
            }
        }

        InnerClass2 in2 = new InnerClass2();
        in2.inName = "内部类";
        in2.inAge = 10;

        System.out.println(in2);

        in2.eat();
        in2.doInner();


    }

    public void doWork()
    {
//        InnerClass2 in2 = new InnerClass2();
        System.out.println("外部类的成员方法");
    }

}
