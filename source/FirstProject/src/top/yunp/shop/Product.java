package top.yunp.shop;

/**
 * 当前类标识商品
 */
public class Product {

    private String pid;
    private String pName;
    private double price;

    public Product()
    {

    }

    public Product(String pid, String pName,double price)
    {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                '}';
    }
}
