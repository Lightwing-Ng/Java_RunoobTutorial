package com.lightwing.ch36_Examples.p03;

import java.util.ArrayList;

/**
 * @ClassName _12_DifferenceSet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:48
 * @Version 1.0
 **/
public class _12_DifferenceSet {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "notcommon2");
        System.out.println("array1 的元素" + objArray);
        System.out.println("array2 的元素" + objArray2);
        objArray.removeAll(objArray2);
        System.out.println("array1 与 array2 数组差集为：" + objArray);
    }
}
