package top.yunp.bio_demo;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class: Teacher  表示老师人群的Java类
 *
 * implements :
 *      Comparable<Teacher>  完成排序比较的接口
 *      Cloneable            深拷贝操作的接口
 *      Serializable         序列化接口的标识
 */
public class Teacher implements Comparable<Teacher>,Cloneable, Serializable {

    //成员变量私有化
    private String name;
    private int age;
    private String sex;

    public Teacher(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Teacher() {
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

    //将当前Java类某个对象，转换为String字符串进行数据，这个字符串中包含的就是该对象中的成员变量信息
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    //如果当前自定义的Java类使用在 Set系列的集合中，需要equals hashCode重写  完成去重的操作
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(sex, teacher.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }


    //如果当前类使用在 TreeSet中 需要实现 Comparable 接口 内部完成比较逻辑
    @Override
    public int compareTo(Teacher o) {
        return 0;
    }

    //当前类如果需要完成 深拷贝操作
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
