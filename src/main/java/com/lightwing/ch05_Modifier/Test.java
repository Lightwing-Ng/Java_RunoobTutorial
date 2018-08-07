package com.lightwing.ch05_Modifier;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:30
 * @Version 1.0
 **/
public class Test {
    private int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue() {
        value = 12; // 将输出一个错误
    }
}
