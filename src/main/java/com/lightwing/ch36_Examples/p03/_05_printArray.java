package com.lightwing.ch36_Examples.p03;

/**
 * @ClassName _05_printArray
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:36
 * @Version 1.0
 **/
public class _05_printArray {
    public static void main(String[] args) {
        String[] runoobs = new String[3];
        runoobs[0] = "菜鸟教程";
        runoobs[1] = "菜鸟工具";
        runoobs[2] = "菜鸟笔记";

        for (String x : runoobs)
            System.out.println(x);
    }
}
