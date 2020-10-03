package top.yunp.collectiondemo;

import java.util.*;

public class ListTest {


    public static void main(String[] args)
    {

        //1、不可变集合
        //static <E> List<E> 	of​(E... elements)

        //ArrayList<String> strs = (ArrayList<String>) List.of("AAA","BBB");
        //Exception in thread "main" java.lang.ClassCastException
        //不可以将不可以变集合 转换  为可变化集合

        List<String> strs = List.of("AAA","BBB","AAA");

        //不可变集合 是不能  进行增、删操作
        //strs.add("CCC");
        //strs.clear();
        //Exception in thread "main" java.lang.UnsupportedOperationException

        for(String str : strs)
        {
            System.out.println(str);
        }


        //2、是否允许重复元素   顺序问题（输入顺序与输出顺序）

        //如果List 存储 自定义的Java类时，就不需要考虑那么多了！

        ArrayList<String> strs1 = new ArrayList<>();
        strs1.add("AAA");
        strs1.add("BBB");
        strs1.add("CCC");
        strs1.add("DDD");
        strs1.add("DDD");
        strs1.add("DDD");
        System.out.println(strs1);

        //List存储自定义Java类

        ArrayList<Teacher> teachers = new ArrayList<>();
        //LinkedList<Teacher> teachers = new LinkedList<>();
        //Vector<Teacher> teachers = new Vector<>();
        //Stack<Teacher> teachers = new Stack<>();

        Teacher t1 = new Teacher("张三",10,"男");
        Teacher t2 = new Teacher("李四",19,"女");
        Teacher t3 = new Teacher("王五",23,"男");
        Teacher t4 = new Teacher("张三",10,"男");

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        System.out.println(teachers);

        //3、遍历
        //a、索引遍历      增强for    iterator遍历

        //a、索引遍历

        int len = teachers.size();
        for(int i= 0; i < len ; i++)
        {
            System.out.println("索引："+i+"---"+teachers.get(i));
        }

        //b、增强for

        for(Teacher tt : teachers)
        {
            System.out.println("增强for -- "+tt);
        }

        //c、迭代器遍历

        Iterator<Teacher> it = teachers.iterator();

        while(it.hasNext())
        {
            System.out.println("迭代器遍历 -- "+it.next());
        }

        //d、default Spliterator<E> spliterator()

        //并行 在某一个时刻 同时运行多个程序代码     并发  在某一时段 同时运行多个程序代码
        /**
         * public interface Spliterator<T>
         *      boolean 	tryAdvance​(Consumer<? super T> action)
         *      Spliterator<T> 	trySplit()
         *
         * @FunctionalInterface
         * public interface Consumer<T>
         *     void 	accept​(T t)
         */

        ArrayList<String> sss = new ArrayList<>();

        sss.add("AAA");
        sss.add("BBB");
        sss.add("CCC");
        sss.add("DDD");
        sss.add("EEE");
        sss.add("FFF");
        sss.add("GGG");
        sss.add("HHH");
        sss.add("III");

        Spliterator<String> spli = sss.spliterator();

        Spliterator<String> first = spli.trySplit();

        Spliterator<String> second = spli.trySplit();

        while(spli.tryAdvance(System.out::println));
        System.out.println("=========");
        while(first.tryAdvance(System.out::println));
        System.out.println("=========");
        while(second.tryAdvance(System.out::println));


        //e、List分支 支持 ListIterator 这种遍历操作


        ArrayList<Student> stus = new ArrayList<>();

        //Java的内存  栈  堆  方法区 ---> new 执行操作时，会在堆中开辟内存，如果执行new 操作时，指定的是同一个类
        //  并且初始化的数据时相同的，这个时候 会发生 不会重新开辟内存空间
        Student stu1 = new Student("张三",10,"男");
        Student stu2 = new Student("张三",10,"男");

        stus.add(stu1);
        stus.add(stu2);

        stu1.setAge(15);

        List<Student> stus1 = List.copyOf(stus);

        System.out.println("stus --- "+stus);
        System.out.println("stus1 --- "+stus1);

        //copyOf操作 返回的集合是 不可修改
        //stus1.clear();

        stus1.get(0).setAge(50);

        System.out.println("stus1 --- "+stus1);


    }
}
