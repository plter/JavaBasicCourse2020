package top.yunp.domain;

public class User {

    private String name;
    private String pwd;
    private String address;

    public User() {
    }

    public User(String name, String pwd, String address) {
        this.name = name;
        this.pwd = pwd;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
