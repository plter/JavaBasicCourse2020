package top.yunp;

import java.util.Scanner;

/**
 * 用来测试 自定义的Java类
 */
public class UserTest {

    public static void main(String[] args)
    {

//        Scanner sc = new Scanner(System.in);

        //创建User类的具体实例 对象
        User uu = new User(); //构造方法

//        uu.setName("张三");
//        uu.setAge(10);
//        uu.setSex("男");
//        uu.setAddress("中国北京");
//        uu.setPhone("12345678911");

        uu.sum(1,2,3);

        String str = uu.printUser();
        System.out.println("User的实例对象："+str);

        System.out.println("User的实例："+uu);

        User uu1 = new User("李四",20,"女","11133344455");

        uu1.setAddress("中国上海");
        System.out.println("User的实例对象："+uu1.printUser());
        System.out.println("User的实例："+uu1.toString());


    }
}
