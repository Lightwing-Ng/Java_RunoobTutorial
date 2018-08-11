package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;

/**
 * @ClassName _06_getElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:30
 * @Version 1.0
 **/
public class _06_getElement {
    private LinkedList list = new LinkedList();

    public void push(Object v) {
        list.addFirst(v);
    }

    public Object top() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        _06_getElement stack = new _06_getElement();
        for (int i = 30; i < 40; i++)
            stack.push(i);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
