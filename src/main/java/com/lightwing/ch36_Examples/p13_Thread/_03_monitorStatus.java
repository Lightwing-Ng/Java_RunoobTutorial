package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _03_monitorStatus
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:13
 * @Version 1.0
 **/
public class _03_monitorStatus extends Thread {
    boolean waiting = true;
    private boolean ready = false;

    _03_monitorStatus() {
    }

    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " starting.");
        while (waiting)
            System.out.println("waiting:" + waiting);
        System.out.println("waiting...");
        startWait();
        try {
            Thread.sleep(1000);
        } catch (Exception exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }

    synchronized void startWait() {
        try {
            while (!ready) wait();
        } catch (InterruptedException exc) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }
}

class Main {
    public static void main(String args[])
            throws Exception {
        _03_monitorStatus thrd = new _03_monitorStatus();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while (thrd.isAlive())
            System.out.println("alive");
        showThreadStatus(thrd);
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + "Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
    }

    public void setName(String thread1) {
    }

    public void start() {
    }
}
