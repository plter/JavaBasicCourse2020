package top.yunp.collectiondemo;

public class CollectionDemo {

    /**
     *
     * 一、数据结构基础知识
     *
     *      了解常用的数据结构  以及  这些结构在Java的集合体系中 是通过哪些 具体实现类来实现出来的
     *
     * 二、Collection<E>体系
     *
     *      1、ArrayListTest ---> 罗列了 Collection集合中的常用方法 以及功能
     *
     *          add
     *          remove
     *
     *      2、SetTest ListTest 两个进行了 不同体系之间的对比
     *          1、不可变集合
     *          2、元素重复    元素顺序
     *          3、集合在保存自定义Java类时，需要注意的方面
     *          4、常用的遍历方式
     *          5、演示了 并发修改相关的操作  java.util.concurrent
     *          6、Spliterator接口 用于处理大数据量的时候 效率问题
     *
     * 三、其他分支
     *
     *      Queue  Dqueue  Stack  List  Set
     *
     *      a、List 有序（数据输入顺序 数据输出顺序）     无序（根据数据内容）
     *
     *          default void 	sort​(Comparator<? super E> c)
     *
     *          static <E> List<E> 	copyOf​(Collection<? extends E> coll)
     *
     *
     *          Vector实现类   数组实现的       支持线程安全操作
     *          ArrayList实现类  数组实现的     不支持线程安全操作
     *
     *      b、Set
     *
     *          static <E> Set<E> 	copyOf​(Collection<? extends E> coll)
     *
     *      注意：
     *
     *      1、对于 copyOf 完成的操作是 浅拷贝  注意使用时，别出现数据错误
     *
     *      2、copyOf 、of 这些操作获取到的集合 都是 不可以修改的集合
     *          怎么来理解这个不可以修改，
     *             指的是 集合本身 不可以修改，也就是不能增加元素 或者删除元素
     *             对于集合中保存的引用数据类型  比如Student 的对象，获取对应位置的对象之后 再对该Student
     *             对象进行 name 、age 、sex等的成员变量修改是可以的！
     *
     *
     *
     * 四、stream
     *
     *      default Stream<E> 	stream()
     *
     */
}
