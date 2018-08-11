package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _02_getCurrentThreadName
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:12
 * @Version 1.0
 **/
public class _02_getCurrentThreadName extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            printMsg();
    }

    private void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args) {
        _02_getCurrentThreadName tt = new _02_getCurrentThreadName();
        tt.start();
        for (int i = 0; i < 10; i++)
            tt.printMsg();
    }
}
