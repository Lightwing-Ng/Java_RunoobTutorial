package com.lightwing.ch36_Examples.p03;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName _06_getMax
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:39
 * @Version 1.0
 **/
public class _06_getMax {
    public static void main(String[] args) {
        Integer[] numbers = {
                8, 2, 7, 1, 4, 9, 5
        };
        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
