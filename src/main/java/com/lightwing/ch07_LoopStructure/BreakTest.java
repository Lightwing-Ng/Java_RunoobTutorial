package com.lightwing.ch07_LoopStructure;

/**
 * @ClassName BreakTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:59
 * @Version 1.0
 **/
public class BreakTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x == 30)
                break;

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
