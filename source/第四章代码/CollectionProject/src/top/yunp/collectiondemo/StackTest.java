package top.yunp.collectiondemo;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args)
    {

//        E 	pop()
//        移除栈顶元素，并且将其作为返回值进行返回
//        E 	push​(E item)
//        将元素压入到栈中

        Stack<String> stack = new Stack<>();

        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");

        System.out.println(stack);

        String el1 = stack.pop();
        System.out.println(el1);
        System.out.println(stack);

        String el2 = stack.pop();
        System.out.println(el2);
        System.out.println(stack);

        String el3 = stack.pop();
        System.out.println(el3);
        System.out.println(stack);

        //Exception in thread "main" java.util.EmptyStackException
        //存储了多少个元素 就 使用对应多少次弹栈的操作，不要超出数量
        //压栈操作 与 弹栈操作 次数需要对应起来
        String el4 = stack.pop();
        System.out.println(el4);
        System.out.println(stack);



    }
}
