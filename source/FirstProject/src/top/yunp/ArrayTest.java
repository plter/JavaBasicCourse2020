package top.yunp;

/**
 * 这里讲解数组的使用
 */
public class ArrayTest {

    public static void main(String[] args)
    {
        /**
         * 数组：一组数据  多个概念
         *
         * 容器：  数据类型  容纳空间
         *
         * 数据类型[]  数组名称 = new 数据类型[整数];
         *
         */

        //对于基本数据类型，在进行遍历定义之后，要对变量进行赋值操作，否则会出现错误
        int a ;
        a = 10;

        System.out.println("a == "+a);

        //引用数据类型： 对于引用数据类型，在进行了变量的定义之后 存在初始值
        int[] nums = new int[5];


        //数据类型[]  数组名称 = new 数据类型[整数];
        //--------   -----
        //数据类型     变量名 =  值;


        //使用索引： 数组名称[整数] ---> 索引从 0开始  nums[0] nums[1] nums[2] nums[3] nums[4]

        for(int i = 0; i<5; i++)
        {
            System.out.println(nums[i]);
        }

        double[] numd = new double[5];

        for(int i = 0; i<5; i++)
        {
            System.out.println(numd[i]);
        }

        boolean[] bols = new boolean[5];

        for(int i = 0; i<5; i++)
        {
            System.out.println(bols[i]);
        }

        char[] chs = new char[5];

        for(int i = 0; i<5; i++)
        {
            System.out.println(chs[i]);
        }

        System.out.println(" ================= ");

        //ArrayIndexOutOfBoundsException
        String[] strs = new String[5];

        strs[0] = "AAA";
        strs[1] = "BBB";
        strs[2] = "CCC";
        strs[4] = "DDD";
        //strs[5] = "FFF";

        strs[0] = "QQQ";

        for(int i = 0; i<5; i++)
        {
            System.out.println(strs[i]);
        }



    }
}
