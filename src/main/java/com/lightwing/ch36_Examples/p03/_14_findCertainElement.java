package com.lightwing.ch36_Examples.p03;

import java.util.ArrayList;

/**
 * @ClassName _14_findCertainElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:20
 * @Version 1.0
 **/
public class _14_findCertainElement {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<>();
        ArrayList<String> objArray2 = new ArrayList<>();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        System.out.println("objArray 的数组元素：" + objArray);
        System.out.println("objArray2 的数组元素：" + objArray2);
        System.out.println("objArray 是否包含字符串common2? ： "
                + objArray.contains("common2"));
        System.out.println("objArray2 是否包含数组 objArray? ："
                + objArray2.contains(objArray));
    }
}
