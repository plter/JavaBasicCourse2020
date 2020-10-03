package top.yunp.numberdemo;

public class Student extends Object implements Comparable<Student>{

    //在自定义成员变量时，写出来属性特征要可以准确的标识对应的对象！
    //Student stu5 = new Student("孙七",20,"女");  山东  山东
    //Student stu5 = new Student("孙七",20,"女");  河北  山东

    //对于一个Java类来说，他所具有的功能以及其他信息，主要来自几个方面
    //1、继承自Object
    //2、继承自某些父类、实现的接口
    //3、当前类 自身具有

    private String name;
    private int age;
    private String sex;
    private String address;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {

        int result = this.name.compareTo(that.name);

        result = (result == 0)?this.age-that.age:result;

        result = (result == 0)?this.sex.compareTo(that.sex):result;

        return result;
    }
}
