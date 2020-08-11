package top.yunp;

/**
 * 这里定义一个消费者相关的类
 */
public class Consumer {

    /**
     * 分析：消费者角色
     *
     *      数据性：---> 变量   --> 属性特征
     *      功能性：---> 方法   --> 功能作用
     */

    //全局变量
    //成员变量
//    访问权限修饰符： public protected private 默认

    public String name;
    private int age;
    public String address;
    public String phone;
    public String card;

    //通过自定义方法，满足在给成员变量进行赋值时，检查一些数据的准确性

    /**
     * 修饰符：public
     * 返回值类型：
     *      有：
     *      无：void
     * 方法名称：setAge
     * 形式参数列表：
     *      有： 1  int age
     *      无：
     * 方法体： 赋值  =  if
     */
    public void setAge(int age)
    {
        if(age>0 & age<=100)
        {
            //局部变量 与 全局变量 出现了重名  这回导致在局部位置， 局部变量隐藏了全局变量
            //通过this来指定 全局变量
            this.age = age;
        }

    }

    //通过定义一个方法 用来将当前的某个成员变量的值 获取出来

    /**
     * 修饰符：public
     * 返回值类型：int
     * 方法名称：getAge
     * 形式参数列表：
     *      有：
     *      无：Y
     * 方法体： return
     */
    public int getAge()
    {
        return this.age;
    }

    //成员方法
    public void sum(int price1,int price2)
    {
        //局部变量
        int a = 0;
        int sum = price1+price2;

        if(a>10)
        {
            //局部变量
            int b = 3;
            int c = a+b;
        }

        System.out.println("sum == "+sum);
    }


}
