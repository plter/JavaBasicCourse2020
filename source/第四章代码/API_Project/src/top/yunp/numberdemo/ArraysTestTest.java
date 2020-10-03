package top.yunp.numberdemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTestTest {

    public static void main(String[] args)
    {
//        对于工具类来说，构造方法私有化、成员方法都写为static
//        Arrays ss = new Arrays();

//        static int 	binarySearch​(int[] a, int key)
//        static int 	binarySearch​(int[] a, int fromIndex, int toIndex, int key)
//        查找过程中范围：[from,to)
//        static int 	binarySearch​(Object[] a, Object key)
//        如果元素存在于数组中，那么返回的时索引值，对应的这个索引值 需要考虑二分查找的规则
//        如果元素不存在与数组中，那么返回的数值是一个负数， 这个数值表示什么呢？
//            表示的是，如果想要将查找的这个元素，插入到当前数组中，他应该插入的位置，去这个数值的负数
//            这个位置的计算，不是按照索引从0开始那样，而是从1开始
//
//        static void 	sort​(Object[] a)
//        对于指定数组进行排序操作

//        int[] nums = {2,3,4,1,7,2,1,8};

//        这样的一个查找操作是利用二分查找来实现出来
//        1 2 3 4 5 6 7 8 9
//        0       4   6   8  --> 4 ---> 5 ---> 6  ---> 5
//        6
//        Arrays.sort(nums);
//        for(int i = 0 ;i<nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//        System.out.println();
//        int result =  Arrays.binarySearch(nums,11);
//        int result =  Arrays.binarySearch(nums,4,7,1);
//        System.out.println("result == "+result);


        //static int 	binarySearch​(Object[] a, Object key)

//        Student[] stus = new Student[5];
//
//        Student stu1 = new Student("张三",10,"男");
//        Student stu2 = new Student("李四",11,"男");
//        Student stu3 = new Student("王五",20,"男");
//        Student stu4 = new Student("赵六",18,"女");
//        Student stu5 = new Student("孙七",20,"女");
//
//        stus[0]=stu1;
//        stus[1]=stu2;
//        stus[2]=stu3;
//        stus[3]=stu4;
//        stus[4]=stu5;
//
//        Arrays.sort(stus);
//
//        for(int i = 0 ;i<5; i++)
//        {
//            System.out.println(stus[i]);
//        }
//
//
//        int result = Arrays.binarySearch(stus,stu5);
//
//        System.out.println("stu5 -- result == "+result);
//
//        Student stu6 = new Student("孙七",20,"女");
//
//        result = Arrays.binarySearch(stus,stu6);
//
//        System.out.println("stu6 -- result == "+result);
//
//        System.out.println("===============================");

//        String[] strs = new String[5];
//        strs[0] = "AA";
//        strs[1] = "FF";
//        strs[2] = "DD";
//        strs[3] = "BB";
//        strs[4] = "CC";
//
//        Arrays.sort(strs);
//
//        for(int i = 0; i< 5; i++)
//        {
//            System.out.println(strs[i]);
//        }
//
//        int result1 = Arrays.binarySearch(strs,"BB");
//
//        System.out.println("result1 == "+result1);


//        Exception in thread "main" java.lang.ClassCastException: class top.yunp.numberdemo.Student cannot be cast to class java.lang.Comparable (top.yunp.numberdemo.Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//            at java.base/java.util.Arrays.binarySearch0(Arrays.java:2440)
//            at java.base/java.util.Arrays.binarySearch(Arrays.java:2382)
//            at top.yunp.numberdemo.ArraysTestTest.main(ArraysTestTest.java:57)



//        static int 	compare​(int[] a, int[] b)
//        static <T extends Comparable<? super T>> int 	compare​(T[] a, T[] b)
//        static <T> int 	compare​(T[] a, T[] b, Comparator<? super T> cmp)



//        Student[] stus1 = new Student[5];
//
//        Student stu1 = new Student("张三",10,"男");
//        Student stu2 = new Student("李四",11,"男");
//        Student stu3 = new Student("王五",20,"男");
//        Student stu4 = new Student("赵六",18,"女");
//        Student stu5 = new Student("孙七",20,"女");
//
//        stus1[0]=stu1;
//        stus1[1]=stu2;
//        stus1[2]=stu3;
//        stus1[3]=stu4;
//        stus1[4]=stu5;
//
//        Student[] stus2 = new Student[5];
//
//        Student stu6 = new Student("张三",10,"男");
//        Student stu7 = new Student("李四",11,"男");
//        Student stu8 = new Student("王五",20,"男");
//        Student stu9 = new Student("赵六",18,"女");
//        Student stu10 = new Student("孙七",20,"女");
//
//        stus2[0]=stu7;
//        stus2[1]=stu6;
//        stus2[2]=stu8;
//        stus2[3]=stu9;
//        stus2[4]=stu10;
//
//        Arrays.sort(stus1);
//        Arrays.sort(stus2);
//
//        int result = Arrays.compare(stus1,stus2);
//
//        System.out.println("result == "+result);


        Teacher[] t1 = new Teacher[3];
        Teacher tea1 = new Teacher("张三",25,"男");
        Teacher tea2 = new Teacher("李四",25,"男");
        Teacher tea3 = new Teacher("王五",25,"男");

        t1[0] = tea1;
        t1[1] = tea2;
        t1[2] = tea3;

        Teacher[] t2 = new Teacher[3];
        Teacher tea4 = new Teacher("张三",25,"男");
        Teacher tea5 = new Teacher("李四",25,"男");
        Teacher tea6 = new Teacher("王五",25,"男");

        t2[0] = tea4;
        t2[1] = tea5;
        t2[2] = tea6;

        //        static <T> int 	compare​(T[] a, T[] b, Comparator<? super T> cmp)
        //    static <T> void 	sort​(T[] a, Comparator<? super T> c)
//        Arrays.sort(t1, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//
//                int result = o1.getName().compareTo(o2.getName());
//
//                result = (result == 0)?o1.getAge()-o2.getAge():result;
//
//                result = (result == 0)?o1.getSex().compareTo(o2.getSex()):result;
//
//                return result;
//            }
//        });
//        Arrays.sort(t2, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//
//                int result = o1.getName().compareTo(o2.getName());
//
//                result = (result == 0)?o1.getAge()-o2.getAge():result;
//
//                result = (result == 0)?o1.getSex().compareTo(o2.getSex()):result;
//
//                return result;
//            }
//        });
//
//        //1、参数类型是一个接口 可以传入其实现类  --> 匿名内部类
//        int result1 = Arrays.compare(t1, t2, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//
//                int result = o1.getName().compareTo(o2.getName());
//
//                result = (result == 0)?o1.getAge()-o2.getAge():result;
//
//                result = (result == 0)?o1.getSex().compareTo(o2.getSex()):result;
//
//                return result;
//            }
//        });

        /**
         * 函数式接口
         * @FunctionalInterface
         * public interface Comparator<T>
         *     int 	compare​(T o1, T o2)
         */
       int result1 =  Arrays.compare(t1,t2,(Teacher o1,Teacher o2)->{
            int result = o1.getName().compareTo(o2.getName());
            result = (result == 0)?o1.getAge()-o2.getAge():result;
            result = (result == 0)?o1.getSex().compareTo(o2.getSex()):result;
            return result;
        });
        System.out.println("result1 == "+result1);















    }
}
