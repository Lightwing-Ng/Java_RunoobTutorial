package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _04_PriorityConfiguration
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:14
 * @Version 1.0
 **/
public class _04_PriorityConfiguration extends Thread {
    private int countDown = 5;
    private volatile double d = 0;

    public _04_PriorityConfiguration(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            for (int i = 1; i < 100000; i++)
                d += (Math.PI + Math.E) / (double) i;
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        new _04_PriorityConfiguration(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++)
            new _04_PriorityConfiguration(Thread.MIN_PRIORITY);
    }
}
