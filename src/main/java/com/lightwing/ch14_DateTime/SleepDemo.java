package com.lightwing.ch14_DateTime;

import java.util.Date;

/**
 * @ClassName SleepDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:34
 * @Version 1.0
 **/
public class SleepDemo {
    public static void main(String args[]) {
        try {
            System.out.println(new Date() + "\n");
            // 休眠3秒
            Thread.sleep(1000 * 3);
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
