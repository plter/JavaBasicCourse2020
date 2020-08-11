package top.yunp;

public class FunctionTestTest {

    //程序入口   main方法  函数
    public static void main(String[] args) {

        //进行1-10求和
        sum();

        int result = sumsum();
        System.out.println("result == "+result);

        int res = check(result);
        System.out.println("res == "+res);

        System.out.println("========================================");
        printXing();

        System.out.println("========================================");
        pringOu();

    }



    //这里的sum 表示的是 形式参数
    public static int check(int sum)
    {

        if(sum > 50)
        {
            return sum+100;
        }
        else
        {
            return sum;
        }

//        return 0;
    }


    //方法的定义与书写过程
    public static void sum()
    {
        int sum =0 ;
        for(int i =1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("和："+sum);

        //对于没有返回值的方法，在最后自动添加了return,建议不要书写
        return;
    }


    public static int sumsum()
    {
        int sumsum = 0;

        for(int i =1; i<=10;i++)
        {
            sumsum += i;
        }

        return sumsum;
    }


    public static void printXing()
    {
        for(int i =0; i<5; i++)
        {
            for(int j =0;j<10;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pringOu()
    {
        for(int i =1; i<=10; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("偶数："+i);
            }
        }
    }


}
