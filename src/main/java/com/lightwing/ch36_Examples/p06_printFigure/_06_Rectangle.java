package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _06_Rectangle
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:46
 * @Version 1.0
 **/
public class _06_Rectangle {
    public static void main(String[] args) {
        // 外层循环 每次输出一行 *
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            // 内层循环 每次输出一个 *
            for (int j = 1; j <= 5; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
