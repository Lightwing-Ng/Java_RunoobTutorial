package com.lightwing.ch36_Examples.p13_Thread;

/**
 * @ClassName _09_CustomerConsumer
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:15
 * @Version 1.0
 **/
public class _09_ProducerConsumer {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}

class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    Consumer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println(
                    "消费者 #" + this.number + " got: " + value
            );
        }
    }
}

class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    Producer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.put(i);
            System.out.println("生产者 #" + this.number + " put: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException ignored) {
            }
        }
    }
}
