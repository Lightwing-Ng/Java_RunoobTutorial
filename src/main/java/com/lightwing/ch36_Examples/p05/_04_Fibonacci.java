package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _04_Fibonacci
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:47
 * @Version 1.0
 **/
public class _04_Fibonacci {
    private static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++)
            System.out.printf("Fibonacci of %d is: %d\n",
                    counter, fibonacci(counter));
    }
}
