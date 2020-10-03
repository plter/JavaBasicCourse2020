package top.yunp.numberdemo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {

    public static void main(String[] args)
    {

//        不要使用传入小数数字的方式去创建BigDecimal的对象，这样会导致不准确的问题出现
//        BigDecimal​(double val)
//        BigDecimal​(double val, MathContext mc)
//        在创建对象时，不指定有效位数，按照无限位来创建的，不会自动的做进位操作
//        BigDecimal​(String val)
//        创建对象时，会根据MathContext指定的有效位去创建对象
//        BigDecimal​(String val, MathContext mc)

//        构造：

        BigDecimal num4 = new BigDecimal("0.123456789123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789");
        BigDecimal num5 = new BigDecimal("0.123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789" +
                "123456789", MathContext.DECIMAL32);
        BigDecimal num6 = new BigDecimal("0.123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789123456789" +
                "123456789",MathContext.DECIMAL64);
        BigDecimal num7 = new BigDecimal("0.123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789" +
                "123456789",MathContext.DECIMAL128);
        BigDecimal num8 = new BigDecimal("0.123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789123456789123456789" +
                "123456789123456789123456789123456789123456789" +
                "123456789",MathContext.UNLIMITED);

        BigDecimal num9 = new BigDecimal(0.123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789);

        System.out.println("num4 == "+num4);
        System.out.println("num5 == "+num5);
        System.out.println("num6 == "+num6);
        System.out.println("num7 == "+num7);
        System.out.println("num8 == "+num8);
        System.out.println("num9 == "+num9);



//        1、加法
//        BigDecimal 	add​(BigDecimal augend)
//        BigDecimal 	add​(BigDecimal augend, MathContext mc)

        BigDecimal num1 = new BigDecimal("1.5");
        BigDecimal num2 = new BigDecimal("1.1");
        BigDecimal num3 = num1.add(num2);
        System.out.println("num3 == "+num3);

        BigDecimal num10 = new BigDecimal("0.123456789");
        BigDecimal num11 = new BigDecimal("0.123456789");
        BigDecimal num12 = num10.add(num11);
        System.out.println("num12 == "+num12);

        BigDecimal num13 = num10.add(num11,MathContext.DECIMAL32);
        System.out.println("num13 == "+num13);

//        2、除法
//        BigDecimal 	divide​(BigDecimal divisor)
//        BigDecimal 	divide​(BigDecimal divisor, int scale, RoundingMode roundingMode)

        BigDecimal num14 = new BigDecimal("1.1");
        BigDecimal num15 = new BigDecimal("2.2");

        BigDecimal num16 = num14.divide(num15);
        System.out.println("num16 == "+num16);

//        Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
//            at java.base/java.math.BigDecimal.divide(BigDecimal.java:1722)
//            at top.yunp.numberdemo.BigDecimalTest.main(BigDecimalTest.java:76)

        BigDecimal num17 = new BigDecimal("1.2");
        BigDecimal num18 = new BigDecimal("2.3");

        BigDecimal num19 = num17.divide(num18,5, RoundingMode.FLOOR);
        System.out.println("num19 == "+num19);

//        3、
//        获取某个BIgDecimal对象中的小数位数
//        int 	scale()
//        为某个BIgDecimal对象设置 小数后的位数，并且指定进位规则
//        BigDecimal 	setScale​(int newScale, int roundingMode)

        BigDecimal numnum1 = new BigDecimal("-0.123456789");

        BigDecimal numnum2 = numnum1.setScale(5,RoundingMode.FLOOR);

        System.out.println("FLOOR --- numnum2 == "+numnum2);

        BigDecimal numnum3 = numnum1.setScale(5,RoundingMode.UP);

        System.out.println("UP -- numnum3 == "+numnum3);

        BigDecimal numnum4 = numnum1.setScale(5,RoundingMode.DOWN);

        System.out.println("DOWN -- numnum4 == "+numnum4);

        BigDecimal numnum5 = numnum1.setScale(5,RoundingMode.CEILING);

        System.out.println("CEILING -- numnum5 == "+numnum5);

//        FLOOR --- numnum2 == 0.12345
//        UP -- numnum3 == 0.12346
//        DOWN -- numnum4 == 0.12345
//        CEILING -- numnum5 == 0.12346

//        FLOOR --- numnum2 == -0.12346
//        UP -- numnum3 == -0.12346
//        DOWN -- numnum4 == -0.12345
//        CEILING -- numnum5 == -0.12345


        BigDecimal numnumnum1 = new BigDecimal("0.12345");
        BigDecimal numnumnum2 = numnumnum1.setScale(4,RoundingMode.HALF_DOWN);
        BigDecimal numnumnum3 = numnumnum1.setScale(4,RoundingMode.HALF_UP);

        System.out.println("HALF_DOWN -- numnumnum2 == "+numnumnum2);
        System.out.println("HALF_UP -- numnumnum3 == "+numnumnum3);

//        HALF_DOWN -- numnumnum2 == 0.1234
//        HALF_UP -- numnumnum3 == 0.1235
        BigDecimal numnumnum4 = numnumnum1.setScale(4,RoundingMode.HALF_EVEN);
        System.out.println("HALF_EVEN -- numnumnum4 == "+numnumnum4);
//        HALF_EVEN -- numnumnum4 == 0.1234

        BigDecimal numnumnum5 = new BigDecimal("0.1235");
        BigDecimal numnumnum6 = numnumnum5.setScale(3,RoundingMode.HALF_EVEN);
        System.out.println("HALF_EVEN -- numnumnum6 == "+numnumnum6);
//        HALF_EVEN -- numnumnum6 == 0.124

    }
}
