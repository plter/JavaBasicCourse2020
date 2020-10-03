package top.yunp.collectiondemo;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class SpliteratorTest {

    public static void main(String[] args)
    {

        ArrayList<String> strs1 = new ArrayList<>();
        strs1.add("AAA");
        strs1.add("BBB");
        strs1.add("CCC");

        Spliterator<String> spl1 = strs1.spliterator();
        System.out.println("ArrayList ---------------- ");

        doCheck(spl1);

        Spliterator<String> spl11 = spl1.trySplit();
        doCheck(spl11);

        HashSet<String> strs2 = new HashSet<>();

        strs2.add("AAA");
        strs2.add("BBB");
        strs2.add("CCC");

        System.out.println("HashSet ---------------- ");

        Spliterator<String> spl2 = strs2.spliterator();
        doCheck(spl2);

        TreeSet<String> strs3 = new TreeSet<>();

        strs3.add("AAA");
        strs3.add("BBB");
        strs3.add("CCC");

        Spliterator<String> spl3  = strs3.spliterator();

        System.out.println("TreeSet ------------- ");

        doCheck(spl3);

        /**
         * Collectiions 工具类
         * static <T> List<T> 	synchronizedList​(List<T> list)
         */

        //通过synchronizedList​ 这个方法创建出来的集合  中 部分方法满足线程安全操作
        List<String> strs4 =  Collections.synchronizedList(strs1);

        Spliterator<String> spl4 = strs4.spliterator();

        System.out.println("Collections.synchronizedList  ------ ");

        doCheck(spl4);

        /**
         * java.util.concurrent
         * 这个包中的集合 都是 支持线程安全操作， 建议 在多线程场景下，如果需要使用集合，直接使用这里的
         */

        LinkedBlockingQueue<String> strs5 = new LinkedBlockingQueue<>();

        strs5.add("AAA");
        strs5.add("BBB");
        strs5.add("CCC");

        Spliterator<String> spl5 = strs5.spliterator();

        System.out.println("java.util.concurrent -------------- ");

        doCheck(spl5);

    }

    public static void doCheck(Spliterator<String> spliterator)
    {
        System.out.println("CONCURRENT == "+spliterator.hasCharacteristics(Spliterator.CONCURRENT));
        System.out.println("DISTINCT == "+spliterator.hasCharacteristics(Spliterator.DISTINCT));
        System.out.println("IMMUTABLE == "+spliterator.hasCharacteristics(Spliterator.IMMUTABLE));
        System.out.println("NONNULL == "+spliterator.hasCharacteristics(Spliterator.NONNULL));
        System.out.println("ORDERED == "+spliterator.hasCharacteristics(Spliterator.ORDERED));
        System.out.println("SIZED == "+spliterator.hasCharacteristics(Spliterator.SIZED));
        System.out.println("SORTED == "+spliterator.hasCharacteristics(Spliterator.SORTED));
        System.out.println("SUBSIZED == "+spliterator.hasCharacteristics(Spliterator.SUBSIZED));
    }
}
