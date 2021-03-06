package com.lightwing.ch33_MultiThreadedProgramming;

/**
 * @ClassName GuessANumber
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:17
 * @Version 1.0
 **/
public class GuessANumber extends Thread {
    private int number;

    GuessANumber(int number) {
        this.number = number;
    }

    public void run() {
        int counter = 0;
        int guess;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
        } while (guess != number);
        System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");
    }
}
