package top.yunp.arraysdemo;

import java.util.Arrays;

public class EqualsTest {

    public static void main(String[] args)
    {
//        static boolean 	deepEquals​(Object[] a1, Object[] a2)
//        deepEquals比较的是多维数组， 比如二维数组
//        static boolean 	equals​(int[] a, int[] a2)
//        equals 比较两个数组，按照数组元素的向后顺序，如果元素为引用数据类型 需要对应的Java类实现equals
//         equals比较的是 一维数组
//        static boolean 	equals​(Object[] a, Object[] a2)

        Student[] stus = new Student[3];

        Student stu1 = new Student("张三",16,"男");
        Student stu2 = new Student("李四",20,"男");
        Student stu3 = new Student("王五",19,"女");

        stus[0] = stu1;
        stus[1] = stu2;
        stus[2] = stu3;

        Student[] stus1 = new Student[3];

        Student stu4 = new Student("张三",16,"男");
        Student stu5 = new Student("李四",20,"男");
        Student stu6 = new Student("王五",19,"女");

        stus1[0] = stu4;
        stus1[1] = stu5;
        stus1[2] = stu6;

        boolean result = Arrays.equals(stus,stus1);
        System.out.println("result == "+result);

//        String[] strs2 = {"AA","BB","CC"};
        String[][] strs1 = {{"AA","BB","CC"},{"AA","BB","CC"}};
        String[][] strs2 = {{"AA","BB","CC"},{"AA","BB","CC"}};

        result = Arrays.deepEquals(strs1,strs2);
        System.out.println("result == "+result);
    }
}
