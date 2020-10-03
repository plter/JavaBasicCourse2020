package top.yunp.oopdemo;

/**
 *           子类     继承    父类(超类)
 */
public class Worker extends Person {

    public String workType;
    public int workAge;

    public Worker()
    {

    }

    public Worker(String name, int age, String sex, double high,String workType, int workAge)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.high = high;
        this.workType = workType;
        this.workAge = workAge;
    }

    public void doJob()
    {
        System.out.println("劳动最光荣 -- Worker");
    }

    /**
     * 当子类继承父类，子类对于父类提供的某个功能，感觉不能满足其需求
     *
     * 方法重写（方法覆写）：
     *
     *      1、存在于 两个Java类 之间
     *      2、这两个Java类 之间 是 继承关系
     *      3、子类重写父类的某个功能 某个方法
     *      4、方法声明
     *          修饰符：  子类的访问权限修饰符 要 大于等于 子类的访问权限修饰符
     *              public > protected > 默认 > private
     *                  注意：父类的 private修饰符的方法 不可以被子类重写
     *          返回值类型： 子类 要与 父类相同
     *          方法名称：  必须相同
     *          形式参数列表： 必须完全相同  个数相同  对应位置的参数数据类型相同
     *      5、方法体 肯定是不同的！
     *      6、标识：@Override
     *
     * 方法重载：
     *
     *      1、存在于 同一个Java类
     *      2、同一个类的不同方法之间
     *      3、方法名称相同
     *      4、参数列表不同
     *          参数的个数不同
     *          或
     *          对应参数位置的数据类型不同
     *      5、与返回值无关
     *
     * =====================================================
     * 超级父类： Object
     *      1、咱们会编写很多的Java类  这些类同样也具有相同的公共功能
     *      2、一个Java类 直接或者间接的 继承了 Object
     *      3、在Java的继承中  Java类 与 Java类 之间只能单继承！
     *      4、Object 提供了哪些公共的方法
     *          toString()
     *
     */

    @Override
    public int eat()
    {
        System.out.println("四菜一汤 享受生活 --- Worker");

        return 0;
    }

    @Override
    public void goodStudy() {
        System.out.println("将父类的功能实现出来，不再是抽象的！");
    }


    @Override
    public String toString() {
        return "Worker{" +
                "workType='" + workType + '\'' +
                ", workAge=" + workAge +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", high=" + high +
                '}';
    }
}
