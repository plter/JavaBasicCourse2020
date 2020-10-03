package top.yunp.functiondemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 这里演示官方已经定义好的 函数式接口  咱们使用Lamda表达式来操作
 */
public class FunctionDemo {


    public static void main(String[] args)
    {

        /**
         * 数组：
         *   ____________
         *   数据类型[] 数组名 = new 数据类型[长度];
         *   不可变长
         *
         * 官方的API ---> Collection Map
         *
         *   ArrayList ---> 可自动增长
         */

        ArrayList<String> strs = new ArrayList<String>();

        strs.add("AAAA");
        strs.add("BBB");
        strs.add("CCCC");
        strs.add("DDD");

        Stream<String> result = strs.stream();

//        Stream<String> fils = result.filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if(s.length() > 3)
//                {
//                    return true;
//                }
//                return false;
//            }
//        });

        Stream<String> fils = result.filter(  (String s)->{return s.length()>3;}  );


//        fils.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        fils.forEach( s -> System.out.println(s)  );

//        for(int i = 0; i< 100; i++)
//        {
//
//        }

    }
}
