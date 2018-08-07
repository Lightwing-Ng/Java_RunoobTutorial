package com.lightwing.ch18_ScannerClass;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo_4
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:15
 * @Version 1.0
 **/
public class ScannerDemo_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m += 1;
            sum += x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}
