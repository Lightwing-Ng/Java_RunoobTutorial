package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _01_checkThreadAlive
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:12
 * @Version 1.0
 **/
public class _01_checkThreadAlive extends Thread {
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
        _01_checkThreadAlive tt = new _01_checkThreadAlive();
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
        tt.start();
        System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
        for (int i = 0; i < 10; i++)
            tt.printMsg();
        System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
    }
}
