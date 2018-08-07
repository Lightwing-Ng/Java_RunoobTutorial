package com.lightwing.ch33_MultiThreadedProgramming;

/**
 * @ClassName TestThread_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:16
 * @Version 1.0
 **/
public class TestThread_2 {
    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
