package com.lightwing.ch36_Examples.p10_DataStructure;

/**
 * @ClassName _01_Sum
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:11
 * @Version 1.0
 **/
public class _01_Sum {
    public static void main(String[] args) {
        int limit = 100;
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        }
        while (i <= limit);
        System.out.println("sum = " + String.format("%,d", sum));
    }
}
