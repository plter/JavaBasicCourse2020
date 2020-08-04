package top.yunp;

/**
 * 当前代码用来解释 Java中的逻辑结构
 *
 * 顺序结构
 * 选择结构
 * 循环结构
 */
public class Demo {

    public static void main(String[] args)
    {
        /*
        顺序结构：

        我们在编写代码时 ，都是从上到下的一次编写，执行时 也是按照基本的从上到下的顺序去执行的。

         */

        /*
        选择结构：

        if --- else ---
         */

        int num1 = 10;
        int num2 = 20;

//        int num3 =100;

//        int num1 = 20;

        //要完成大小的比较操作，需要使用到运算符： 比较运算符！
//        选择结构的格式:
//        if(比较的表达式)
//        {
//
//        }
//        else
//        {
//
//        }

//        比较运算符: >  <  == >= <= !=
        if( num1 > num2 )
        {
//            这个变量的定义 也是在 main方法的作用范围之内！
//            int num1 = 30;
            //true
            num1 = 100;
            System.out.println("num1比较大==="+num1);
        }
        else
        {
            //false

            num2 = 200;


            System.out.println("num2比较大 === "+num2);
//            System.out.println("num3 === "+num3);
        }

        //变量的有效范围
        //1、在方法内，最大范围就是在 方法的大括号这一层，如果是在其中 if选择等等大括号内，不能够重复定义
        //   相同名称的变量
        //   变量的作用范围：从该变量的定义位置向外寻找 直到遇到的 第一层大括号，就是其有效范围
        //2、变量使用时：
        //   变量使用时，按照就近原则来使用，如果当前最近的范围内没有改变量，继续向外层寻找
        //3、变量的使用与变量的定义的顺序关系
        //   变量必须先要进行定义 对于基本数据类型来说定义之后 必须进行赋值操作 才可以使用！


        int num3 = 100;

        //选择结构的嵌套  if嵌套

        int money = 5000;

        if( money > 3000)
        {
            System.out.println("需要缴税！");

            if(money > 6000)
            {
                System.out.println("缴费比例：A");

                if(money > 9000)
                {
                    System.out.println("缴费标准：B");
                }
            }
            else
            {
                System.out.println("3000-6000");

            }
        }
        else
        {
            System.out.println("免税");
        }


//        if(条件判断1)
//        {
//
//        }
//        else if(条件判断2)
//        {
//
//        }
//        else if(条件判断3)
//        {
//
//        }
//        else
//        {
//
//        }

        //  a>b>c   3000>=money>=0
//        逻辑运算符：   boolean
//        逻辑与：&    逻辑或：|   逻辑非：！   逻辑异或：^
        if(money>=0 & money<=3000)
        {
            System.out.println("不用缴税");
        }
        else if(money > 3000 & money<= 6000)
        {
            System.out.println("缴费标准A");
        }
        else if(money > 6000 & money <= 9000)
        {
            System.out.println("缴费标准B");
        }
        else
        {
            System.out.println("缴费标准C");
        }

        //模拟一个选择题判断结果

        //A B C D --> char

        char chch = '1';

        switch (chch)
        {
            case 'A':
                System.out.println("选择了A");
                //编写具体符合这种情况分支的逻辑代码！
                break;
            case 'B':
                System.out.println("选择了B");
                break;
            case 'C':
                System.out.println("选择了C");
                break;
            case 'D':
                System.out.println("选择了D");
                break;
            default:
                System.out.println("您的选择存在错误，请重新选择");
                break;

        }

        //美食   运动  电影   塑身
        // 001   002  003  004
        String choice = "运动";

        switch (choice)
        {
            case "美食":
                System.out.println("推荐各种美食！");
                break;
            case "运动":
            case "塑身":
                System.out.println("私人教练");
                break;
            case "电影":
                System.out.println("电影优惠券");
                break;
        }


    }
}
