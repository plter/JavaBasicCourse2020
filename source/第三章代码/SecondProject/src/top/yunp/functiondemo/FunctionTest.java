package top.yunp.functiondemo;

public class FunctionTest {

    public static void main(String[] args)
    {
        MiddleStudent stu1 = new MiddleStudent();

        stu1.speakEnglish();
        stu1.sprakChinese();
        stu1.speakFrench();

//        stu1.doJob();

        Language.doJob();
    }
}
