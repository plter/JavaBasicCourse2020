package top.yunp.login;

import top.yunp.dao.DataSaved;
//import top.yunp.domain.User;
import top.yunp.javabean.Worker;
import top.yunp.utils.JobUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Job_Login {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("请输入用户名");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        boolean result = JobUtil.checkUserName(name);

        if(result)
        {
            DataSaved.saveData(name);
        }
        else
        {
            System.out.println("用户名错误");
        }

//        这里依然不可以使用 因为 对应的模块没有向外提供这些类！
//        User uu = new User();

//        强耦合
//        User uu = new User();
//        System.out.println(uu);

//        反射  ---> 解耦合
//        Class cls = Class.forName("top.yunp.domain.User");
//
//        Constructor constructor = cls.getConstructor();
//
//        Object obj = constructor.newInstance();
//
//        System.out.println(obj);
        /**
         *
         * 模块的好处：
         *
         *  1、强封装性
         *  2、实际开发中  对于包的依赖  三方jar依赖
         *  3、代码运行  占用内存减少了
         */


        Worker wk = new Worker();

        wk.name = "张三";
//        wk.age = 10;
//        wk.sex = "男";
//        wk.address = "北京";
        wk.eat();
//        wk.sleep();
//        wk.study();
//        wk.play();

        WokerZi ww = new WokerZi();

        ww.doJob();

    }
}
