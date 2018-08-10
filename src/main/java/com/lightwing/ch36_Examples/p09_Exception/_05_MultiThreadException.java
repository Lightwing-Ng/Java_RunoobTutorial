package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _05_MultiThreadException
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:38
 * @Version 1.0
 **/

class MyThread extends Thread {
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}

public class _05_MultiThreadException {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception x) {
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}
