package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _01_MyClass
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:51
 * @Version 1.0
 **/
public class _01_MyClass {
    int height;

    _01_MyClass() {
        System.out.println("无参数构造函数");
        height = 4;
    }

    _01_MyClass(int i) {
        System.out.println("房子高度为 " + i + " 米");
        height = i;
    }

    void info() {
        System.out.println("房子高度为 " + height + " 米");
    }

    void info(String s) {
        System.out.println(s + ": 房子高度为 " + height + " 米");
    }
}
