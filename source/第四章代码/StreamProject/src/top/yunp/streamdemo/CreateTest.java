package top.yunp.streamdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class CreateTest {


    static int i = 0;
    static int j = 0;

    public static void main(String[] args) throws FileNotFoundException {

        //1、通过集合来创建Stream
        //Collection  ----  default Stream<E> 	stream()
        ArrayList<String> strs1 = new ArrayList<>();
        strs1.add("Java");
        strs1.add("Scala");
        strs1.add("Flink");
        strs1.add("Spark");

        Stream<String> st1 = strs1.stream();

        /**
         * @FunctionalInterface
         * public interface Consumer<T>
         *     void 	accept​(T t)
         */
        st1.forEach(System.out::println);
        //st1.forEach(System.out::println);
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //对于Stream的数据流，只要处理一次之后，就已经结束了，不能进行重复处理

        //2、通过String 字符串 转换为 Stream
        //String --- Stream<String> 	lines()

        String str = "Java\n" +
                "Scala\n" +
                "Flink\n" +
                "Spark";

        Stream<String> st2 = str.lines();

        st2.forEach(System.out::println);

        //3、通过读取文件 然后将文件内容直接转换为 Stream
        //BufferedReader   ---- Stream<String> 	lines()

        BufferedReader br = new BufferedReader(new FileReader("E:/TEST/a.txt"));

        Stream<String> st3 = br.lines();
        System.out.println("============================");
        st3.forEach(System.out::println);

        //4、通过 build操作
//        static <T> Stream.Builder<T> 	builder()
        Stream.Builder<String> builder = Stream.builder();

        builder.add("AAA").add("BBB").add("CCC").add("DDDD");

        Stream<String> st4 = builder.build();
        System.out.println("============================");
        st4.forEach(System.out::println);

        //5、of操作 将参数中的数据 转换为 Stream
//        static <T> Stream<T> 	of​(T t)
//        static <T> Stream<T> 	of​(T... values)

        Stream<String> st5 = Stream.of("AAA","java","Spark","Flink");
        System.out.println("============================");
        st5.forEach(System.out::println);

//        static <T> Stream<T> 	ofNullable​(T t)

        Stream<String> st6 = Stream.ofNullable("QQQ");
        System.out.println("============================");
        st6.forEach(System.out::println);

        Stream<String> st7 = Stream.ofNullable(null);
        System.out.println("============================");
        st7.forEach(System.out::println);

        //6、创建空的流
//        static <T> Stream<T> 	empty()

        Stream<String> st8 = Stream.empty();
        System.out.println("============================");
        st8.forEach(System.out::println);

        //7、连接操作
//        static <T> Stream<T> 	concat​(Stream<? extends T> a, Stream<? extends T> b)

        Stream<String> st9 = Stream.of("AAA","BBB");
        Stream<String> st10 = Stream.of("CCC","DDD");

        Stream<String> st11 = Stream.concat(st9,st10);

        System.out.println("============================");
        st11.forEach(System.out::println);

        //8、创建无限的Stream
//        static <T> Stream<T> 	generate​(Supplier<? extends T> s)
        /**
         * @FunctionalInterface
         * public interface Supplier<T>
         *     T 	get()
         */
        Stream<String> st12 = Stream.generate(()->{return "AAA";}).limit(10);
        System.out.println("============================");
        //st12.limit(10);
        st12.forEach(System.out::println);

        Stream<Double> st13 = Stream.generate(()->{return new Random().nextDouble() ;}).limit(5);
        System.out.println("============================");
        st13.forEach(System.out::println);

//        static <T> Stream<T> 	iterate​(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
//        static <T> Stream<T> 	iterate​(T seed, UnaryOperator<T> f)

        /**
         * @FunctionalInterface
         * public interface UnaryOperator<T> extends Function<T,​T>
         *     R 	apply​(T t)
         */
        //int i = 0;
        Stream<String> st14 = Stream.iterate("AA",(String ss)->{
            System.out.println("传递进来的元素："+ss);
            return ss+(i++);}).limit(10);
        //Stream中的第一个元素 ： AA -->
        System.out.println("============================");
        st14.forEach(System.out::println);

        /**
         * @FunctionalInterface
         * public interface Predicate<T>
         *     boolean 	test​(T t)
         */

        Stream<String> st15 = Stream.iterate(
                "BB",
                (String sss)->{return  sss.length()<5;},
                (String ss)->{return ss+(j++);});
        System.out.println("============================");
        st15.forEach(System.out::println);
//
//        判断操作
//        boolean 	allMatch​(Predicate<? super T> predicate)
//        boolean 	anyMatch​(Predicate<? super T> predicate)
//        boolean 	noneMatch​(Predicate<? super T> predicate)
//        Optional<T> 	max​(Comparator<? super T> comparator)
//        Optional<T> 	min​(Comparator<? super T> comparator)
//
//        查找、统计、转换为数组
//        Optional<T> 	findAny()
//        Optional<T> 	findFirst()
//        long 	count()
//        Object[] 	toArray()
//            <A> A[] 	toArray​(IntFunction<A[]> generator)
//
//        遍历
//        void 	forEach​(Consumer<? super T> action)
//        void 	forEachOrdered​(Consumer<? super T> action)
//
//        元素处理逻辑
//        default Stream<T> 	takeWhile​(Predicate<? super T> predicate)
//        default Stream<T> 	dropWhile​(Predicate<? super T> predicate)
//        Stream<T> 	limit​(long maxSize)
//        Stream<T> 	skip​(long n)
//        Stream<T> 	filter​(Predicate<? super T> predicate)
//        Stream<T> 	sorted()
//        Stream<T> 	sorted​(Comparator<? super T> comparator)
//        Stream<T> 	distinct()
//
//        Debug操作
//        Stream<T> 	peek​(Consumer<? super T> action)




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


    }
}
