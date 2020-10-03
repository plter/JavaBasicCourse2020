package top.yunp.collectiondemo;

import java.util.Objects;

public class Student  implements  Comparable<Student> , Cloneable{

    private String name;
    private int age;
    private String sex;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", sex='" + sex + '\'' +
//                '}';

        return super.toString();
    }

    @Override
    public int compareTo(Student that) {

        int result = this.name.compareTo(that.name);

        result = (result == 0) ? this.age - that.age : result;

        result = (result == 0) ? this.sex.compareTo(that.sex) : result;

        return result;
    }
}
