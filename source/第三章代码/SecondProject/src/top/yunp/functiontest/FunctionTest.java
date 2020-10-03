package top.yunp.functiontest;

public class FunctionTest {

    public static void main(String[] args)
    {

//        doJob(  ()->{System.out.println("英语口语能力");}  );

//        T_Language lan = init();
//
//        doJob(lan);

//        doJob(init());

        /**
         * 函数的引用   方法的引用
         *         stu =   0x000001111
         * Student stu = new Student();
         *
         *            lan  =  0x00002222
         * T_Language lan = init();
         *
         *
         * 函数引用： 不是方法调用
         *
         * Student stu = new Student();
         * stu.speak(); ---> 进行了方法调用
         *
         * stu::spreak  ---> 进行了方法引用
         */

//        对于非静态的成员方法  使用 类的对象进行引用
//        Student stu = new Student();
//        doJob(   stu::speak   );

//        对于静态的成员方法  使用类名直接 引用
        doJob(  Student:: eat );

        /**
         * 函数的类型： 主要关注的是 (函数的形式参数列表) -> {函数体 -- 返回值类型}
         *
         * 无 -> void
         *
         *
         */

//        public void speak()
//        {
//            System.out.println("学习汉语");
//            System.out.println("学习英语");
//        }
//
//        public abstract void speakEnglish();

    }

    /**
     * 这里可以形容为  将一个函数作为实际参数 传入到 某个方法中
     * @param language
     */
    public static void doJob(T_Language language)
    {
        language.speakEnglish();
    }

    /**
     * 将 函数式接口 作为返回值类型
     * 方法体中 构造出对应 Lamda表达式 作为函数式接口中 抽象方法 的 具体实现
     * @return
     */
    public static T_Language init()
    {
        return ()->{System.out.println("英语口语能力 --- AAAA");};
    }
}
