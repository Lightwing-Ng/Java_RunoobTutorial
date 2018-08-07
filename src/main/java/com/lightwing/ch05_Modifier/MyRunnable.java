package com.lightwing.ch05_Modifier;

/**
 * @ClassName MyRunnable
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:34
 * @Version 1.0
 **/
public class MyRunnable implements Runnable {
    private volatile boolean active;

    public void run() {
        active = true;
        int i = 0;
        while (active) {
            // 第一行
            System.out.println(++i);
        }
    }

    public void stop() {
        active = false; // 第二行
    }
}
