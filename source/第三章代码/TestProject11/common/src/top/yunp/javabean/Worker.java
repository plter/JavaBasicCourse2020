package top.yunp.javabean;

public class Worker {

    public String name;

    protected int age;

    String sex;

    private String address;

    public void eat()
    {
        System.out.println("吃饭");
    }

    protected void sleep()
    {
        System.out.println("睡觉");
    }

    void study()
    {
        System.out.println("学习");
    }

    private void play()
    {
        System.out.println("游戏");
    }

}
