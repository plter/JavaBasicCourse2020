package top.yunp.functiondemo;

public class SmallStudent implements Language{
    @Override
    public void speakEnglish() {
        System.out.println("小学生--讲英语");
    }

    @Override
    public void sprakChinese() {
        System.out.println("小学生--讲汉语");
    }
}