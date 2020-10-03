package top.yunp.shop;

/**
 * 当前类用来标识 商家角色
 */
public class Buiness {

    private String bid;
    private String bName;
    private String bType;

    public Buiness()
    {

    }

    public Buiness(String bName, String bType)
    {
        this.bName = bName;
        this.bType = bType;
    }

    /**
     * 当前功能：商家发起入驻操作
     */
    public void doRegist()
    {
        //依赖平台 入驻功能
        boolean result =  Platform.doRegist();

        if(result)
        {
            sendProduct();
        }
    }

    /**
     * 功能：商家发起 商品发布操作
     */
    public void sendProduct()
    {
        //准备商品
        Product p1 = new Product("p001","T恤",25.99);
        //这里需要调用平台的商品发布功能

        Platform.sendProduct(p1);
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    @Override
    public String toString() {
        return "Buiness{" +
                "bid='" + bid + '\'' +
                ", bName='" + bName + '\'' +
                ", bType='" + bType + '\'' +
                '}';
    }
}
