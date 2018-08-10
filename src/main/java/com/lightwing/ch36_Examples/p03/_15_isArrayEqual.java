package com.lightwing.ch36_Examples.p03;

import java.util.Arrays;

/**
 * @ClassName _15_isArrayEqual
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:21
 * @Version 1.0
 **/
public class _15_isArrayEqual {
    public static void main(String[] args) {
        int[] ary = {
                1, 2, 3, 4, 5, 6
        };
        int[] ary1 = {
                1, 2, 3, 4, 5, 6
        };
        int[] ary2 = {
                1, 2, 3, 4
        };
        System.out.println("数组 ary 是否与数组 ary1相等? ："
                + Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ："
                + Arrays.equals(ary, ary2));
    }
}
