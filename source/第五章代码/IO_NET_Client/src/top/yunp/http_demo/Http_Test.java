package top.yunp.http_demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Http_Test {

    public static void main(String[] args) throws IOException {

        String path = "http://127.0.0.1:10101?name=张三&pwd=qwe321";

        URL url = new URL(path);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
        conn.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language","zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        conn.setRequestProperty("Accept-Encoding","gzip, deflate");
        conn.setRequestProperty("Connection","keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests","1");


        conn.connect();

        int code = conn.getResponseCode();

        System.out.println("code == "+code);

    }
}
