package top.yunp.shop;


public class PlatformTest {

    public static void main(String[] args)
    {
        /**
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
         */

        Buiness buiness1 = new Buiness("好东西","服装");

        buiness1.doRegist();

        Consumer con1 = new Consumer("李四","11122233344");

        con1.doRegist();
    }
}
