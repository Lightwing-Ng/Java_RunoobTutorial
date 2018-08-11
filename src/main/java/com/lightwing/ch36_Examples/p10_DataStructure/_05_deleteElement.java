package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;

/**
 * @ClassName _05_deleteElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:28
 * @Version 1.0
 **/
public class _05_deleteElement {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("1");
        lList.add("8");
        lList.add("6");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.subList(2, 4).clear();
        System.out.println(lList);
    }
}
