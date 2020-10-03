package top.yunp.arraysdemo;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * 深拷贝操作
         *
         * 1、实现Cloneable接口 ---> 标识
         * 2、重写父类Object 的 clone方法
         *
         * 如果当前类中 使用了 其他的自定义Java类时，这些类同样也要完成clone操作
         *
         * 接口：
         *  1、功能规划
         *  2、功能扩展   ---> Comparable
         *  3、标识作用    Cloneable Serializable
         */
//        Student stu1 = new Student("张三",10,"男");
//        Student stu2 = (Student)stu1.clone();
//
//        System.out.println(stu1);
//        System.out.println(stu2);

        Teacher tt = new Teacher("王五");
        Student stu3 = new Student("张三",10,"男",tt);
        Student stu4 = (Student)stu3.clone();

        stu3.setAge(20);

        stu4.getTeacher().setName("赵六");
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
