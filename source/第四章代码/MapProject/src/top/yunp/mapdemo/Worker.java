package top.yunp.mapdemo;

import java.util.Objects;

public class Worker implements Comparable<Worker>{

    private String name;
    private int age;
    private String sex;

    public Worker() {
    }

    public Worker(String name, int age, String sex) {
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
        Worker worker = (Worker) o;
        return age == worker.age &&
                Objects.equals(name, worker.name) &&
                Objects.equals(sex, worker.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker that) {

        int result = this.name.compareTo(that.name);

        result = (result == 0)? this.age - that.age : result;

        result = (result == 0)? this.sex.compareTo(that.sex):result;

        return result;
    }
}
