package com.lightwing.ch16_Method;

/**
 * @ClassName TestVoidMethod
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:53
 * @Version 1.0
 **/
public class TestVoidMethod {
    public static void main(String[] args) {
        printGrade();
    }

    private static void printGrade() {
        if (78.5 >= 90.0) {
            System.out.println('A');
        } else if (78.5 >= 80.0) {
            System.out.println('B');
        } else if (78.5 >= 70.0) {
            System.out.println('C');
        } else if (78.5 >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
