package top.yunp;

import java.util.Scanner;

/**
 * 这里用来讲解关于 某个业务场景的分析： 电商平台
 */
public class BuyTest {


    public static void main(String[] args)
    {
        /**
         * 问题： 加入需要你自己来开发一个这样的平台，怎么做？ 包含哪些东西
         *
         * 第一步： 描述一下 平时 使用这类平台的一个过程？
         *          1、将这个过程使用 自定义方法的思路，将不同部分进行拆分
         *
         *          过程描述：
         *              我使用 浏览器  输入网址  在搜索栏上 输入 T恤 点击搜索，
         *              商品列表， 查看商品内容 加入购物车 结账  签收  评价
         *
         *              拆分：不同的功能点：
         *
         *                  搜索功能
         *                  展示商品
         *                  加入购物车
         *                  结算
         *                  运输
         *                  评价
         *
         *               ==================
         *               商家： 添加商品
         *               消费者： 进行操作
         *
         *               上面使用的这些功能时谁提供出来？
         *               这些功能应该属于的是： 平台
         *
         *               这些功能是否已经完整？ 以及对应的这些功能应该属于哪个角色？
         *
         *  第二步：
         *
         *      商家角色：   --->  Java类
         *          商家名称：
         *          经营门类：
         *          税务号：
         *          入住时间：
         *          押金：
         *
         *      商品：
         *         名称：
         *         描述：
         *         价格：
         *         优惠：
         *
         *      消费者角色：
         *          姓名
         *          联系方式
         *          邮寄地址
         *          银行卡
         *
         *      平台角色：
         *          商家入驻功能 ---> 形式参数列表
         *
         *          上传商品功能
         *
         *          消费者的注册、登录  ---> 形式参数列表
         *
         *          搜索功能
         *          展示商品功能
         *          加入购物车
         *          结算功能  --->  结算之后有结果：  消费：钱少  物流信息
         *          评价功能
         *
         *       快递角色：
         *          运输    ----> 形式参数列表
         *
         *
         * 第三步：
         *
         *      如何将上述的实际问题场景 对应到 具体的编程逻辑中？
         *
         *      具有的角色 ---- 对应于Java代码的Java类
         *          名称：数据信息 ---->  变量
         *          注册：功能、操作 ---->  自定义方法
         *
         *      Java类分类：
         *          从业角度，各有偏重
         *              1、以表示数据为主体的类 ---> 更多是具有变量  功能稍微少一些
         *              2、以描述功能为主题的类 ---> 更多的时功能， 变量稍微少一些
         *
         *
         *
         *
         */

//        getSum(10,20);



        //创建了Consumer类的一个实例 ---> 实例：对象：  某一类事物的具体的一个个体
        Consumer con = new Consumer();
        //调用了 Consumer类的成员方法
        con.sum(100,200);
        //调用Consumer类的成员变量
        con.name = "张三";
        //con.age = -20;
        con.setAge(-20);
//        con.age = -15;
        System.out.println("姓名："+con.name+" 年龄："+con.getAge());



    }

    public static void getSum(int num1,int num2)
    {
        int result = num1+num2;
        System.out.println("result == "+result);
    }
}