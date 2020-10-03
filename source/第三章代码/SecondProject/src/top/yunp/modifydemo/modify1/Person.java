package top.yunp.modifydemo.modify1;

public class Person {

    //成员变量
    public String name;
    protected int age;
    String sex;
    private String address;

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    //成员方法
    public void eat()
    {
        System.out.println(" 吃饭 -- Person -- public修饰");
    }

    protected void sleep()
    {
        System.out.println(" 睡觉 -- Person -- protected修饰");
    }

    void study()
    {
        System.out.println(" 学习 -- Person -- 默认修饰");
    }

    private void paly()
    {
        System.out.println(" 游戏 -- Person -- private");
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
