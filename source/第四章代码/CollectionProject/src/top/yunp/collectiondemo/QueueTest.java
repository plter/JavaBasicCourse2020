package top.yunp.collectiondemo;

import java.util.LinkedList;

public class QueueTest {

    public static void main(String[] args)
    {


//        boolean 	add​(E e)
//        将元素插入队列中，如果超出队列容量则抛出异常

        LinkedList<String> link1 = new LinkedList<>();

        link1.add("AAA");
        link1.add("BBB");
        link1.add("CCC");
        link1.add("DDD");
        link1.add("EEE");

        System.out.println(link1);

//        E 	element()
//        返回队头元素，但是不删除

        String first = link1.element();
        System.out.println("头元素："+first);
        System.out.println(link1);
//        boolean 	offer​(E e)
//        将元素插入到队列中
        link1.offer("FFF");
        System.out.println(link1);
        link1.offerFirst("GGGG");
        System.out.println(link1);
//        E 	peek()
//        返回队头元素，但是不删除，如果队列为空，则返回null
        String first1 = link1.peek();
        System.out.println("头元素："+first1);
        System.out.println(link1);
//        E 	poll()
//        返回头部元素，并且从队列中删除头部，如果队列为空，返回null

        String first2 = link1.poll();
        System.out.println("头部元素："+first2);
        System.out.println(link1);
//        E 	remove()
//        返回头部元素，并且从队列中删除头部
        String first3 = link1.remove();
        System.out.println("头部元素："+first3);
        System.out.println(link1);



    }
}
