package com.lightwing.ch33_MultiThreadedProgramming;

/**
 * @ClassName RunnableDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:10
 * @Version 1.0
 **/

public class TestThread_1 {
    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}
