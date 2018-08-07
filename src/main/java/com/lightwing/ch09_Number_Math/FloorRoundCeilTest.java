package com.lightwing.ch09_Number_Math;

/**
 * @ClassName FloorRoundCeilTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:09
 * @Version 1.0
 **/
public class FloorRoundCeilTest {
    public static void main(String[] args) {
        double[] nums = {
                1.4, 1.5, 1.6, -1.4, -1.5, -1.6
        };
        for (double num : nums)
            test(num);
    }

    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}
