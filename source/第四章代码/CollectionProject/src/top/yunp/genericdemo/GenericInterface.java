package top.yunp.genericdemo;

@FunctionalInterface
public interface GenericInterface<R> {

    public abstract void printData(R r);

//    public abstract  void accept​(T t)
}
