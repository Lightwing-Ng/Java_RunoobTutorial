package com.lightwing.ch14_DateTime;

import java.util.Date;

/**
 * @ClassName DiffDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:35
 * @Version 1.0
 **/
public class DiffDemo {
    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
