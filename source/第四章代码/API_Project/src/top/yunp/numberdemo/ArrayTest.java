package top.yunp.numberdemo;

public class ArrayTest {

    public static void main(String[] args)
    {

        /**
         * 一维数组
         *
         * 1、定义
         *      数据类型[] 数组名称 = new 数据类型[数组长度];
         *
         *      数据类型[] 数组名称 = {元素1,元素2,元素3.....};
         *
         * 2、索引
         *      索引从0开始计数
         * 3、赋值
         *
         *      数组名称[索引值] = 数据;
         * 4、遍历
         *      使用for 根据索引去遍历
         *
         * 二维数组
         *
         * 1、定义
         *      数据类型[][] 数组名称 = new 数据类型[5][6];
         *
         *      数据类型[][] 数组名称 = {{5,6,7},{2,3,4},{4,2,1}};
         *
         * 2、索引
         *      行索引 0
         *      列索引 0
         *
         * 3、赋值
         *
         *      数组名称[行索引][列索引] = 数据;
         *
         * 4、遍历
         *      循环嵌套
         *
         *      *******
         *      *******
         *      *******
         *
         *
         */

//        int[] nums = new int[5];

//        int[] nums = {5,6,7,1,2};
//
//        for(int i =0; i<5;i++)
//        {
//            System.out.println(nums[i]);
//        }

        int[][] nums = new int[5][6];

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;
        nums[0][4] = 5;
        nums[0][5] = 6;
        nums[1][0] = 7;
        nums[1][1] = 8;


        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<6 ; j++)
            {
                System.out.print("nums["+i+"]["+j+"]=="+nums[i][j]+"    ");
            }
            System.out.println();
        }

        /**
         * 99乘法表
         *
         * 1*1=1
         * 1*2=2 2*2=4
         * 1*3=3 2*3=6 3*3=9
         *
         */

        String result = doJob(2,2);
        System.out.println("result ： "+result);

    }

    public static String doJob(int first, int second)
    {

        String[][] strs = new String[10][10];

        for(int i = 1; i<=9; i++)
        {
            for(int j =1; j<=i; j++)
            {
//                System.out.print(j+"*"+i+"="+(i*j)+"   ");
                String ss = j+"*"+i+"="+(i*j)+"   ";
                strs[i][j] = ss;
            }

//            System.out.println();
        }

//        for(int i = 1; i<=9;i++)
//        {
//            for(int j =1;j<=9;j++)
//            {
//                System.out.print(strs[i][j]+"     ");
//            }
//            System.out.println();
//        }

        /**
         * 1*1=1
         * 1*2=2 2*2=4
         */


        int max = (first>=second)?first:second;

        int min = (first>second)?second:first;

        return  strs[max][min];
    }
}
