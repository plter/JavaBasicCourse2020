package top.yunp.javabean;

public class Product {

    private String proName;
    private String proCategory;
    private double price;

    public Product() {
    }

    public Product(String proName, String proCategory, double price) {
        this.proName = proName;
        this.proCategory = proCategory;
        this.price = price;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProCategory() {
        return proCategory;
    }

    public void setProCategory(String proCategory) {
        this.proCategory = proCategory;
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
                "proName='" + proName + '\'' +
                ", proCategory='" + proCategory + '\'' +
                ", price=" + price +
                '}';
    }
}
