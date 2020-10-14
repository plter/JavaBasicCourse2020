package top.yunp.domain;

//                   {  ---> 这里又是一个Java类开始  --> 人为定义一个类的名字
public class Company {


//                      "comID":"001",  成员变量
    private String comID;
//                      "comName":"百度",
    private String comName;
//                      "workAge":3
    private int workAge;
//                        "address":["北京","上海"]
//                    },


    public Company() {
    }

    public Company(String comID, String comName, int workAge) {
        this.comID = comID;
        this.comName = comName;
        this.workAge = workAge;
    }

    public String getComID() {
        return comID;
    }

    public void setComID(String comID) {
        this.comID = comID;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Company{" +
                "comID='" + comID + '\'' +
                ", comName='" + comName + '\'' +
                ", workAge=" + workAge +
                '}';
    }
}
