package top.yunp.shop;

public class Platform {



    /**
     * 功能：平台用来发布商品 提供给商家使用
     *
     * @param product  需要发布的商品信息
     */
    public static void sendProduct(Product product)
    {

        System.out.println("已经上传的商品："+product);

    }

    /**
     * 功能： 用户注册的操作
     * @return
     */
    public static boolean doRegist()
    {
        System.out.println("注册成功");

        return true;
    }

    public static void payMoney()
    {
        System.out.println("支付成功");

        Sender.send();
    }

}
