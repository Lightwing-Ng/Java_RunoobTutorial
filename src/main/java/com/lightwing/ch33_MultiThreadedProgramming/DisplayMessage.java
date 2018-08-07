package com.lightwing.ch33_MultiThreadedProgramming;

/**
 * @ClassName DisplayMessage
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:16
 * @Version 1.0
 **/
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
