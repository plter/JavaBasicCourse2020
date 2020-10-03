package top.yunp.functiondemo;

public class HighStudent implements Language{
    @Override
    public void speakEnglish() {
        System.out.println("大学生--讲英语");
    }

    @Override
    public void sprakChinese() {
        System.out.println("大学生--讲汉语");
    }
}
