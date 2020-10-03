package top.yunp.collectiondemo;

import java.util.*;

public class SetTest {

    public static void main(String[] args)
    {

        //1、不可变集合
        //static <E> Set<E> 	of​(E... elements)

        //Set<String> strs = Set.of("AAA","BBB","AAA");
        //java.lang.IllegalArgumentException: duplicate element: AAA
        //Set不可变集合  并且Set是不允许重复元素，所以使用 of 时不要给重复的数据

        Set<String> strs = Set.of("AAA","BBB");

        for(String str : strs)
        {
            System.out.println(str);
        }


        //2、是否允许重复元素 不允许   顺序问题（输入顺序与输出顺序）--> 无顺序

        //对于整体Set 是不允许重复元素存在，也就是如果两个元素满足 equals 是不能同时存在的，这个时候
        //String之所以 直接可以去除重复，适应已经重写了 hashCode equals 这两个方法
        //如果Set 中要保存 自定义的Java类 Student 这个时候Student类必须 重写 hashCode  equals

        HashSet<String> strs1 = new HashSet<>();
        strs1.add("AAA");
        strs1.add("BBB");
        strs1.add("CCC");
        strs1.add("DDD");
        strs1.add("DDD");
        strs1.add("DDD");
        System.out.println(strs1);

        //TreeSet是基于树 这种结构来实现的，比较利于查找，利于排序，对于String来说，存入
        //TreeSet集合之后，就会按照自然顺序进行排序
        //如果存储的元素不是String类，而是自定义的Java类 -- Student 这个时候需要Student类实现 Comparable
        TreeSet<String> strs11 = new TreeSet<>();
        strs11.add("AAA");
        strs11.add("BBB");
        strs11.add("CCC");
        strs11.add("DDD");
        System.out.println(strs11);


        //HashSet<Student> stus = new HashSet<>();
        TreeSet<Student> stus = new TreeSet<>();
        //TreeSet​(Comparator<? super E> comparator)
        TreeSet<Student> stus1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                int result = first.getName().compareTo(second.getName());

                result = (result == 0) ? first.getAge() - second.getAge() : result;

                result = (result == 0) ? first.getSex().compareTo(second.getSex()) : result;

                return result;
            }
        });
        //Exception in thread "main" java.lang.ClassCastException: class top.yunp.collectiondemo.Student cannot be cast to class java.lang.Comparable (top.yunp.collectiondemo.Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        //自定义Java类 需要实现Comparable接口

        //222
        Student stu1 = new Student("张三",15,"男");
        Student stu2 = new Student("李四",25,"男");
        Student stu3 = new Student("王五",25,"女");
        Student stu4 = new Student("张三",15,"男");

        //111
//        Teacher  tt1 = new Teacher();
//        Teacher  tt2 = new Teacher();
//        Teacher  tt3 = new Teacher();

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);

        System.out.println(stus);


        //3、遍历方式

        //a、索引遍历  --->  不支持

        System.out.println("Set集合不支持索引遍历");

        //b、增强for

        for(Student stu : stus)
        {
            System.out.println("增强for -- "+stu);
        }

        //c、迭代器遍历
        Iterator<Student> it = stus.iterator();

        while(it.hasNext())
        {
            System.out.println("迭代器 --- "+it.next());
        }

        System.out.println("==================================");

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

        TreeSet<String> sss = new TreeSet<>();

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

        //e、Set分支 不知支持 ListIterator 这种类似的遍历操作
    }
}
