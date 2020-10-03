package top.yunp.collectiondemo;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentTest {

    public static void main(String[] args)
    {

        ArrayList<String> strs1 = new ArrayList<>();

        strs1.add("AAA");
        strs1.add("BBB");
        strs1.add("CCC");

        Iterator<String> it1 = strs1.iterator();

        while(it1.hasNext())
        {
            String el = it1.next();
            //Exception in thread "main" java.util.ConcurrentModificationException
            if("BBB".equals(el))
            {
                strs1.remove(el);
//                strs1.add("DDDD");
            }
        }

        System.out.println(strs1);

        HashSet<String> strs2 = new HashSet<>();

        strs2.add("AAA");
        strs2.add("BBB");
        strs2.add("CCC");

        Iterator<String> it2 = strs2.iterator();

        while (it2.hasNext())
        {
            String el = it2.next();
            if("BBB".equals(el))
            {
                strs2.add("DDDD");
            }
        }
        System.out.println(strs2);

        TreeSet<String> strs3 = new TreeSet<>();

        strs3.add("AAA");
        strs3.add("BBB");
        strs3.add("CCC");

        Iterator<String> it3 = strs3.iterator();

        while (it3.hasNext())
        {
            //Exception in thread "main" java.util.ConcurrentModificationException
            String el = it3.next();
            if("BBB".equals(el))
            {
//                strs3.add("DDDD");
            }
        }

        System.out.println(strs3);

        /**
         * java.util.ConcurrentModificationException
         * 1、对于需要按照一定顺序进行组织元素的 集合 ，在通过 Iterator迭代器 进行迭代时，如果迭代过程中
         * 发生了对于集合元素的修改，这个时候 会出现 并发修改异常 ，比如TreeSet  ArrayList
         *
         * 2、如果不考虑元素的顺序，这个时候 不会出现并发修改异常  比如 HashSet
         *
         * 3、解决：
         *
         *      对于List分支 提功了 一种新的迭代器
         *      ListIterator<E> 	listIterator()
         */

        ArrayList<String> strs4 = new ArrayList<>();

        strs4.add("AAA");
        strs4.add("BBB");
        strs4.add("CCC");

        ListIterator<String> lit1 = strs4.listIterator();

        while (lit1.hasNext())
        {
            String el = lit1.next();

            if("BBB".equals(el))
            {
//                strs4.add("DDDD");

                lit1.add("DDDD");
            }
        }

        System.out.println(strs4);


        ArrayList<String> str5 = new ArrayList<>();
        str5.add("AAA");
        str5.add("BBB");
        str5.add("CCC");

        List<String> strs6 = Collections.synchronizedList(str5);

        Iterator<String> it6 = strs6.iterator();


//        synchronized (str5)
//        {

        while (it6.hasNext()) {
            String el = it6.next();

            if ("BBB".equals(el)) {
//                strs6.add("DDDD");
            }
        }

//        }

        System.out.println(strs6);


        //java.util.concurrent

        LinkedBlockingQueue<String> strs7  = new LinkedBlockingQueue<>();

        strs7.add("AAA");
        strs7.add("BBB");
        strs7.add("CCC");

        Iterator<String> it7 = strs7.iterator();

        while (it7.hasNext())
        {
            String el = it7.next();

            if("BBB".equals(el))
            {
                strs7.add("FFFFF");
            }

        }

        System.out.println(strs7);






    }
}
