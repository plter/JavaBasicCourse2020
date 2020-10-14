package top.yunp.bio_net_demo;

import com.alibaba.fastjson.JSON;
import top.yunp.domain.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Regist_Cient {

    public static void main(String[] args) throws IOException {

        System.out.println("经过html页面处理，获取到一些信息！");
        String name = "张三";
        String pwd = "qwe321,qq";
        String address = "北京，海淀";

        Socket sk = new Socket("127.0.0.1",10060);
        OutputStream os = sk.getOutputStream();

//       方式一
//        DataOutputStream dos = new DataOutputStream(os);
//        dos.writeUTF(name);
//        dos.writeUTF(pwd);
//        dos.writeUTF(address);
//       方式二：
//        User uu = new User(name,pwd,address);
//        ObjectOutputStream oos = new ObjectOutputStream(os);
//        oos.writeObject(uu);
//        方式三： 随意定义一种格式 不是很好！
//        String msg = name+","+pwd+","+address;
//        规范的格式：  JSON  XML
        /**
         * JSON 格式：
         * {  --->  某个对象的开始
         *      k:v ---> 按照K-V对的形式 组织成员变量
         *
         *      K:vs ---> 特殊：选择兴趣方向   看书  游泳  编程
         *      K:[
         *          {},
         *          {}
         *      ]
         *
         * }  --->  对应的对象的结束
         * 既然大家都要使用同一种规范，就可以编写工具类
         *
         * FastJson
         *
         * 编写好的代码，可以封装起来，称为一个 XXX.jar 就可以对外提供 方便其他人使用
         * 将jar包引入到IDEA工程
         * 1、基本  ---> 建立一个目录 lib
         *    a、寻找一下  fastjosn 这个jar 并下载下来
         *    b、在当前工程中 加入jar包
         *    c、使用一下 jar中工具类
         * 2、工程构建工具 ： maven  gradle
         */

//        String msg = "{"+"name:"+name+","+pwd+"}";

        User uu = new User(name,pwd,address);

        String json =  JSON.toJSONString(uu);
        System.out.println(json);

        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(json);
        dos.flush();
//        {
//           "address":"北京，海淀",
//           "name":"张三",
//           "pwd":"qwe321,qq"
//        }


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
         * 根据上述接口文档：  客户端开发人员
         *
         * a、根据JSON字符串样例  编写对应的Java类
         *
         */


    }
}
