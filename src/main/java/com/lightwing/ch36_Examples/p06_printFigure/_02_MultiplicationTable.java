package com.lightwing.ch36_Examples.p06_printFigure;

/**
 * @ClassName _02_MultiplicationTable
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:41
 * @Version 1.0
 **/
public class _02_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "×" + i + "=" + i * j + "\t");
            System.out.println();
        }
    }
}
