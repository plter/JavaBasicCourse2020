package top.yunp.jdbc_demo;

import java.sql.*;

public class JDBC_Test {

    /**
     * Socket --> 客户端
     * ServerSocket --> 服务端
     *
     * 客户端发送信息 （注册信息、登录信息、搜索信息、下订单）
     *
     * 服务端接收到这些信息 ---> 后续的处理：
     *      注册信息：  保存下来  保存到文件中！   当数据量比较大时  一般使用数据操作
     *                MySQL  Oracle  Hbase
     *
     *      JDBC机制： Java Database Connection
     *              MySQL --> 支持MySQL的机制
     *              Oracle --> 支持Oracle机制
     *
     *              Java官方： 统一标准  java.sql 定义了一堆接口 、抽象类  规则！
     *
     *          各大数据库厂商 分别取实现 JDBC机制中 逻辑 称为一个个jar
     *
     *          开发人员如果需要使用 某个具体数据库 就要到对应的官方网上 下载 这个jar
     *
     *          就和之前FastJson 一样！
     */

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/school?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM student WHERE name = '张三'";
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next())
        {
            System.out.println("id = "+rs.getString("id"));
            System.out.println("name = "+rs.getString("name"));
            System.out.println("age = "+rs.getString("age"));
            System.out.println("sex = "+rs.getString("sex"));
            System.out.println("score = "+rs.getString("score"));
            System.out.println("teacher = "+rs.getString("teacher"));
        }
    }
}
