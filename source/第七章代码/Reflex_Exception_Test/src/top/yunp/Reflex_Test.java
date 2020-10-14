package top.yunp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflex_Test {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * Hello.java --> javac Hello.java  --> Hello.class 字节码文件对象
         *
         * Constructor<?>[] 	getConstructors()
         * Field[] 	getFields()
         * Method[] 	getMethods()
         * Module 	getModule()
         * Package 	getPackage()
         * Class<?>[] 	getInterfaces()
         *
         * T 	newInstance​(Object... initargs)
         *
         * 应用角度：
         *      假设现在没有任何文档，而且没有Java源码 只有一堆.class文件对象
         *      只知道很少一些信息
         *      这个时候就可以利用反射操作获取一下相关字节码中一些细节内容！
         */

        //1、获取字节码文件对象
        Class cls1 = ArrayList.class;

        //获取构造方法
        Constructor[] constructors = cls1.getConstructors();
        for(Constructor con : constructors)
        {
            System.out.println(con);
        }

//        ArrayList<String> strs1 = new ArrayList<>();
//        ArrayList()
//        ArrayList​(int initialCapacity)
//        ArrayList​(Collection<? extends E> c)
//
//        public java.util.ArrayList(java.util.Collection)
//        public java.util.ArrayList()
//        public java.util.ArrayList(int)

        ArrayList o = (ArrayList) constructors[1].newInstance();

        o.add("AAAA");
        o.add("BBBB");
        o.add("AAAA");

        System.out.println(o);

        Field[] fields = cls1.getFields();
        for(Field f : fields)
        {
            System.out.println("成员变量："+f);
        }

        Method[] methods = cls1.getMethods();
        for(Method m : methods)
        {
            System.out.println(m);
        }

        System.out.println("模块："+cls1.getModule().getName());
        System.out.println("包："+cls1.getPackage().getName());

        Class[] interfaces = cls1.getInterfaces();
        for(Class cc : interfaces)
        {
            System.out.println("接口："+cc.getName());
        }
    }
}
