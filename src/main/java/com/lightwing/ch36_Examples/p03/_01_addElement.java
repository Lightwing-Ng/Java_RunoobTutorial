package com.lightwing.ch36_Examples.p03;

import java.util.Arrays;

/**
 * @ClassName _01_addElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:28
 * @Version 1.0
 **/
public class _01_addElement {
    public static void main(String args[]) {
        int array[] = {
                2, 5, -2, 6, -3, 8, 0, -7, -9, 4
        };
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println(
                "元素 1 所在位置（负数为不存在）："
                        + index
        );
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素 1", array);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(
            int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index
                + 1, length - index);
        return destination;
    }
}
