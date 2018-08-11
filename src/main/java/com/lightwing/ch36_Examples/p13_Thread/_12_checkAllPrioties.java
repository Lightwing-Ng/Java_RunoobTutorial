package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _12_checkAllPrioties
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:16
 * @Version 1.0
 **/
public class _12_checkAllPrioties {
    private static Runnable makeRunnable() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                Thread t = Thread.currentThread();
                System.out.println("in run() - priority="
                        + t.getPriority() + ", name=" + t.getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("in main() - Thread.currentThread().getPriority()=" + Thread.currentThread().getPriority());
        System.out.println("in main() - Thread.currentThread().getName()=" + Thread.currentThread().getName());
        Thread threadA = new Thread(makeRunnable(), "threadA");
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("in main() - threadA.getPriority()=" + threadA.getPriority());
    }
}
