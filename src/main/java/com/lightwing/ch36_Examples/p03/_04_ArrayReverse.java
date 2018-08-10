package com.lightwing.ch36_Examples.p03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName _04_ArrayReverse
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:34
 * @Version 1.0
 **/
public class _04_ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);
    }
}
