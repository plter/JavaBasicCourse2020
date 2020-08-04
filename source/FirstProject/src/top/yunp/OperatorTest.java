package top.yunp;

/**
 * 这里讲解的时Java中运算符
 */
public class OperatorTest {

    public static void main(String[] args)
    {

        /**
         * 在Java的所有运算符中，只有一个运算符具有多重含义：+
         *  1、作为数学运算的符号
         *  2、字符拼接
         *
         *
         * 算术运算符： + - * / %  ++ --
         *
         *
         */

        //int a = 10;

        //int b = a++;
        //a++;

        //a++ --- a=a+1  后加    先使用变量中的值，然后再进行加1操作

        //int b = ++a;
        //++a --- a=a+1  前加    先要将变量自身进行加1，然后再使用这个变量中的值

        //int b = a--;
        //a--  --- a=a-1  后减   先使用变量中值，然后变量自身再进行减1操作

        //int b = --a;
        //--a  --- a=a-1  前减   先将变量自身进行减1操作，然后再使用这个变量进行操作

        //System.out.println("b == "+b);
        //System.out.println("a == "+a);

        //double a = 3;
        //int b = 4;
        //double c = a/b;
        //System.out.println("c == "+c);


        //int a = -5;
        //int b = a%2;
        //int c = a%-2;
        //System.out.println("b == "+b);
        //System.out.println("c == "+c);

        /**
         * 赋值运算符：
         *
         * = += -= *= /= %=
         */

//        int a = 10;
//        a+=1;
//        a = a+1;
//        a*=2;
//        a = a*2;
//        a/=3;
//        a = a/3;
//        a%=2;
//        a = a%2;

        /**
         * 比较运算符：
         *
         * > < >= <= != ==
         */

        /**
         * 逻辑运算符：
         *
         * 逻辑运算符主要用来连接 表达式的结果为boolean的式子
         *
         * 能够产生boolean结构的运算符： 比较运算符， 逻辑运算符
         *
         * 逻辑单与：&   逻辑双与：&&
         * 逻辑单或：|   逻辑双或: ||
         * 逻辑非： ！
         * 逻辑异或：^
         *
         * 运算符的操作数：
         *  +   a+b
         *
         * 双元运算符
         * 单元运算符
         *
         *
         *
         */

//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        //                 fasle  false
//        System.out.println(!(a>b)&!(c>d));
//        System.out.println("==================");
//        System.out.println(true ^ true);
//        System.out.println(true ^ false);
//        System.out.println(false ^ false);
//        System.out.println(false ^ true);
//        System.out.println("==================");
//        System.out.println(!true);
//        System.out.println(!false);

//        int a = 10;
//        int b = 20;

        //逻辑单与： false    true --> 两个表达式都得到结果之后，再进行&操作
        //逻辑双与： fasle  --> 当第一个表达式为false时 直接得出结果
        //逻辑单或：  两个表达式都需要计算之后 再进行 或操作
        //逻辑双或: 当第一个表示为true时，直接得出结果
//        if( b>15 || a>15 )
//        {
//            System.out.println("AAA");
//        }
//        else
//        {
//            System.out.println("BBB");
//        }


        /**
         * 位运算符：
         *
         * 左移运算符： <<
         * 右移运算符: >>
         * 无符号右移：>>>
         *
         * 按位与： &    true false  1 0  有0则0
         * 按位或： |                     有1则1
         * 按位非： ~                     1变0  0 变1
         * 按位异或： ^                    相同为 0  不同1
         */
        // 0 000 0000 0000 0000 0000 0000 0000 0001
        // 0 000 0000 0000 0000 0000 0000 0000 0100
//        int a = 5;
//
//        int b = a << 3;
//
//        System.out.println("b == "+b);

        //5 * 8 = 40   5<<3  --> 5*2^3

//        int c = 1;
//        int d = 2;
////        int e = c|d;
//        int e = ~c;
        // 0 000 0000 0000 0000 0000 0000 0000 0001
        // 0 000 0000 0000 0000 0000 0000 0000 0010
        // 0 000 0000 0000 0000 0000 0000 0000 0011

//        System.out.println("e == "+e);


        /**
         * 条件运算符：
         * 三元运算符：
         *  ? :
         *  (结果为boolean表达式)?表达式1:表达式2
         */

        int a = 10;
        int b = 20;

        int c = (a>b)?a+100:b+200;

        if(a>b)
        {
            c = a+100;
        }
        else
        {
            c = b+200;
        }
        System.out.println("c == "+c);


    }
}
