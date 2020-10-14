package top.yunp.bio_net_demo;

import com.alibaba.fastjson.JSON;
import top.yunp.javabean.User;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Regist_Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10060);

        System.out.println("服务端已经运行了！");
        Socket sk = ss.accept();

        InputStream is = sk.getInputStream();

        DataInputStream dis = new DataInputStream(is);

        String json = dis.readUTF();

        //json --> User
        User uuu = JSON.parseObject(json, User.class);
        System.out.println(uuu);

        /**
         * 方式一：
         *      序列化：
         *          a、服务端与客户端 对应的类的 包路径 必须一致！
         *          b、服务端与客户端 对应的Java类 都要实现序列化的接口
         *          c、两边这个Java类要完全相同
         *
         * 方式二：
         *      JSON
         *          a、服务端与客户端的类 路径不需要 完全相同
         *          b、两边的Java类都不需要 实现序列化
         *          c、两边的类都要一致
         *          d、两边的类都要一致 并且要与 JSON字符串中内容一致
         *          {"address":"北京，海淀","name":"张三","pwd":"qwe321,qq"}
         *           对应的json字符串中 k:v形式 中的k 就是对应Java类中 的成员变量的名称
         *           这个时候名称必须完全一样！
         *           String addres;
         *           address;
         *
         */
    }
}
