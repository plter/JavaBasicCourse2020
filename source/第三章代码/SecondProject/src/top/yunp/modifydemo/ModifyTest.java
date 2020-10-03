package top.yunp.modifydemo;

/**
 * 这里讲解 关于 访问权限修饰符  在 不同类之间 以及 具有Java包  实现 继承关系时 是怎么样的？
 */
public class ModifyTest {

    public static void main(String[] args)
    {
        /**
         *
         * 访问权限修饰符：
         *      什么是访问： 指的 是一个类 对另外一个类 中 成员变量 或者成员方法的使用
         *
         *      这种访问 指的是 直接访问！
         *
         * ========================================
         * 一、同一个包：
         *      1、不具有继承、实现关系
         *             public protected 默认
         *
         *      2、具有继承、实现关系
         *              public protected 默认 都可以被使用
         *
         *            注意：父类私有的成员 不可以被子类继承 以及调用
         *
         * 二、不在同一个包
         *      1、不具有继承、实现关系
         *              public
         *
         *              注意：
         *                  默认：表示作用范围 是 当前所在的包
         *                  protected： 在另外一个包中 如果 不存在继承实现 关系 也是不可以被使用的
         *
         *      2、具有继承、实现关系
         *              public protected
         *
         *              protected:
         *                  受保护的，protected修饰的内容 专门提供给不在同一个包中的子类来使用
         *
         *              注意：
         *                  默认修饰符 依然 不可被访问  最终确定 其作用范围就是当前包
         *
         *
         *
         *
         */
    }
}
