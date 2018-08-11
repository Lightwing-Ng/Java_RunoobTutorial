package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;

/**
 * @ClassName _13_modifyList
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:01
 * @Version 1.0
 **/
public class _13_modifyList {
    public static void main(String[] a) {
        LinkedList officers = new LinkedList();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }
}
