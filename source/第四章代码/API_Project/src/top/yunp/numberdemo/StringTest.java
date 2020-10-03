package top.yunp.numberdemo;

import java.io.IOException;
import java.util.Properties;
import java.util.stream.Stream;

public class StringTest {

    public static void main(String[] args) throws IOException {
//        int 	compareTo​(String anotherString)
//        根据计算机编码表的先后顺序比较两个字符串

//        String str1 = "张";
//        String str2 = "李";
//
//        int result = str1.compareTo(str2);
//        System.out.println("result  == "+result);

//        boolean 	contains​(CharSequence s)
//        CharSequence是String类的父类，对于contains方法，其参数需要的是接口，那么可以传入对应接口的实现类
//        判断当前字符串是否包含另外一个字符串，并且是连续的，判断时，区分大小写

//        String str3 = "HelloWorld";
//        boolean conBool1 = str3.contains("h");
//        boolean conBool2 = str3.contains("H");
//        boolean conBool3 = str3.contains("Wor");
//        boolean conBool4 = str3.contains("Wr");
//        System.out.println("conBool1 == "+conBool1);
//        System.out.println("conBool2 == "+conBool2);
//        System.out.println("conBool3 == "+conBool3);
//        System.out.println("conBool4 == "+conBool4);
//        conBool1 == false
//        conBool2 == true
//        conBool3 == true
//        conBool4 == false

//        boolean 	endsWith​(String suffix)
//        boolean 	startsWith​(String prefix)
//        判断当前字符串是否以指定的字符串开头或者结尾

//        boolean conBool5 = str3.endsWith("d");
//        boolean conBool6 = str3.endsWith("lld");
//        boolean conBool7 = str3.startsWith("H");
//        boolean conBool8 = str3.startsWith("Hel");
//        System.out.println("conBool5 == "+conBool5);
//        System.out.println("conBool6 == "+conBool6);
//        System.out.println("conBool7 == "+conBool7);
//        System.out.println("conBool8 == "+conBool8);


//        int 	indexOf​(String str)
//        int 	lastIndexOf​(String str)
//        判断指定字符串在当前字符串中出现的索引位置，这个索引位置是 对应于 char数组的！
//        char[] 	toCharArray()
//        可以将当前的字符串转换为一个char数组

//        String str = "HelloWorld Java";
//
//        int first = str.indexOf("l");
//        int last = str.lastIndexOf("l");
//        System.out.println("first == "+first);
//        System.out.println("last == "+last);
//
//        char[] chs = str.toCharArray();
//        int len = chs.length;
//
//        for(int i = 0; i< len; i++)
//        {
//         System.out.println("i == "+i+"---"+chs[i]);
//        }





//        boolean 	equals​(Object anObject)

//        String str1 = new String("Hello"); // 0x000111
//        String str2 = new String("Hello"); // 0x000222

//        String str1 = "Hello";  //栈  堆  方法区（字符串常量池，byte常量池）
//        String str2 = "Hello";  // 0x000333
//
//        boolean result = str1.equals(str2);
//
//        System.out.println("result == "+result);
//
//        int a = 10;
//        int b = 20;
//        //对于基本数据类型 == 直接比较的是其变量中的值， 10 20
//        if(a == b)
//        {
//            System.out.println("两个数字相等");
//        }
//        else
//        {
//            System.out.println("两个数字不等");
//        }
//
//        //对于引用数据类型 == 直接比较的是 两个变量中的值，对于引用数据类型来说 变量中保存的是 内存地址值
//        //对于引用数据类型 如果想要比较其 值是否相同 需要使用equals
//        if(str1  == str2)
//        {
//            System.out.println("两个字符串相等");
//        }
//        else
//        {
//            System.out.println("两个字符串不等");
//        }


//        boolean 	isBlank()
//        boolean 	isEmpty()
//        int 	length()
//        String 	trim()
//        去除字符串的前后位置的空格
//        String str1 = "";
//        String str2 = " ";
//
//        System.out.println(str1.isBlank());
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.length());
//        System.out.println("===============");
//        System.out.println(str2.isBlank()); // 对于具体内容的判断是否为空 主要 空格 TAB
//        System.out.println(str2.isEmpty()); // 对于长度为0的字符串判断为空
//        System.out.println(str2.length());

//        true
//        true
//        0
//                ===============
//        true
//        false
//        1

//        String str3 = "  A A A  ";
//        System.out.println(str3);
//        System.out.println(str3.trim());
//
//        //null 指的是 空  对于引用数据类型来说，默认值
//        String str4 = null;
//
//        String str5 = null;
//
//        int a = 10;
//
//        System.out.println(a);
//        System.out.println(str4);
//        System.out.println(str5);
//
//        Student stu = null;
//
//        if(null != str4)
//        {
//            boolean result = str4.equals(str5);
//            System.out.println(result);
//        }
//        else
//        {
//            System.out.println("str4 是null 的");
//        }
//

//        Exception in thread "main" java.lang.NullPointerException
//            at top.yunp.numberdemo.StringTest.main(StringTest.java:148)





//        boolean 	matches​(String regex)
//        判断指定字符串是否符合给定的正则表达式规则
//        正则表达式：  使用一些特殊符号 表示一定含义的 字符串
//        ^: 表示开头   ^A   ^ABC  ^ 只能约束其后面的第一个字符
//        $: 表示结尾   9$   uu9$  $ 只能约束其签名的第一个字符
//        .: 表示单个字符
//        *: 表示个数

//        String regex = "^Q.*9$";
//
//        String str1 = "QQQ888";
//        String str2 = "aa22319";
//        String str3 = "Q122312ssdd9";
//        String str4 = "Q9";
//
//        System.out.println(str1.matches(regex));
//        System.out.println(str2.matches(regex));
//        System.out.println(str3.matches(regex));
//        System.out.println(str4.matches(regex));


//        String 	replace​(char oldChar, char newChar)
//        使用新的字符 替换 老的字符
//        String str1 = "HelloWorld Java Spark";
//
//        String str2 = str1.replace('l','A');
//        System.out.println(str2);

//        String[] 	split​(String regex)
//       根据指定的字符 进行字符串的切分操作
//        String[] words = str1.split(" ");
//        for (int i = 0; i<3 ; i++)
//        {
//            System.out.println(words[i]);
//        }


//        String 	substring​(int beginIndex, int endIndex)
//     根据指定的索引 进行字符串的切分 [beginIndex,endIndex)
//        String str3 = str1.substring(2,8);
//        System.out.println(str1);
//        System.out.println(str3);




//        byte[] 	getBytes​(String charsetName)
//        String​(byte[] bytes, String charsetName)
//        Properties prop = new Properties();
//        prop.load(StringTest.class.getClassLoader().getResourceAsStream("conf.properties"));
//        String msg = (String)prop.get("name");
//        byte[] buff = msg.getBytes("ISO-8859-1");
//        String mm = new String(buff,"GBK");
//        System.out.println(msg);
//        System.out.println(mm);

//        Stream<String> 	lines() ---(Since 11)

//        System.out.println("AAA");
//        System.out.println("BB");
//        System.out.println("CCCDD");
//        System.out.println("DDD");
//        System.out.println("AAAWW");

//        \r  \n  \r\n
        String str = "AAA\n" +
                "BB\n" +
                "CCCDD\n" +
                "DDD\n" +
                "AAAWW";

        Stream<String> st =  str.lines();
//        st.forEach(System.out::println);

        Stream<String> newStr = st.filter((String ss)->{ return  ss.length()  >4;});
        newStr.forEach(System.out::println);

    }

}
