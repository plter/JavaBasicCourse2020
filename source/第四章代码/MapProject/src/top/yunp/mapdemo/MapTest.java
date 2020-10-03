package top.yunp.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args)
    {

        HashMap<String,String> k_v = new HashMap<>();

//        1、增加
//        V 	put​(K key, V value)
//        key应该是唯一的    value是可以重复
//        如果同一个key 进行了多次的存储操作，最终结果是最后的那一次
//        void 	putAll​(Map<? extends K,​? extends V> m)
//        default V 	putIfAbsent​(K key, V value)
//        如果对应的key在Map中不存在，这个时候才会存储数据，否则不会覆盖数据

        k_v.put("1","AAAA");
        k_v.put("2","BBBB");
        k_v.put("3","CCCC");
        k_v.put("4","CCCC");
        k_v.put("4","DDDD");

        System.out.println(k_v);

        HashMap<String,String> k_v1 = new HashMap<>();

        k_v1.putAll(k_v);

        System.out.println("k_v ---- "+k_v);
        System.out.println("k_v1 ----"+k_v1);

        //如果对应的key在Map中不存在，这个时候才会存储数据，否则不会覆盖数据
        k_v1.putIfAbsent("5","FFFF");

        System.out.println("k_v1 ----"+k_v1);

//        2、判断
//        boolean 	containsKey​(Object key)
//        boolean 	containsValue​(Object value)
//        boolean 	isEmpty()
//        boolean 	equals​(Object o)
//        只要两个集合中的数据完全相同就是相等的！
//        void 	clear()

        boolean result = k_v.containsKey("7");
        System.out.println("是否包含key ： "+result);

        System.out.println("是否包含 value："+k_v.containsValue("AAAA"));

        System.out.println("是否为空的集合："+k_v.isEmpty());

        k_v.clear();

        System.out.println("是否为空的集合："+k_v.isEmpty());

        HashMap<String,String> k_vs1 = new HashMap<>();

        k_vs1.put("A","1");
        k_vs1.put("B","2");
        k_vs1.put("C","3");

        HashMap<String,String> k_vs2 = new HashMap<>();

        k_vs2.put("B","200");
        k_vs2.put("A","1");


        System.out.println("集合是否相等："+k_vs1.equals(k_vs2));

//        3、修改 替换
//        default V 	replace​(K key, V value)
//        将指定的key 对应的 value 进行替换
//        default boolean 	replace​(K key, V oldValue, V newValue)
//        default void 	replaceAll​(BiFunction<? super K,​? super V,​? extends V> function)

//        k_vs1.replace("AA","100");
//        k_vs1.replace("A","10","100");
        System.out.println("替换之后的数据："+k_vs1);

        /**
         * @FunctionalInterface
         * public interface BiFunction<T,​U,​R>
         *
         *     R 	apply​(T t, U u)
         */

        k_vs1.replaceAll((String k, String v)->{
            if ("C".equals(k)) {
               return v+"QQQQ";
            }
            else
            {
                return v;
            }
            });

        System.out.println("替换之后的数据："+k_vs1);

//        4、移除
//        V 	remove​(Object key)
//        default boolean 	remove​(Object key, Object value)
//        移除对应 key-value 的数据 如果不存在这个数据对的时候 就不会移除

//        k_vs1.remove("A");
        k_vs1.remove("A","10");
        System.out.println("移除之后的数据："+k_vs1);

//        5、遍历
//        Set<K> 	keySet()
//        V 	get​(Object key)


        HashMap<String,String> k_vs3 = new HashMap<>();

        k_vs3.put("1","AAA");
        k_vs3.put("2","BBB");
        k_vs3.put("3","CCC");
        k_vs3.put("4","DDD");

        Set<String> keys = k_vs3.keySet();

        System.out.println("集合中所有的key："+keys);

        for(String key : keys)
        {
            String value = k_vs3.get(key);

            System.out.println("k = "+key+"  v = "+value);
        }

//        Set<Map.Entry<K,​V>> 	entrySet()

        Set<Map.Entry<String,String>>  kk_vv = k_vs3.entrySet();

        System.out.println("将每一对key、value 看做一个整体"+kk_vv);

        for(Map.Entry<String,String> kv : kk_vv)
        {
            String key = kv.getKey();
            String value = kv.getValue();

            System.out.println("k = "+key+"  v = "+value);

        }

//        default void 	forEach​(BiConsumer<? super K,​? super V> action)

        /**
         * @FunctionalInterface
         * public interface BiConsumer<T,​U>
         *     void 	accept​(T t, U u)
         */

        k_vs3.forEach((String k , String v)->{System.out.println("k == "+k+"  v = "+v);});

//       6、不可变集合操作
//        static <K,​V>	Map<K,​V> 	of​(K k1, V v1)
//        static <K,​V> Map<K,​V> 	copyOf​(Map<? extends K,​? extends V> map) (返回不可以修改集合)
//        static <K,​V> Map<K,​V> 	ofEntries​(Map.Entry<? extends K,​? extends V>... entries)  返回不可修改的集合
//        static <K,​V> Map.Entry<K,​V> 	entry​(K k, V v)

        Map<String,String>  k_vs4 = Map.of("AAA","大家好");

        System.out.println("of 方法创建出来的不可变集合 ："+k_vs4);

//        k_vs4.clear();

        Map<String,String>  k_vs5 =  Map.copyOf(k_vs3);

        System.out.println("copyOf 方法创建出来的不可变集合 ："+k_vs5);

//        k_vs5.clear();

        Map.Entry<String,String> kv1 = Map.entry("AA","Java");
        Map.Entry<String,String> kv2 = Map.entry("BB","Hadoop");
        Map.Entry<String,String> kv3 = Map.entry("CC","Spark");

        Map<String,String>  k_vs6  = Map.ofEntries(kv1,kv2,kv3);

        System.out.println("ofEntries 的可变长参数创建的不可变集合："+k_vs6);

//        k_vs6.clear();
//        Exception in thread "main" java.lang.UnsupportedOperationException

//        7、其他
//        default V 	getOrDefault​(Object key, V defaultValue)
//        int 	hashCode()
//        int 	size()
//        Collection<V> 	values()


        HashMap<String,String> k_vs8 = new HashMap<>();

        k_vs8.put("A","Java");
        k_vs8.put("B","Scala");
        k_vs8.put("C","Hadoop");
        k_vs8.put("D","Saprk");

        System.out.println("获取数据如果不存在，则指定默认值："+k_vs8.getOrDefault("A","数据不存在"));
        System.out.println("获取数据如果不存在，则指定默认值："+k_vs8.getOrDefault("E","数据不存在"));

        System.out.println("哈希值："+k_vs8.hashCode());

        System.out.println("集合长度："+k_vs8.size());

        Collection<String> vs = k_vs8.values();

        System.out.println("获取Map中所有的value："+vs);



//        default V 	compute​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)
//        default V 	computeIfAbsent​(K key, Function<? super K,​? extends V> mappingFunction)
//        default V 	computeIfPresent​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction)

//        default V 	merge​(K key, V value, BiFunction<? super V,​? super V,​? extends V> remappingFunction)






    }
}
