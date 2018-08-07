package com.lightwing.ch14_DateTime;

import java.util.Date;

/**
 * @ClassName printfDemo_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:27
 * @Version 1.0
 **/
public class printfDemo_2 {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);
    }
}
