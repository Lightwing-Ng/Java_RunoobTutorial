package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * @ClassName _12_getMaxElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:59
 * @Version 1.0
 **/
public class _12_getMaxElement {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Double("3.4324"));
        v.add(new Double("3.3532"));
        v.add(new Double("3.342"));
        v.add(new Double("3.349"));
        v.add(new Double("2.3"));
        Object obj = Collections.max(v);
        System.out.println("最大元素是：" + obj);
    }
}
