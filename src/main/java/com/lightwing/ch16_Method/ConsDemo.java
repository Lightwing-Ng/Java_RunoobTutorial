package com.lightwing.ch16_Method;

/**
 * @ClassName ConsDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:57
 * @Version 1.0
 **/
public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);
    }
}

// 一个简单的构造函数
class MyClass {
    int x;
    // 以下是构造函数
    MyClass(int i) {
        x = i;
    }
}