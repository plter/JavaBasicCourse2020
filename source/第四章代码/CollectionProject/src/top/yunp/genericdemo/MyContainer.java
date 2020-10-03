package top.yunp.genericdemo;

//定义了一个泛型的类 并且指定 使用 T来表示
public class MyContainer<T> {


    Object[] datas;
    int index = 0;

    public MyContainer()
    {
        datas = new Object[10];
    }

    public void addData(T t)
    {
        datas[index] = t;
        index++;
    }

    public T getData(int indexindex)
    {
        return  (T)datas[indexindex];
    }

    /**
     * 当前类中能够提供一个方法 用来整体的输出当前容器中所有数据
     */

    public void forEach(GenericInterface<T> gi)
    {
        for(int i = 0 ;i<10 ; i++)
        {
            T data = getData(i);
            if(null != data)
            {
                gi.printData(data);
            }
        }
    }

}
