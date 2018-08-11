package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _11_getAllThreads
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:16
 * @Version 1.0
 **/
public class _11_getAllThreads extends Thread {
    public static void main(String[] args) {
        _11_getAllThreads t1 = new _11_getAllThreads();
        t1.setName("thread1");
        t1.start();
        ThreadGroup currentGroup =
                Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
    }
}
