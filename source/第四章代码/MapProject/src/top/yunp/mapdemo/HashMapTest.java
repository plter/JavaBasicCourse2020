package top.yunp.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapTest {

    public static void main(String[] args)
    {

//        default V 	compute​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)
//        对于第一个传入的参数 key ，通过这个key从 Map集合中获取对应的 K-V 数据对，并且将这个数据对，作为参数
//        传递给后面的 Lamda表达式，执行 Lamda表达式中的逻辑  Lamda表达式中返回的数据 就是Value数据
        HashMap<String,Integer> count = new HashMap<>();


        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Spark");
        words.add("Flink");
        words.add("Java");
        words.add("Hive");

        /**
         * @FunctionalInterface
         * public interface BiFunction<T,​U,​R>
         *     R 	apply​(T t, U u)
         */
        for(String word : words)
        {
            count.compute(word,(String  key, Integer value)->{

//                System.out.println("key == "+key+"  value = "+value);
                value = (value == null)? 1:value+1;

                return value;

            });
        }

        System.out.println(count);


//        default V 	computeIfAbsent​(K key, Function<? super K,​? extends V> mappingFunction)
//        这里的缺失，指的是 对应传入的 key 这个参数，是否在 Map集合中已经存在， 或者 对应这个key 的 value 为 null
//        这种情况下，才会执行 后面的 Lamda表达式

        ArrayList<String> words1 = new ArrayList<>();

        words1.add("AAA");
        words1.add("BBB");
        words1.add("CCC");
        words1.add("AAA");



        /**
         * @FunctionalInterface
         * public interface Function<T,​R>
         *     R 	apply​(T t)
         */
//        HashMap<String,Integer> count1 = new HashMap<>();
//        for(String word : words1)
//        {
//            count1.computeIfAbsent(word,(String key)->{
//
//                System.out.println("key == "+key);
//                Integer value = count1.get(key);
//
//                value = (value == null)? 1: value+1;
//
//                return  value;
//
//            });
//        }
//        System.out.println(count1);

        HashMap<String,AtomicInteger> count2 = new HashMap<>();

        for(String word : words1)
        {
            count2.computeIfAbsent(word,(String key)->{return new AtomicInteger();}).getAndIncrement();
        }

        System.out.println(count2);

//        default V 	computeIfPresent​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)
//       要求操作的 key 在HashMap中提前存在，并且其对应的value 不能为 null
//        这种情况下才会执行后面的 Lamda表达式
        System.out.println("===============================");
        ArrayList<String> words2 = new ArrayList<>();

        words2.add("AAA");
        words2.add("BBB");
        words2.add("CCC");
        words2.add("AAA");
        words2.add("EEE");

        HashMap<String,Integer> count3 = new HashMap<>();
        count3.put("AAA",new Integer(0));
        count3.put("BBB",new Integer(0));
        count3.put("CCC",new Integer(0));


        for(String word : words2)
        {
            count3.computeIfPresent(word,((String  key, Integer value)->{

                System.out.println("key == "+key+"  value = "+value);
                value = (value == null)? 1:value+1;

                return value;

            }));
        }

        System.out.println(count3);

//        default V 	merge​(K key, V value, BiFunction<? super V,​? super V,​? extends V> remappingFunction)
//        这个方法完成了合并操作，如果对应的key 在两个集合中都存在，对应的 Value向加
//        如果某个key 只在其中一个Map中存在，那么在最终也会合并进去
        HashMap<String,Integer> k_v1 = new HashMap<>();

        k_v1.put("Java",1);
        k_v1.put("Scala",2);
        k_v1.put("Flink",1);
        k_v1.put("AAA",1);

        HashMap<String,Integer> k_v2 = new HashMap<>();

        k_v2.put("Java",2);
        k_v2.put("Scala",1);
        k_v2.put("Flink",1);
        k_v2.put("BBB",1);

        Set<Map.Entry<String,Integer>> kvs = k_v1.entrySet();

        /**
         * @FunctionalInterface
         * public interface BiFunction<T,​U,​R>
         *     R 	apply​(T t, U u)
         */
        for(Map.Entry<String,Integer> kv : kvs)
        {
            String key = kv.getKey();
            Integer value = kv.getValue();

            k_v2.merge(key,value,(Integer v1 , Integer v2)->{return  v1+v2;});
        }

        System.out.println("k_v1 --- "+k_v1);
        System.out.println("k_v2 --- "+k_v2);




    }
}
