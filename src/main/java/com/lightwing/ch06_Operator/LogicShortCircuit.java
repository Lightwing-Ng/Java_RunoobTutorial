package com.lightwing.ch06_Operator;

/**
 * @ClassName LogicShortCircuit
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:46
 * @Version 1.0
 **/
public class LogicShortCircuit {
    public static void main(String[] args) {
        // 定义一个变量；
        int a = 5;
        boolean b = (a < 4) && (a++ < 10);
        System.out.println("使用短路逻辑运算符的结果为" + b);
        System.out.println("a的结果为" + a);
    }
}
