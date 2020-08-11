package top.yunp.shop;

import top.yunp.Consumer;

/**
 * 当前类用来表示消费者
 */
public class Consumer {

    private String name;

    private String phone;

    public Consumer()
    {

    }

    public Consumer(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public void doRegist()
    {
        //依赖平台 注册功能
        boolean result =  Platform.doRegist();

        if(result)
        {
            buyProduct();
        }
    }

    public void buyProduct()
    {
        System.out.println("消费者开始购买商品");

        Platform.payMoney();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Consumner{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
