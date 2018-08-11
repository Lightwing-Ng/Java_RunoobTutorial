package com.lightwing.ch36_Examples.p11_Collection;

import java.util.*;

/**
 * @ClassName _06_TraversalCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:19
 * @Version 1.0
 **/
public class _06_TraversalCollection {
    public static void main(String[] args) {
        // List集合的遍历
        listTest();
        // Set集合的遍历
        setTest();
    }

    private static void setTest() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        // 重复数据添加失败
        set.add("Java");
        set.add("JavaScript");

        // 使用iterator遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用增强for循环遍历set集合
        for (String s : set) {
            System.out.println(s);
        }
    }

    // 遍历list集合
    private static void listTest() {
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");

        // 使用iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用传统for循环进行遍历
        for (int i = 0, size = list.size(); i < size; i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 使用增强for循环进行遍历
        for (String value : list) {
            System.out.println(value);
        }
    }
}
