module common {

    //编译时期  运行时期  --> exports 表示在这两个时期 都可以对外提供
    exports top.yunp.utils;

    //只能在 运行时期 通过反射操作 来获取当前类  进行创建对象等操作
//    opens top.yunp.domain;
    exports top.yunp.javabean;
}