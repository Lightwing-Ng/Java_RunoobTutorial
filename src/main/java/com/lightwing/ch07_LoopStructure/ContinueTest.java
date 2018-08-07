package com.lightwing.ch07_LoopStructure;

/**
 * @ClassName ContinueTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:59
 * @Version 1.0
 **/
public class ContinueTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30)
                continue;

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
