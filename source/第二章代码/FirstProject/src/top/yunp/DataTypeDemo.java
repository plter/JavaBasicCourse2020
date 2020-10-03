package top.yunp;

public class DataTypeDemo {

    public static void main(String[] args)
    {

        //===========================================
        //隐式类型转换（由小范围 向 大范围的数值进行转换）
        byte b1 = 10;

        short s1 = 20;

        //+: 1、作为数学运算符  算术运算符  2、拼接符
        int sum = b1+s1;

        System.out.println("sum == "+sum);

        //Java在进行数学运算的操作时，自动完成了类型的统一，并且按照小范围 向 大范围 自动转换！

        double d1 = 1.0;

        double result = d1+sum;

        System.out.println("result == "+result);

        //ASCII码表  ---> 数字 --符号 之间对应的表格
        //GBK  UTF-8  --->  数字 -- 符号 之间对应表格
        char ch1 = 'A';  //65

        int result1 = ch1+1;
        System.out.println("result1  == "+result1);

        char ch2 = '学';  //23398
        int result2 = ch2+1;
        System.out.println("result2  == "+result2);


        //==============================================
        //强制类型转换（大范围 向 小范围）
        // 1、强制转换 不要随意使用， 明确操作时正确的时候，可以将大范围 转换为小范围
        // 2、强制转换的格式：   数据类型1  变量1 = (数据类型1)(表达式);
        int num1 = 1;
        int num2 = 2;
        int sum1 = num1+num2;
        int sum2 = 1+2;
        //对于数字1、2他是一个常数
        byte sum3 = 1+2;
        //对于num1、num2来说 是int类型的变量
        byte sum4 = (byte)(num1+num2);

        System.out.println("sum4 === "+ sum4);

        //这种强转 禁止使用！
        byte num5 = (byte)130;

        System.out.println("num5 == "+num5);



    }
}
