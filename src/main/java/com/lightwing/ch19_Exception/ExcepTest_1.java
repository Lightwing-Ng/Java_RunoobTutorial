package com.lightwing.ch19_Exception;

/**
 * @ClassName ExcepTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:17
 * @Version 1.0
 **/
public class ExcepTest_1 {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
