package com.lightwing.ch36_Examples.p03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName _07_mergeArray
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:41
 * @Version 1.0
 **/
public class _07_mergeArray {
    public static void main(String args[]) {
        String a[] = {
                "A", "E", "I"
        };
        String b[] = {
                "O", "U"
        };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
