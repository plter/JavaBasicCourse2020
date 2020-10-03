package top.yunp.streamdemo;

import java.util.Optional;
import java.util.stream.Stream;

public class FindTest {

    public static void main(String[] args)
    {

        //        查找、统计、转换为数组
//        Optional<T> 	findAny()
//        Optional<T> 	findFirst()
//        获取第一个元素

        Stream<String> st1 = Stream.of("AA","BB","DD","CC","EE");

//        Stream<String> st11 = st1.sorted();
        /**
         *
         *@FunctionalInterface
         *public interface Comparator<T>
         *    int 	compare​(T o1, T o2)
         */
        Stream<String> st11 = st1.sorted((String el1, String el2)->{return -el1.compareTo(el2);});

        Optional<String> op1 = st11.findFirst();

        System.out.println("findFirst = "+op1.get());

        System.out.println("=============================");

        Stream<String> st2 = Stream.of("BB","AAA","DDD","CCCC","EEEE");

        /**
         * @FunctionalInterface
         * public interface Predicate<T>
         *     boolean 	test​(T t)
         */
        Stream<String> st22 = st2.filter((String el)->{return el.length() > 4;});

        Stream<String> st222 = st22.sorted((String el1, String el2)->{return -el1.compareTo(el2);});
        Optional<String> op2 = st222.findAny();

        //Exception in thread "main" java.util.NoSuchElementException: No value present
//        System.out.println("findAny == "+op2.get());
//        对于 Optional 的 get 操作在没有数据的时候 容易出现异常， 可以使用 orElse来代替
        System.out.println("findAny == "+op2.orElse(""));

//        long 	count()

        Stream<String> st3 =  Stream.of("AA","BB","CC");

        System.out.println("长度："+st3.count());

//        Object[] 	toArray()
//            <A> A[] 	toArray​(IntFunction<A[]> generator)
//
//        遍历
//        void 	forEach​(Consumer<? super T> action)
//        void 	forEachOrdered​(Consumer<? super T> action)

        Stream<String> st4 =  Stream.of("AA","CC","BB","DD","EE","HHH","FFF");

        st4.forEachOrdered(System.out::println);

        System.out.println("===========================");

        Stream<String> st5 =  Stream.of("AA","CC","BB","DD","EE","HHH","FFF");

        Stream<String> st6 = st5.parallel();

//        st6.forEach(System.out::println);

        st6.forEachOrdered(System.out::println);


    }
}
