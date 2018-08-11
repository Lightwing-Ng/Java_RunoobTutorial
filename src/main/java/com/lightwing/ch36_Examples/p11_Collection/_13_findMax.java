package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName _13_findMax
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:32
 * @Version 1.0
 **/
public class _13_findMax {
    public static void main(String[] args) {
        List list = Arrays.asList(
                "one Two three Four five six one three Four".split(" ")
        );
        System.out.println(list);
        System.out.println("最大值: " + Collections.max(list));
        System.out.println("最小值: " + Collections.min(list));
    }
}
