package com.lightwing.ch03_BasicDataType;

/**
 * @ClassName AutomaticTypeConversion
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:13
 * @Version 1.0
 **/
public class AutomaticTypeConversion {
    public static void main(String[] args) {
        // char 自动类型转换为 int
        int i1 = 'a';
        System.out.println("char自动类型转换为int后的值等于" + i1);
        // 定义一个 char 类型
        char c2 = 'A';
        // char 类型和 int 类型计算
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}
