package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _03_Triangle
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:42
 * @Version 1.0
 **/
public class _03_Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
