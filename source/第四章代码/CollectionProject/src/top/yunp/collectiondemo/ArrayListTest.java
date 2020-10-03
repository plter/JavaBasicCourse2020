package top.yunp.collectiondemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    /**
     * 顶层接口 ： Collection<E>
     *
     * 子接口：    List<E>
     *                  static <E> List<E> 	of​(E... elements)
     *           Set<E>
     *
     *                  static <E> Set<E> 	of​(E... elements)
     *
     *           Queue<E>            Deque<E>
     *
     * 实现类：
     *          List--ArrasyList<E>  数组      索引
     *          List--Vector<E>      数组      索引       增删慢  获取快
     *          List--LinkedList<E>  链表                增删快  查找慢
     *          List--Stack<E>       栈                  先入后出
     *
     *          Set--HashSet<E>      哈希表
     *          Set--TreeSet<E>      树        利于查找元素
     *
     *
     *
     */

    public static void main(String[] args)
    {

//        1、增加
//        boolean 	add​(E e)
//        boolean 	addAll​(Collection<? extends E> c)

        ArrayList<String> strs = new ArrayList<>();

        strs.add("AAA");
        strs.add("BBB");
        strs.add("CCC");
        strs.add("DDD");

        //获取长度，有效长度
        int len = strs.size();

        for(int i =0 ;i<len ;i++)
        {
            //通过指定索引获取对应位置的元素
            System.out.println("i == "+i+"---"+strs.get(i));
        }

        System.out.println("=====================");

        ArrayList<String> strs1 = new ArrayList<>();

        strs1.addAll(strs);
        strs1.add("EEE");

        strs1.add(0,"HHHH");
        strs1.add(3,"HHHH");

        int len1 = strs1.size();

        for(int i = 0; i<len1; i++)
        {
            System.out.println("i == "+i+"---"+strs1.get(i));
        }
        System.out.println("=========================");

//        2、删除
//        boolean 	remove​(Object o)
//        之移除一个元素， 并且是索引比较小的，比较靠近前端
//        boolean 	removeAll​(Collection<?> c)

//        strs1.remove("HHHH");

//        ArrayList<String> str2 = new ArrayList<>();
//        str2.add("BBB");
//        str2.add("CCC");
//        str2.add("GGG");

        //移除的是 两个集合中的公共部分
//        strs1.removeAll(str2);

        /**
         * @FunctionalInterface
         * public interface Predicate<T>
         *     boolean 	test​(T t)
         */

        //移除符合指定条件的元素 这个条件可以使用Lamda表达式来书写
        strs1.removeIf((String str)->{return  str.length()>3;});

        //        void 	clear()

//        strs1.clear();

        int len2 = strs1.size();

        for(int i = 0; i<len2; i++)
        {
            System.out.println("i == "+i+"---"+strs1.get(i));
        }

        System.out.println("=========================");

//        3、判断是否包含
//        boolean 	contains​(Object o)
//        boolean 	containsAll​(Collection<?> c)

        ArrayList<String> strstr = new ArrayList<>();

        strstr.add("Java");
        strstr.add("Scala");
        strstr.add("Hadoop");
        strstr.add("Flink");
        strstr.add("Spark");

        System.out.println("是否包含："+strstr.contains("JavaWeb"));
        System.out.println("是否包含："+strstr.contains("Java"));

        ArrayList<String> strstr1 = new ArrayList<>();
//        strstr1.add("AAA");
//        strstr1.add("BBB");
//        strstr1.add("Kafka");
        strstr1.add("Java");
        strstr1.add("Scala");
        strstr1.add("Hadoop");
        strstr1.add("Flink");
//        strstr1.add("Spark");

        System.out.println("是否包含整个集合："+strstr.containsAll(strstr1));

//       4、保留交集    true：两个集合存在不同    false：两个集合完全相同
//        boolean 	retainAll​(Collection<?> c)

//        System.out.println("是否存在交集："+strstr.retainAll(strstr1));


        //增强for
        /**
         * 语法格式
         *
         * for(集合保存的元素的类型  变量名    :  集合的名称 )
         * {
         *      循环体
         * }
         */

        System.out.println("strstr------------");

        for(String ss : strstr)
        {
            System.out.println(ss);
        }
        System.out.println("strstr1----------------------");

        for(String ss: strstr1)
        {
            System.out.println(ss);
        }


//        5、判断
//        boolean 	equals​(Object o)
        System.out.println("是否相等："+strstr.equals(strstr1));
//        int 	hashCode()
        System.out.println("哈希值："+strstr.hashCode());
//        boolean 	isEmpty()
        strstr.clear();
        System.out.println("是否为空："+strstr.isEmpty());
//        int 	size()
//        Object[] 	toArray()
//            <T> T[] 	toArray​(T[] a)

//        6、迭代器遍历
//        Iterator<E> 	iterator()

        Iterator<String> it = strstr1.iterator();
        while(it.hasNext())
        {
            String el = it.next();
            System.out.println(el);
        }

    }
}
