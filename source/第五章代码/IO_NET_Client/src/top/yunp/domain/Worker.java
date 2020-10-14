package top.yunp.domain;

import java.util.ArrayList;

//        {   ---> Java类开始      --> 人为定义一个类的名字
public class Worker {


//           "age":35,  --> K-v 表示成员变量  int
    private int age;
//           "name":"张三",                 String
    private String name;
//           "sex":"男",                    String
    private String sex;

//           "companies":[ ---> K:Vs 表示该成员变量 具有多个数据  ArrayList<T>
    private ArrayList<Company> companies;


//                   ]
//        }


    public Worker() {
    }

    public Worker(int age, String name, String sex, ArrayList<Company> companies) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.companies = companies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", companies=" + companies +
                '}';
    }
}
