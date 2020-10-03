package top.yunp.mapdemo;

import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

        prop.load(PropertiesTest.class.getClassLoader().getResourceAsStream("conf.properties"));

        String msg = (String) prop.get("name");

        byte[] buff = msg.getBytes("ISO-8859-1");

        String result = new String(buff,"GBK");

        System.out.println(result);

        String passwd = (String) prop.getOrDefault("pwd1","123456");

        System.out.println(passwd);
    }
}
