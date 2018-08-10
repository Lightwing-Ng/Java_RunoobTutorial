package com.lightwing.ch36_Examples.p05;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @ClassName _07_instanceOf
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:05
 * @Version 1.0
 **/
public class _07_instanceOf {
    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }

    private static void displayObjectClass(Object o) {
        if (o instanceof Vector)
            System.out.println("对象是 java.util.Vector 类的实例");
        else if (o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是 " + o.getClass() + " 类的实例");
    }
}
