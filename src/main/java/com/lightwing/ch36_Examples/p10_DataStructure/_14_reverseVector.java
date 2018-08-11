package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * @ClassName _14_reverseVector
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:03
 * @Version 1.0
 **/
public class _14_reverseVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v, 0, 4);
        System.out.println("旋转后");
        System.out.println(v);
    }
}
