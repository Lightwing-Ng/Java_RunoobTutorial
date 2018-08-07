package com.lightwing.ch07_LoopStructure;

/**
 * @ClassName DoWhileTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:55
 * @Version 1.0
 **/
public class DoWhileTest {
    public static void main(String args[]) {
        int x = 10;
        do {
            System.out.print("value of x: " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }
}
