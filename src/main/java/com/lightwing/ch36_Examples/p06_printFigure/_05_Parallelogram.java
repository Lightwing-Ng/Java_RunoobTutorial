package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _05_Parallelogram
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:44
 * @Version 1.0
 **/
public class _05_Parallelogram {
    public static void main(String[] args) {
        // 外层循环 每次打出一个 *
        for (int i = 1; i <= 5; i++) {
            // 填充空格
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");

            // 内层循环 每次打印一个 *
            for (int k = 1; k <= 5; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
