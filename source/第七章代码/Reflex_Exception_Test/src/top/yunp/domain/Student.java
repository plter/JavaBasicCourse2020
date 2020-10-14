package top.yunp.domain;

public class Student {

    private String name;
    public int age;
    protected  String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doJOb()
    {
        System.out.println("工作中！");
    }

    private void study()
    {
        System.out.println("学习中");
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


}
