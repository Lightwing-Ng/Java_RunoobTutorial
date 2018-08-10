package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _08_ChainedException
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:43
 * @Version 1.0
 **/
public class _08_ChainedException {
    public static void main(String args[]) throws Exception {
        int n = 20, result;
        try {
            result = n / 0;
            System.out.println("结果为" + result);
        } catch (ArithmeticException ex) {
            System.out.println("发算术异常: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("手动抛出链试异常 : " + ex1);
            }
        }
    }
}
