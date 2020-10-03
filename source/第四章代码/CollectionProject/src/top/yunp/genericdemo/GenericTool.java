package top.yunp.genericdemo;

public class GenericTool {

    private GenericTool()
    {

    }

    /**
     * 检查任意给定的两个Java对象是否 满足equals
     * @return
     */
    public static <E> boolean doCheck(E first ,E second)
    {
        return first.equals(second);
    }
}
