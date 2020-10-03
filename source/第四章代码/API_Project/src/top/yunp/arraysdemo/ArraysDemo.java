package top.yunp.arraysdemo;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args)
    {


//        static boolean[] 	copyOf​(boolean[] original, int newLength)
//        static <T> T[] 	copyOf​(T[] original, int newLength)
//        对于拷贝操作，长度小于原来的值，发生截断  超过原来的值 给默认值



//        String[] strs1 = {"AAA","BBB","CCC","DDD"};
//
//        String[] strs2 = Arrays.copyOf(strs1,2);
//        String[] strs3 = Arrays.copyOf(strs1,4);
//        String[] strs4 = Arrays.copyOf(strs1,6);
//
//        for(int i = 0; i<2; i++)
//        {
//            System.out.print(strs2[i]+"   ");
//        }
//        System.out.println();
//        for(int i = 0; i<4; i++)
//        {
//            System.out.print(strs3[i]+"   ");
//        }
//        System.out.println();
//        for(int i = 0; i<6; i++)
//        {
//            System.out.print(strs4[i]+"   ");
//        }
//        System.out.println();

        Student[] stus = new Student[3];

        Student stu1 = new Student("张三",16,"男");
        Student stu2 = new Student("李四",20,"男");
        Student stu3 = new Student("王五",19,"女");

        stus[0] = stu1;
        stus[1] = stu2;
        stus[2] = stu3;

        Student[] stus1 = Arrays.copyOf(stus,2);
        Student[] stus2 = Arrays.copyOf(stus,5);

        for(int i = 0; i<3 ;i++)
        {
            System.out.print(stus[i]+"  ");
        }
        System.out.println();
        for(int i = 0; i<2 ;i++)
        {
            System.out.print(stus1[i]+"  ");
        }
        System.out.println();
        for(int i = 0; i<5 ;i++)
        {
            System.out.print(stus2[i]+"  ");
        }

        System.out.println();

        //拷贝操作之后 如果对象的地址仍然相同 相当于做了  浅拷贝
//                      0x0000111
        Student stu = new Student("王五",11,"女");

        Student stustu = stu; //0x0000111

        stu.setAge(20);

//        这样的一个操作，相当于进行了一个浅拷贝操作，使得stu、stustu这两个引用同时指向了 同一个内存地址
//        如果对于这个对象进行修改操作时，由于是同一块内存，就会使得所有指向这块内存的引用都发生变化

//        name='王五', age=28, sex='女'
//        name='王五', age=20, sex='男'

        System.out.println(stu);
//        Student{name='王五', age=20, sex='女'}
        System.out.println(stustu);
//        stustu.setAge(20);
//        Student{name='王五', age=20, sex='女'}

    }
}
