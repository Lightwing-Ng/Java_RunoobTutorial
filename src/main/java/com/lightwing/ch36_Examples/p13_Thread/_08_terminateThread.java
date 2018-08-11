package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _08_terminateThread
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:15
 * @Version 1.0
 **/
public class _08_terminateThread extends Thread {
    public void run() {
        try {
            // 延迟50秒
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Thread thread = new _08_terminateThread();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出!");
    }
}
