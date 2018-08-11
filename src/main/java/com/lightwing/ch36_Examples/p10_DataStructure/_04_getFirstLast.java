package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;

/**
 * @ClassName _04_getFirstLast
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:26
 * @Version 1.0
 **/
public class _04_getFirstLast {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("100");
        lList.add("200");
        lList.add("300");
        lList.add("400");
        lList.add("500");
        System.out.println("链表的第一个元素是：" + lList.getFirst());
        System.out.println("链表的最后一个元素是：" + lList.getLast());
    }
}
