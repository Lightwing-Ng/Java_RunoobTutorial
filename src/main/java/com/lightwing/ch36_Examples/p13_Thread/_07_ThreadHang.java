package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _07_ThreadHang
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:15
 * @Version 1.0
 **/
public class _07_ThreadHang extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    private _07_ThreadHang() {
        super("" + ++threadCount);
        start();
    }

    public String toString() {
        return "#" + getName() + ": " + countDown;
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0)
                return;
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        for (int i = 0; i < 5; i++)
            new _07_ThreadHang().join();
        System.out.println("线程已被挂起");
    }
}
