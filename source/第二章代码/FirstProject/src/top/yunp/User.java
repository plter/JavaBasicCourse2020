package top.yunp;

public class User {

    //属性特征 ---> 成员变量
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;
    //住址
    private String address;
    //手机号
    private String phone;

    //构造方法
    //修饰符 ： public
    //返回值类型： 不考虑  不存在这一部分
    //方法名称：需要与当前的类名相同
    //形式参数列表：

    //无参构造方法  Java会自动填充这样的一个方法在当前的Java类
    //在编写Java类时，建议将这个方法 手动写出来
    //构造方法作用：
    //  1、创建对应类的实例对象
    //  2、在实例创建的过程中 给成员变量赋值
    //  3、无参构造方法 完成的是 对于成员变量赋值的操作，赋值的是默认值

    /**
     * 1、对于基本数据类型
     *      在完成变量的定义之后 ，必须经过赋值操作，才可以进行变量的使用
     *
     * 2、对于引用数据类型
     *      其中包含的数据 在进行使用之前 都已经赋值完成了
     *
     * 方法重载：
     *      1、方法名称相同
     *      2、在同一个Java类中
     *      3、形式参数列表不同
     *          a、参数个数不同
     *          或
     *          b、参数对应位置的数据类型不同
     *      4、与返回值类型无关
     */
    public User()
    {
    }

    //有参数构造
    //修饰符：public
    //方法名称： User
    //形式参数列表：
    //    有： 1-n  --->  n<=5

    public User(String name, int age, String sex, String phone)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }


    /**
     * 对于成员变量 使用 public修饰 其访问权限过于开放，不能起到限制作用
     *
     * 成员变量私有化：
     *  1、将成员变量的访问权限修饰符 由 public 更改为 private
     *  2、提供对应成员变量的 getXXX setXXX 成员方法
     *  3、对于get、set方法 一定是 public修饰的
     *
     */

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //行为功能
    //口算
    public void sum(int ... price)
    {
        int len = price.length;

        int sum = 0;

        for(int i = 0; i<len ; i++)
        {
            sum+=price[i];
        }

        printMoney(sum);
    }

    private void printMoney(int sum)
    {
        System.out.println("总共消费："+sum+"元");
    }


    /**
     * 定义一个方法 用来整体的输出 各个成员变量的值
     * 修饰符： public
     * 返回值类型：
     *      有：String
     * 方法名称：
     *      printUser
     * 形式参数列表：
     *      有：
     *      无：void
     * 方法体：
     *      字符串拼接 并返回
     */
    public String printUser()
    {
//        String result = "name="+this.name+" age="+age+" sex="+sex+" address"+address+" phone="+phone;
//        return result;
       return "name="+this.name+" age="+age+" sex="+sex+" address="+address+" phone="+phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
