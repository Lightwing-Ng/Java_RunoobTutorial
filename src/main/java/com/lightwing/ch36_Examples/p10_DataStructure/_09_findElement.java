package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;

/**
 * @ClassName _09_findElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:42
 * @Version 1.0
 **/
public class _09_findElement {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("2");
        System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置：" + lList.lastIndexOf("2"));
    }
}
