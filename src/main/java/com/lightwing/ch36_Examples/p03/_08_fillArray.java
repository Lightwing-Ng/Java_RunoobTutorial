package com.lightwing.ch36_Examples.p03;

import java.util.Arrays;

/**
 * @ClassName _08_fillArray
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:42
 * @Version 1.0
 **/
public class _08_fillArray {
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int anArray : array)
            System.out.println(anArray);

        System.out.println();
        Arrays.fill(array, 3, 6, 50);
        for (int anArray : array)
            System.out.println(anArray);
    }
}
