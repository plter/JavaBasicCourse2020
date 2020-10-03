package top.yunp.oopdemo;

public class OOPDemo {

    public static void main(String[] args)
    {
        /**
         *
         * 面向对象编程：
         *
         *  1、通过哪些技术来实现
         *
         *      a、Java普通类   Java抽象类   Java接口   Java内部类
         *      b、Java修饰符
         *          访问权限修饰符： public  protected  默认  private
         *          static：成员变量 成员方法
         *          final：
         *              修饰类： 表示为最终的类 不可以具有子类
         *              修饰成员方法： 这个方法 不可以被子类重写
         *              修饰成员变量： 使其成为了 常量，在定义时就需要初始化
         *              修饰局部变量： 使其成为 常量 需要定义时赋值
         *
         *              引用数据类型定义的变量 其常量作用在 的位置 Student stu，作用在引用名称 stu
         *          this 与 super
         *          extends 与 implements
         *          class 、 abstract class 、interface 、package
         *          import
         *
         *      c、Java包
         *
         *      d、Java模块
         *      e、Java内部类
         *      f、继承、实现
         *
         *
         *
         *  2、面向对象具有哪些 特征 特性
         *
         *      a、封装
         *           从自定义方法开始，在做的就是 封装
         *           成员方法 成员变量 ---> Java类
         *           Java类数量 种类增多 ---> Java包
         *              命名规范： 小写字母   符合标识符的命名规范
         *                      顶层的包： 公司域名倒过来  yunp.top --> top.yunp
         *              作用：
         *                  封装
         *                  规划
         *               场景： 开发一款 APP ---> 媒体
         *
         *                  top.yunp
         *                     --> loginregist
         *                     --> message
         *                     --> domain ---> User Student Worker --> JavaBean Java实体类
         *                     --> utils  ---> 工具性
         *      b、继承
         *          关键字： extends
         *
         *          表示一定层次关系，父类可以为子类进行功能规划  进行限制
         *          子类可以对父类 进行功能扩展
         *
         *      c、多态
         *
         *          含义： 多种形态  同样的一段代码 在不同的时间里 不同情况下 表现出状态是不一样的
         *
         *          例子：
         *              方法重载： 多种形态 ---> sum ---> 2  3  4
         *              + :   加法运算符   字符串连接符
         *              Python : 鸭子模型
         *
         *          Java中的多态：
         *              1、在 两个类之间 具有 继承 或者 实现关系
         *              2、子类、实现类  对其 父类、接口 进行了方法重写
         *              3、父类的引用 指向 子类对象
         *
         *                  Person --- eat()
         *                  Student --- eat()
         *                  class Student extends Person
         *                          stu  =  0x00001111
         *                  Student stu = new Student();
         *
         *                  Person p = new Student();
         *                  Person p = stu;
         *
         *                  int a = 10;
         *                  long b = a;
         *              4、父类的引用 调用 重写方法
         *                  p.eat();
         *
         *                  编译时期 看赋值号左侧  运行时期  看赋值号右侧
         *                  Person p = new Student();
         *              5、在编译时期 与 运行时期 的 形态不同 称为多态
         *
         *
         */
    }
}
