package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _07_OverloadException
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:41
 * @Version 1.0
 **/
public class _07_OverloadException {
    private double method(int i) throws Exception {
        return i / 0;
    }

    private static double method(int x, double y) throws Exception {
        return x + y;
    }

    private static double method(double x, double y) {
        return x + y - 3;
    }

    public static void main(String[] args) {
        _07_OverloadException mn = new _07_OverloadException();
        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(mn.method(10));
        } catch (Exception ex) {
            System.out.println("exception occoure: " + ex);
        }
    }
}
