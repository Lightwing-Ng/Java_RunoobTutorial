package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _01_DimondShape
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:38
 * @Version 1.0
 **/
public class _01_DimondShape {
    public static void main(String[] args) {
        // 输出 8 行的菱形
        print(10);
    }

    public static void print(int size) {
        if (size % 2 == 0) {
            // 计算菱形大小
            size++;
        }

        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--)
                // 输出左上角位置的空白
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                // 输出菱形上半部边缘
                System.out.print("*");
            // 换行
            System.out.println();
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++)
                // 输出菱形左下角空白
                System.out.print(" ");

            for (int j = 0; j < 2 * size - 1 - 2 * i; j++)
                // 输出菱形下半部边缘
                System.out.print("*");
            System.out.println(); // 换行
        }
    }
}
