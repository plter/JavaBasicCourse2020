package top.yunp.streamdemo;

import java.util.stream.Stream;

public class TakeTest {

    public static void main(String[] args)
    {

        //        元素处理逻辑
//        default Stream<T> 	takeWhile​(Predicate<? super T> predicate)
//        表示从原来的Stream获取一部分元素，这一部分元素为 (第一个元素， 不满足条件的第一个元素)
//        如果第一个元素就不满足条件，那么什么都获取不到
//        default Stream<T> 	dropWhile​(Predicate<? super T> predicate)
//        从原来的Stream中删除一部分元素， 这一部分指的是 (第一个元素， 不满足条件的第一个元素)
//        如果第一个元素 就不满足条件，那么久不会删除任何一个元素

        Stream<String> st1 = Stream.of("AA","BBB","CC","DDD");

        /**
         * @FunctionalInterface
         * public interface Predicate<T>
         *     boolean 	test​(T t)
         */
//        Stream<String> st2 =st1.takeWhile((String el)->{return el.length()>2;});
        Stream<String> st2 =st1.dropWhile((String el)->{return el.length()>2;});

        st2.forEach(System.out::println);

        System.out.println("=========================");

//        Stream<T> 	skip​(long n)
//        跳过Stream指定个数的元素，对于后续的元素进行返回
        Stream<String> st3 = Stream.of("AA","BB","CC","DD");

        Stream<String> st4  = st3.skip(3);

        st4.forEach(System.out::println);



//        Stream<T> 	distinct()

        System.out.println("====================");
        Stream<String> st5 = Stream.of("AA","BB","CC","DD","AA","CC");

        Stream<String> st6  = st5.distinct();

        st6.forEach(System.out::println);

//
//        Debug操作
//        Stream<T> 	peek​(Consumer<? super T> action)

        /**
         * @FunctionalInterface
         * public interface Consumer<T>
         *     void 	accept​(T t)
         */
        System.out.println("====================");
        Stream<String> st7 = Stream.of("AAAA","CCC","BBB");

        Stream<String> st8 = st7.peek((String el)->{System.out.println("当前正在处理的数据："+el);});

        st8.forEach(System.out::println);



    }
}
