package top.yunp.genericdemo;

import java.util.stream.Stream;

public class GenericTest {

    public static void main(String[] args)
    {

        /**
         * 泛型：
         *
         *  需求：
         *      数组： 数据类型[] 数组名称 = new 数据类型[数组长度];
         *
         *      能否 自己定义一个类 ，用来担当容器的角色， 可完成数据的存储获取的操作
         *
         */

        MyContainer<String> container = new MyContainer<String>();

        container.addData("AAA");
        container.addData("BBB");
        container.addData("CCC");

        System.out.println(container.getData(0));
        System.out.println(container.getData(1));
        System.out.println(container.getData(2));
        System.out.println(container.getData(3));

        MyContainer<Student> container1 = new MyContainer<Student>();

        Student stu1 = new Student("张三",10,"男");
        Student stu2 = new Student("李四",20,"男");
        Student stu3 = new Student("王五",30,"男");

        container1.addData(stu1);
        container1.addData(stu2);
        container1.addData(stu3);

        System.out.println(container1.getData(0));
        System.out.println(container1.getData(1));
        System.out.println(container1.getData(2));
        System.out.println(container1.getData(3));

        System.out.println("===========================");

        container.forEach(System.out::println);
        System.out.println("===================================");
        container1.forEach(System.out::println);

        System.out.println("===================================");
        String str = "AAA\n" +
                "BBB\n" +
                "CCC";

        Stream<String> st = str.lines();

        /**
         * @FunctionalInterface
         * public interface Consumer<T>
         *     void 	accept​(T t)
         */
        st.forEach(System.out::println);

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        String str1 = "ABCD";
        String str2 = "ABD";

        boolean result = GenericTool.doCheck(str1,str2);
        System.out.println("result == "+result);

        Student stu4 = new Student("张三",10,"男");
        Student stu5 = new Student("张三",10,"男");

        result = GenericTool.doCheck(stu4,stu5);
        System.out.println("result == "+result);
    }
}
