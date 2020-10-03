package top.yunp.mapdemo;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args)
    {

        TreeMap<String,Student> k_stus = new TreeMap<>();

        Student stu1 = new Student("张三",10,"男");
        Student stu2 = new Student("李四",20,"男");
        Student stu3 = new Student("王五",30,"男");

        k_stus.put("1",stu1);
        k_stus.put("2",stu2);
        k_stus.put("3",stu3);

        System.out.println(k_stus);

        TreeMap<Teacher,String> k_teas = new TreeMap<>();

        //TreeMap ： 1、key 是不允许重复   2、存储在TreeMap中的数据 是按照 key的排序管理的

        Teacher t1 = new Teacher("张三",25,"女");
        Teacher t2 = new Teacher("李四",25,"女");
        Teacher t3 = new Teacher("王五",25,"女");
        Teacher t4 = new Teacher("王五",25,"女");

        //Exception in thread "main" java.lang.ClassCastException: class top.yunp.mapdemo.Teacher cannot be cast to class java.lang.Comparable (top.yunp.mapdemo.Teacher is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')

        k_teas.put(t1,"老师一");
        k_teas.put(t2,"老师二");
        k_teas.put(t3,"老师三");
        k_teas.put(t4,"老师四");

        System.out.println(k_teas);


        HashMap<Worker,String> k_wks = new HashMap<>();

        //如果使用HashMap 存储数据时 使用 自定义Java类 作为key  这个时候 对应的Java类 需要重写 hashCode equals方法4
        //HashMap 没有对key 进行排序，所以 重写 Comparable 这个接口是没有意义的！
        Worker wk1 = new Worker("张三",40,"男");
        Worker wk2 = new Worker("李四",30,"男");
        Worker wk3 = new Worker("王五",20,"男");
        Worker wk4 = new Worker("王五",20,"男");

        k_wks.put(wk1,"工人一");
        k_wks.put(wk2,"工人二");
        k_wks.put(wk3,"工人三");
        k_wks.put(wk4,"工人四");

        System.out.println(k_wks);
    }
}
