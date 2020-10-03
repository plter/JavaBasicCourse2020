package top.yunp.arraysdemo;

import java.util.Objects;

public class Student extends Object implements Cloneable{

    private String name;
    private int age;
    private String sex;

    private Teacher teacher;


    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student(String name, int age, String sex, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(teacher, student.teacher);
    }

    //哈希值
    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, teacher);
    }


    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object obj = super.clone();
        Student stu = (Student)obj;
        stu.teacher = (Teacher) stu.teacher.clone();
        return stu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", teacher=" + teacher +
                '}';
//        return super.toString();
    }
}
