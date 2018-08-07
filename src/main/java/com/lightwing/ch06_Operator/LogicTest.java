package com.lightwing.ch06_Operator;

/**
 * @ClassName LogicTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:43
 * @Version 1.0
 **/
public class LogicTest {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }
}
