package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _04_catchMethod
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:36
 * @Version 1.0
 **/
public class _04_catchMethod {
    public static void main(String args[]) {
        int array[] = {
                20, 20, 40
        };
        int num1 = 15, num2 = 10;
        int result;
        try {
            result = num1 / num2;
            System.out.println("结果为: " + result);
            for (int i = 5; i >= 0; i--)
                System.out.println("数组的元素值为: " + array[i]);
        } catch (Exception e) {
            System.out.println("触发异常 : " + e);
        }
    }
}
