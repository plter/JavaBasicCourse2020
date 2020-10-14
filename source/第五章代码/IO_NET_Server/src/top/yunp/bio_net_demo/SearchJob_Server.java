package top.yunp.bio_net_demo;

import com.alibaba.fastjson.JSON;
import top.yunp.javabean.Company;
import top.yunp.javabean.Worker;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SearchJob_Server {

    public static void main(String[] args) throws IOException {
        doSerach();
    }

    public static void doSerach() throws IOException {

        ServerSocket ss = new ServerSocket(10100);

        while (true)
        {
            Socket sk = ss.accept();

            InputStream is = sk.getInputStream();
            OutputStream os = sk.getOutputStream();

            DataInputStream dis = new DataInputStream(is);

            String msg = dis.readUTF();
            System.out.println("服务端收到内容："+msg);

            System.out.println("操作数据库执行对应操作");
            // select * from user where name='张三'

//        客户端与服务端开发  的接口文档
//        请求地址：  TCP ： 127.0.0.1  10060
//                  HTTP ： yunp.top  ? server
//        请求参数：   搜索：  搜索的关键字  k-v  search = "Java"
//                    https://www.baidu.com/baidu?tn=monline_3_dg&ie=utf-8&wd=maven
//        相应内容：
//                 结果描述：
//                 数据样例：
//        {   ---> Java类开始      --> 人为定义一个类的名字
//           "age":35,  --> K-v 表示成员变量  int
//           "name":"张三",                 String
//           "sex":"男",                    String
//           "companies":[ ---> K:Vs 表示该成员变量 具有多个数据  ArrayList<T>
//                   {  ---> 这里又是一个Java类开始  --> 人为定义一个类的名字
//                      "comID":"001",  成员变量
//                      "comName":"百度",
//                      "workAge":3
//                    },
//                   {"comID":"002","comName":"阿里","workAge":2},
//                   {"comID":"003","comName":"腾讯","workAge":2}
//                   ]
//        }

            /**
             * 对于服务端开发人员： 也要根据接口文档进行工作
             * a、根据JSON字符串 编写对应的Java类
             */

            ArrayList<Company> coms = new ArrayList<>();
            Company com1 = new Company("001","百度",3);
            Company com2 = new Company("002","阿里",2);
            Company com3 = new Company("003","腾讯",2);
            coms.add(com1);
            coms.add(com2);
            coms.add(com3);
            Worker wk = new Worker(40,"张三","男",coms);

            String json = JSON.toJSONString(wk);
            System.out.println("服务端已经查询到相关数据："+json);

            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(json);
            dos.flush();

        }
    }
}
