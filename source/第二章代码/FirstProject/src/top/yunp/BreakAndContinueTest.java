package top.yunp;

/**
 * 这里讲解Java中循环的控制
 */
public class BreakAndContinueTest {

    public static void main(String[] args)
    {

//        break;
//        continue;

        for(int i = 0 ; i< 10 ;i++)
        {
            //break; 如果放在这个位置，会导致，循环一开始就停止
            //       换一句话来说，就是break之后的代码是不能执行的！
            System.out.println("i == "+i);

            break; //停止break所位于的那个循环的整个循环
        }

        for(int i = 0; i<5;i++)
        {
            //break; 不可以放在有效代码之前
            for(int j = 0; j<10; j++)
            {
                //break; 不可以位于有效代码之前
                System.out.print("*");
                break;
            }
            //break; 不能放在有效的代码之前
            System.out.println();
            //break;
        }

        //===================================================
        System.out.println("===============================");

        int i = 0;
        while (i<10)
        {
            i++;

            if(i % 2 == 0)
            {
                continue;
                //continue： 影响的是 其所在循环中 某次的循环 当满足条件时 停止的当前这一次的循环
                //           对于整个循环来说，继续后续的执行，知道再次遇到continue
            }
            //continue;
            System.out.println("i == "+i);
            //continue;


            //continue;  位于循环体的最后 貌似没有起到作用
        }

        int hang = 0;

        while(hang < 5)
        {
            int xing = 0;

            while(xing < 10)
            {
                xing++;

                if(xing>3)
                {
                    continue;
                    //在书写while循环时，不要将循环的增量代码放在continue之后
                }
                System.out.print("*");
                //xing = 0  xing =1 xing>3 false   *
                //xing = 1  xing =2 xing>3 false   **
                //xing = 2  xing =3 xing>3 false   ***
                //xing = 3  xing =4 xing>3 true    continue
                //xing = 4
                //xing = 5
                //xing = 6
                //xing = 7
                //xing = 8 xing = 9 xing>3  true  continue
                //xing = 9 xing =10 xing>3  true  continue
                //xing=10 xing<10

            }
            System.out.println();
            hang++;
        }

    }

}
