package com.lightwing.ch07_LoopStructure;

/**
 * @ClassName AugmentedForTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:57
 * @Version 1.0
 **/
public class AugmentedForTest {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers)
            System.out.print(x + ", ");

        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names)
            System.out.print(name + ", ");
    }
}
