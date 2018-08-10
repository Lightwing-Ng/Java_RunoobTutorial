package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _05_Factorial
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:56
 * @Version 1.0
 **/
public class _05_Factorial {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter++)
            System.out.printf(
                    "%d! = %d\n", counter,
                    factorial(counter)
            );
    }

    private static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
