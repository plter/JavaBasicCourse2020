package top.yunp;

/**
 * 当前代码完成的是关于Java中的逻辑结构的讲解
 *
 * 循环结构
 */
public class CircleTest {

    public static void main(String[] args)
    {
        //for循环

        //起始  判断条件   增量
        //   循环具体的操作内容

//        for(循环的初始条件 ; 循环的判断条件 ; 循环的增量 )
//        {
//            循环体
//        }

        //i++   i = i+1
        for(int i = 0 ; i<5 ; i++)
        {
            System.out.println(i);
        }

        //循环结束之后 i=？
        /*
        int i = 0  i=0  i<5   true  System.out.println(i) 0  i=0+1 = 1
                   i=1  i<5   true  System.out.println(i) 1  i=1+1 = 2
                   i=2  i<5   true  System.out.println(i) 2  i=2+1 = 3
                   i=3  i<5   true  System.out.println(i) 3  i=3+1 = 4
                   i=4  i<5   true  System.out.println(i) 4  i=4+1 = 5
                   i=5  i<5   false

         */

        //求解 1-100 以内 奇数和
        //怎么才能完成上面的工作？
        //编程是什么？   编程用来解决工作与生活实际问题，需要将问题明确并且与编程的代码进行对应!

        //如何对应？
        //1、从实际问题中可以 获取什么？  有什么？
        //2、做什么？
        //3、以什么逻辑去做？  逻辑是什么？ 怎么做？

        //有什么？   数字：1 100  --- 数据 （数据类型  变量名）
        //做什么？   要知道哪个数是奇数？--选择  求和：加法
        //怎么做？   循环

        //数学运算符的符号  算术运算符
        // + - * / % ++ --

        // 5%2 -- 1

        int sum = 0;
        for(int j = 1; j<=100; j++)
        {
//            int sum = 0;  对于和的保存操作在这里 不合理
            //判断j是不是奇数，是的话做加法
            if(j%2 != 0)
            {
                //求和
//                int a = 10;
//                int b = 20;
//                int sum = a+b;
                //变量定义注意其作用范围
//                int sum = 0;  对于和的保存 定义在这里是不合理的！
                sum = sum+j;
//                System.out.println("和："+sum);
//                这一行代码位于 if判断中 条件每次成立的时候 都会执行一次
            }
//            System.out.println("和："+sum); //不可以！

        }
        System.out.println("和："+sum);








        //求的是： 1-100之间  奇数和  偶数和
        //有什么？  1-100
        //做什么？  判断奇数 求和    判断偶数  求和
        //怎么做？  循环

        //定义变量sum 用来保存 奇数和
        int sumj = 0;
        int sumo = 0;
        //循环执行
        for(int i =1 ; i<=10; i++)
        {
            //判断数字是否为奇数
            if(i%2 != 0)
            {
                //奇数
                //1 3 5 7 9
                sumj = sumj+i;
            }
            else
            {
                //偶数
                //2 4 6 8 10
                sumo = sumo + i;
            }

        }
        System.out.println("奇数和为："+sumj);
        System.out.println("偶数和为："+sumo);


        /*

        问题：一行12个*  4行
        ************
        ************
        ************
        ************

        每次只能输出一个 *

        分析：

        有什么？  行4   列 12
        做什么？  System.out.print("*")
        怎么做？  循环嵌套

        第一行 ： ********** \n
        第二行：  ********** \n
        第三行：  ********** \n
        第四行：  ********** \n

        *
        **
        ***
        ****

           *
          **
         ***
        ****
          *
         ***
        *****
       *******
        *****
         ***
          *



         */

        for( int i = 0;i<4 ; i++)  //循环的声明
        {
            //循环体
            //第一部分：用来输出多个*
            for( int j =0 ; j<12 ;j++  )
            {
                System.out.print("*");
            }
            //第二部分：用来输出换行操作
            System.out.println();

        }




        /*
        问题： 对于1-100之间的数 进行判断 其是否为素数（质数）

        数学知识：  除了1与本身之外 没有其他因子的数字

                4： 1*4 2*2
                3： 1*3

        分析：
            有什么？
                1 100
            做什么？
                判断某个数字是否为素数  是的话 可以将其输出到屏幕上
                    分析：
                        有什么？ 数字 ： 3 5 4
                        做什么？
                            人的大脑？
                                4:1*4 2*2
                                3:1*3
                                划分因子：

                                17： 1 2 3 4 5 6 7 8 。。。。 17
                        怎么做？
                            每一次都是用固定的一个数字num 去除其他的数字多次
                            循环
            怎么做？
                循环


         */

        for(int num = 1 ; num <= 10000; num++)
        {
            //定义一个变量用来记录 整除的次数
            int count = 0;
            //循环操作 从1-num的整除操作
            for( int j = 1 ; j<=num ; j++  )
            {
                if(num%j==0)
                {

                    count++;
                }
            }
            //判断进行输出
            if(count == 2)
            {
                System.out.println("素数："+num);
            }
        }






    }
}
