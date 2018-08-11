package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * @ClassName _07_getElementIndex
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:36
 * @Version 1.0
 **/
public class _07_getElementIndex {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("元素索引值为 : " + index);
    }
}
