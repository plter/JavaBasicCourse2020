package top.yunp.oopdemo.interfacedemo;

public class InterfaceTest {

    public static void main(String[] args)
    {

        Student stu1 = new Student();

        stu1.speakChinese();
        stu1.speakEnglish();

        System.out.println(stu1.name);

        System.out.println(Language.name);

        System.out.println(Student.name);

        /**
         * static
         *  :  无论是 静态成员变量 静态的成员方法  都建议 直接使用类名调用
         *  :  当然使用对应类的 对象 去调用也是可以的！
         *
         *  方法重写：
         *
         *      1、存在于 两个Java类之间  或者 Java类 与 接口之间
         *      2、具有 继承关系  或者  实现关系
         *      3、子类对父类中方法 进行重写   实现类对接口中的方法进行重写
         *      4、方法重写规则
         *          修饰符：
         *          返回值类型
         *          形式参数列表
         *          方法体
         *
         */
    }
}
