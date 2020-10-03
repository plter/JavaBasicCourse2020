package top.yunp.oopdemo.interfacedemo;

//           实现类      实现      接口
public class Student implements Language {

    @Override
    public void speakEnglish() {
        System.out.println("说英语口语");
    }

    @Override
    public void speakChinese() {
        System.out.println("讲汉语");
    }
}
