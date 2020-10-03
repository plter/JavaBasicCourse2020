package top.yunp.login;

import top.yunp.dao.DataSaved;
import top.yunp.domain.Product;
import top.yunp.domain.User;
import top.yunp.utils.CheckDataFromSQL;
import top.yunp.utils.JobUtil;

import java.util.Scanner;

public class Job_Login {

    public static void main(String[] args)
    {
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
            System.out.println("用户名存在错误");
        }

        Product product1 = new Product();

        product1.setPrice(100.2);
        product1.setProCategory("上衣");
        product1.setProName("老头衣");

        User uu = new User();

        CheckDataFromSQL.checkData(name);

    }
}
