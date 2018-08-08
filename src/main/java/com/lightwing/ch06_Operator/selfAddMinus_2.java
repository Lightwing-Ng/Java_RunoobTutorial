package com.lightwing.ch06_Operator;

/**
 * @ClassName selfAddMinus_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:39
 * @Version 1.0
 **/
public class selfAddMinus_2 {
    public static void main(String[] args) {
        // 定义一个变量；
        int a = 5;
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后 a = " + a + ", x = " + x);
        System.out.println("自增运算符后缀运算后 b = " + b + ", y = " + y);
    }
}
