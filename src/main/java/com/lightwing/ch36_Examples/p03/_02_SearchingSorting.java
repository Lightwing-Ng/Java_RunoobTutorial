package com.lightwing.ch36_Examples.p03;

import java.util.Arrays;

/**
 * @ClassName _02_SearchingSorting
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:30
 * @Version 1.0
 **/
public class _02_SearchingSorting {
    public static void main(String args[]) {
        int array[] = {
                2, 5, -2, 6, -3, 8, 0, -7, -9, 4
        };
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素 2 在第 " + index + " 个位置");
    }

    private static void printArray(String message, int array[]) {
        System.out.println(
                message + ": [length: " +
                        array.length + "]"
        );
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
