package top.yunp.functiondemo;

public class MiddleStudent  implements Language{
    @Override
    public void speakEnglish() {
        System.out.println("中学生--讲英语");
    }

    @Override
    public void sprakChinese() {
        System.out.println("中学生--讲汉语");
    }

    @Override
    public void speakFrench()
    {
        System.out.println("中学生--学习法语");
    }
}
