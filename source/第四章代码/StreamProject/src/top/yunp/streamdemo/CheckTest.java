package top.yunp.streamdemo;

import java.util.Optional;
import java.util.stream.Stream;

public class CheckTest {
    public static void main(String[] args)
    {

        //        判断操作
//        boolean 	allMatch​(Predicate<? super T> predicate)
//        对于Stream中的元素，如果全部满足条件，返回true  有任何一个不满足 返回 false
//        boolean 	anyMatch​(Predicate<? super T> predicate)
//        对于Stream中的元素，如果有任何一个满足条件 返回true   所有都不满足的时候 返回 false
//        boolean 	noneMatch​(Predicate<? super T> predicate)
//        对于Stream中元素 所有的都不满足条件时 返回的 true ，有任何一个满足 返回false
//        Optional<T> 	max​(Comparator<? super T> comparator)
//        Optional<T> 	min​(Comparator<? super T> comparator)
//        分别求取的是  最大值 最小值

        /**
         * @FunctionalInterface
         * public interface Predicate<T>
         *     boolean 	test​(T t)
         */
        Stream<String> st1 = Stream.of("AA","BB","CCC","DDD");

        boolean result1 = st1.allMatch((String ss )->{return ss.length()>1;});

        System.out.println("allMatch == "+result1);

        Stream<String> st2 = Stream.of("AA","BB","CCC","DDDD");

        boolean result2 = st2.anyMatch((String ss )->{return ss.length()>4;});

        System.out.println("anyMatch == "+result2);

        Stream<String> st3 = Stream.of("AA","BB","CCC","DDDD");

        boolean result3 = st3.noneMatch((String ss )->{return ss.length()>3;});

        System.out.println("noneMatch == "+result3);

        /**
         * @FunctionalInterface
         * public interface Comparator<T>
         *     int 	compare​(T o1, T o2)
         */
        Stream<Integer> nums1 =Stream.of(10,20,30,40);

        /**
         * java.util
         * Class Optional<T>
         *
         *     将数据在外层添加了一层包装
         */
        //Optional<Integer> op1 = nums1.max((Integer num1 , Integer num2)->{return num1-num2;});
        Optional<Integer> op1 = nums1.min((Integer num1 , Integer num2)->{return num1-num2;});

        Integer numnum1 = op1.get();
        System.out.println("numnum1 == "+numnum1);
    }
}
