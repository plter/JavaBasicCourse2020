package top.yunp.streamdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapTest {

//    <R> Stream<R> 	flatMap​(Function<? super T,​? extends Stream<? extends R>> mapper)
//    DoubleStream 	flatMapToDouble​(Function<? super T,​? extends DoubleStream> mapper)
//    IntStream 	flatMapToInt​(Function<? super T,​? extends IntStream> mapper)
//    LongStream 	flatMapToLong​(Function<? super T,​? extends LongStream> mapper)
//    <R> Stream<R> 	map​(Function<? super T,​? extends R> mapper)
//    DoubleStream 	mapToDouble​(ToDoubleFunction<? super T> mapper)
//    IntStream 	mapToInt​(ToIntFunction<? super T> mapper)
//    LongStream 	mapToLong​(ToLongFunction<? super T> mapper)
//    Optional<T> 	reduce​(BinaryOperator<T> accumulator)
//    T 	reduce​(T identity, BinaryOperator<T> accumulator)
//    <U> U 	reduce​(U identity, BiFunction<U,​? super T,​U> accumulator, BinaryOperator<U> combiner)
//    <R> R 	collect​(Supplier<R> supplier, BiConsumer<R,​? super T> accumulator, BiConsumer<R,​R> combiner)
//	<R,​A> R 	collect​(Collector<? super T,​A,​R> collector)

    public static void main(String[] args) throws FileNotFoundException {
        //    Optional<T> 	reduce​(BinaryOperator<T> accumulator)
        //    T 	reduce​(T identity, BinaryOperator<T> accumulator)
        // reduce 翻译过来是 减少含义， 可以用作为数据的合并操作

        /**
         * @FunctionalInterface
         * public interface BinaryOperator<T> extends BiFunction<T,​T,​T>
         *     R 	apply​(T t, U u)
         */
        Stream<String> st1 = Stream.of("AA","BB","CC","DD");

        Optional<String> op1 = st1.reduce((String e1, String e2)->{
            System.out.println("e1 = "+e1+"  e2 = "+e2);
            return e1+e2;});

        System.out.println(op1.get());

        System.out.println("=======================");

        Stream<String> st2 = Stream.of("AA","BB","CC","DD");

        String result = st2.reduce("QQ", (String e1, String e2) -> {
            System.out.println("e1 = " + e1 + "  e2 = " + e2);
            return e1 + e2;
        });

        System.out.println("result == "+result);

        System.out.println("=======================");

//    <R> Stream<R> 	map​(Function<? super T,​? extends R> mapper)
//    DoubleStream 	mapToDouble​(ToDoubleFunction<? super T> mapper)
//    IntStream 	mapToInt​(ToIntFunction<? super T> mapper)
//    LongStream 	mapToLong​(ToLongFunction<? super T> mapper)

        BufferedReader br = new BufferedReader(new FileReader("E:/TEST/a.txt"));

        Stream<String> lines = br.lines();

        /**
         * @FunctionalInterface
         * public interface Function<T,​R>
         *     R 	apply​(T t)
         * @FunctionalInterface
         * public interface ToIntFunction<T>
         *     int 	applyAsInt​(T value)
         */
        Stream<String[]> line_words = lines.map((String line) -> {
            return line.split(" ");
        });

        /**
         * Stream体系
         *
         * BaseStream父接口
         *   子接口： Stream   IntStream  LongStream
         */

        IntStream intStream = line_words.mapToInt((String[] words) -> {
            return words.length;
        });

        OptionalInt count = intStream.reduce((int num1, int num2) -> {
            return num1 + num2;
        });

        System.out.println("文件中包含的单词总数："+count.getAsInt());
//        intStream.forEach(System.out::println);


        System.out.println("============================");

        BufferedReader br1 = new BufferedReader(new FileReader("E:/TEST/a.txt"));

        Stream<String> lines1 = br1.lines();

//    <R> Stream<R> 	flatMap​(Function<? super T,​? extends Stream<? extends R>> mapper)

        /**
         * @FunctionalInterface
         * public interface Function<T,​R>
         *     R 	apply​(T t)
         * @FunctionalInterface
         * public interface ToIntFunction<T>
         *     int 	applyAsInt​(T value)
         */
        //扁平化操作
        Stream<String> words = lines1.flatMap((String line) -> {
            return Arrays.stream(line.split(" "));
        });

//	<R,​A> R 	collect​(Collector<? super T,​A,​R> collector)

//        java.util.stream Class Collectors  ---> 工具类 用来生成 Collector
//        static <T,​K> Collector<T,​?,​Map<K,​List<T>>>
//        groupingBy​(Function<? super T,​? extends K> classifier)
//        static <T,​K,​A,​D> Collector<T,​?,​Map<K,​D>>
//                groupingBy​(Function<? super T,​? extends K> classifier, Collector<? super T,​A,​D> downstream)

//        static <T> Collector<T,​?,​Long> 	counting()

//        Map<String, List<String>> collect = words.collect(Collectors.groupingBy((String wd) -> {
//            return wd;
//        }));
//
//        Set<Map.Entry<String, List<String>>> entries = collect.entrySet();
//
//        for(Map.Entry<String, List<String>> kv : entries)
//        {
//            System.out.println(kv);
//        }
//        words.forEach(System.out::println);


        Map<String, Long> collect = words.collect(Collectors.groupingBy((String wd) -> {
                    return wd;
                },
                Collectors.counting()));

        Set<Map.Entry<String, Long>> entries = collect.entrySet();

        for(Map.Entry<String, Long> kv : entries)
        {
            System.out.println(kv);
        }



//        HelloWorld
//        Java
//        Java
//        Hello
//        Spark
//        AAA
//        Flink
        //Java 2
        //AAA  1


    }
}
