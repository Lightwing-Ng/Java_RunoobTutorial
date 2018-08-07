package com.lightwing.ch18_ScannerClass;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:12
 * @Version 1.0
 **/
public class ScannerDemo_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        // next方式接收字符串
        System.out.println("next方式接收: ");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为: " + str1);
        }
        scan.close();
    }
}
