package top.yunp.exception_demo;

//继承自 RuntimException 成为 运行时期自定义异常
public class MyException extends RuntimeException{

//继承自 Exception 成为  编译时期自定义的异常
//public class MyException extends Exception{

    public MyException(String msg)
    {
        super(msg);
    }

}
