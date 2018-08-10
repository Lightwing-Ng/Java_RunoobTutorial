package com.lightwing.ch36_Examples.p03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _16_UnionSet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:23
 * @Version 1.0
 **/
public class _16_UnionSet {
    public static void main(String[] args) {
        String[] arr1 = {
                "1", "2", "3"
        };
        String[] arr2 = {
                "4", "5", "6"
        };
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : result_union)
            System.out.println(str);
    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    private static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, arr1);
        Collections.addAll(set, arr2);
        String[] result = {};
        return set.toArray(result);
    }
}
