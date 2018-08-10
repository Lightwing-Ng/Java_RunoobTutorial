package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _06_StackException
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:40
 * @Version 1.0
 **/
public class _06_StackException {
    public static void main(String args[]) {
        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 10;
        int result;
        try {
            result = num1 / num2;
            System.out.println("The result is" + result);
            for (int i = 5; i >= 0; i--)
                System.out.println(
                        "The value of array is" +
                                array[i]
                );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
