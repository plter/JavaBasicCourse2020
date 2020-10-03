package top.yunp.numberdemo;

public class StringDemo {

    public static void main(String[] args)
    {

//        String​(StringBuffer buffer)
//        String​(StringBuilder builder)
//        String str = "AAA";
//        String str1 = str+"bbb";
        //AAAbbb

        //不支持线程安全的  单线程程序中
        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder s1 =  stringBuilder.append("AAA").append("CCC").append(11);

        System.out.println(s1);
        System.out.println(s1.toString());

        //线程安全的  更多的应用在多线程编程场景下
        StringBuffer stringBuffer = new StringBuffer();

        StringBuffer s2 = stringBuffer.append("AAAA").append(true).append(1100).append(2.134);
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}
