package top.yunp.http_demo;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Http_Client {

    /**
     * java.net.URL
     *  URL​(String spec)
     *  URLConnection 	openConnection()
     *
     * java.net.HttpURLConnection
     *      void 	setRequestMethod​(String method)
     *
     *      int 	getResponseCode()
     *      GET  POST
     *      https://www.baidu.com?name=张三&pwd=123
     *
     *      HTTP协议：
     *          请求头：
     *              GET
     *              http://www.baidu.com  IE 浏览器内核   HTTP1.0  1.1
     *
     *
     *          请求空行：
     *
     *          请求体：
     *
     *              如果数据不在请求连接后面拼接上 这样的操作称为POST
     */

    public static void main(String[] args) throws IOException {

        String path = "https://yunp.top/app/index";

        URL url = new URL(path);

        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
//        conn.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//        conn.setRequestProperty("Accept-Language","zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
//        conn.setRequestProperty("Accept-Encoding","gzip, deflate");
//        conn.setRequestProperty("Connection","keep-alive");
//        conn.setRequestProperty("Upgrade-Insecure-Requests","1");
//        conn.setRequestProperty("Host","d0.ananas.chaoxing.com");
//        conn.connect();

        conn.connect();

        int code = conn.getResponseCode();

        if(code == 200)
        {
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buff = new byte[1024];
            int len = 0;

            FileOutputStream fos = new FileOutputStream("E:/CCCC/a.html");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            while ((len = bis.read(buff))!=-1)
            {
                //将某个网页存储到本地！
                bos.write(buff,0,len);
                bos.flush();
            }

            bos.close();
            fos.close();
        }


    }

}
