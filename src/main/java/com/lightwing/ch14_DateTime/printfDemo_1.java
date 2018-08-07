package com.lightwing.ch14_DateTime;

import java.util.Date;

/**
 * @ClassName printfDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:25
 * @Version 1.0
 **/
public class printfDemo_1 {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // c 的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        // f 的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        // d 的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        // r 的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        // t 的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        // R 的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date);
    }
}
