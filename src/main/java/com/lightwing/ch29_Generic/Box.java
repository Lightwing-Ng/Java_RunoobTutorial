package com.lightwing.ch29_Generic;

/**
 * @ClassName Box
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:45
 * @Version 1.0
 **/
public class Box<T> {
    private T t;

    private void add(T t) {
        this.t = t;
    }

    private T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        stringBox.add("菜鸟教程");

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
