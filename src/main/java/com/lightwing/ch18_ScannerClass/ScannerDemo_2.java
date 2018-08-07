package com.lightwing.ch18_ScannerClass;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:13
 * @Version 1.0
 **/
public class ScannerDemo_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }
}
