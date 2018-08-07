package com.lightwing.ch06_Operator;

/**
 * @ClassName selfAddMinus
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:37
 * @Version 1.0
 **/
public class selfAddMinus_1 {
    public static void main(String[] args) {
        // 定义一个变量
        int a = 3;
        // 自增运算
        int b = ++a;
        int c = 3;
        // 自减运算
        int d = --c;
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);
    }
}
