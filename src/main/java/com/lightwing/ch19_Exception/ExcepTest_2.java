package com.lightwing.ch19_Exception;

/**
 * @ClassName ExcepTest_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:18
 * @Version 1.0
 **/
public class ExcepTest_2 {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
