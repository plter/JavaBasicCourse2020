package top.yunp.functiontest;

@FunctionalInterface
public interface T_Language {

    public abstract void speakEnglish();

    default void sum(int a,int b)
    {
        System.out.println("和："+(a+b));
    }
}
