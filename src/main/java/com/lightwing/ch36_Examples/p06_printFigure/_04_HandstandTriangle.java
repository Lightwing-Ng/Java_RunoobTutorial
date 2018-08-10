package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _04_HandstandTriangle
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:43
 * @Version 1.0
 **/
public class _04_HandstandTriangle {
    public static void main(String[] args) {
        // 打印倒立的三角形
        for (int m = 1; m <= 4; m++) {
            // 打印空格
            for (int n = 0; n <= m; n++)
                System.out.print(" ");
            // 打印 *
            for (int x = 1; x <= 7 - 2 * (m - 1); x++)
                System.out.print("*");
            System.out.println();
        }
    }
}
