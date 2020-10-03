package top.yunp.javabean;

public class User {

    private String userName;
    private String userPwd;
    private String phone;

    public User() {
    }

//    public User(String userName, String userPwd, String phone) {
//        this.userName = userName;
//        this.userPwd = userPwd;
//        this.phone = phone;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
