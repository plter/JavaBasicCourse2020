package top.yunp.functiondemo;

public class Student {


    int e = 10;

    static int f = 10;

    final int g = 10;

    public void doMath(MyMath myMath)
    {

        int result = myMath.math(10);

        System.out.println("result == "+result);

    }


    public void doWork()
    {
        //闭包


//        doMath((int a)->{ return a+10;});

//        局部变量传入到Lamda表达式中，自动默认为final
//        int b = 10;
//        doMath((int a)->{ b = 20; return a+b;});

//        final int c = 10;
//        doMath((int a)->{ return a+c;});

//        全局变量 可以在Lamda表达式中 进行赋值操作
//        doMath((int a)->{ e = 20; return a+e;});
//        全局变量 使用 static 修饰 同样可以使用 并且重新赋值
//        doMath((int a)->{ f = 20; return a+f;});

//        全局变量 使用 final修饰  可以使用 但是不能进行赋值操作
        doMath((int a)->{ return a+g;});



    }


}
