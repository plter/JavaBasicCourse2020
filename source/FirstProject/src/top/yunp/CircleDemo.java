package top.yunp;

/**
 * 继续讲解Java的循环结构
 */
public class CircleDemo {

    public static void main(String[] args)
    {

        /*
        while循环

        for循环的格式：

        for(循环的初始条件;循环的判断条件;增量)
        {
            循环体
        }

        while循环的格式：

        循环的初始条件
        while(循环的判断条件)
        {
            循环体
            增量
        }
         */

        //问题： 1-10 求和

        int num = 1;
        int sum = 0;
        while(num<=10)
        {
//            sum = sum+num;
            //赋值运算符
            // = += -= *= /= %=
            sum += num;

            num++;

        }
        System.out.println("1-10的和为："+sum);

        /**
         * *******
         * *******
         * *******
         */

        /**
         * 分析：
         *      有什么？  3  7
         *      做什么？ 输出* 换行
         *      怎么做？ 循环嵌套
         */

        int hang = 0;

        while(hang < 3)
        {
            //第一部分
            int xing = 0;
            while(xing < 7)
            {
                System.out.print("*");

                xing++;
            }

            //第二部分
            System.out.println();

            hang++;
        }

        /**
         * 问题： 一张纸：1cm  需要折叠多少次 能够达到一定厚度 1m = 100cm
         *
         * 分析：
         *
         *      有什么？  1cm  100cm
         *      做什么？
         *      怎么做？
         *
         */

        int high = 1;

        int count = 0;
        while(high < 100)
        {
            high = high*2;
            System.out.println("折叠之后的厚度："+high+"cm");
            count++;
        }

        System.out.println("折叠的次数："+count);

        /**
         *
         * for循环：
         *
         *  for(循环的初始条件;循环的判断条件;循环的增量)
         *  {
         *      循环体
         *  }
         *
         *  for(int i = 0; i<100; i++)
         *  {
         *      数组等具有索引的结构：
         *      索引从0开始
         *  }
         *  1、次数明确
         *  2、索引
         *  3、具体数据
         *
         *  while循环
         *
         *  循环的初始条件
         *  while(循环的判断条件)
         *  {
         *      循环体
         *      增量
         *  }
         *  1、特殊：如果对于循环的次数不是很明确，但是对于循环的终止条件比较明确
         *      这个时候可以使用while循环更好一些
         *
         *
         */


        /**
         * do...while 循环
         */

//        do {
//
//        }while(循环的判断条件);

//        while(循环的判断条件)
//        {
//
//        }

        int a = 3;

        while(a<3)
        {
            System.out.println("a == "+a);

            a++;
        }

        int b =3;

        do{
            System.out.println("b=="+b);
            b++;
        }while(b<3);

        // do...while循环来说，当循环的判断条件不成立时，最少会执行一次循环体
        //                   若循环体中的代码将循环条件判断需要的变量的值进行了更改，使其满足
        //                   循环条件时，就有可能执行多次！

    }

}
