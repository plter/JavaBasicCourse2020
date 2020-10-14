package top.yunp;

import top.yunp.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Student_Reflext_Test {

    public static void main(String[] args) throws ClassNotFoundException {

        Student stu = new Student("张三",15,"男");
        stu.setName("张三");
        stu.setAge(10);
        stu.setSex("男");
        System.out.println(stu);

        //1、获取字节码文件对象
//        //方式一：
//        Class cls1 = Student.class;
//        //方式二：
//        //Object --> Class<?> 	getClass()
//        Class cls2 = stu.getClass();
        //方式三：
        //static Class<?> 	forName​(String className)
        Class cls3 = Class.forName("top.yunp.domain.Student");


        //获取构造方法
        //Constructor<?>[] 	getDeclaredConstructors()
        Constructor[] constructors = cls3.getConstructors();
        for(Constructor con : constructors)
        {
            System.out.println(con);
        }

        //Field[] 	getDeclaredFields()

        Field[] fields = cls3.getDeclaredFields();
        for(Field f : fields)
        {
            System.out.println("成员变量："+f);
        }

        Method[] methods = cls3.getMethods();
        for(Method m : methods)
        {
            System.out.println(m);
        }

        System.out.println("模块："+cls3.getModule().getName());
        System.out.println("包："+cls3.getPackage().getName());

        Class[] interfaces = cls3.getInterfaces();
        for(Class cc : interfaces)
        {
            System.out.println("接口："+cc.getName());
        }

    }
}
