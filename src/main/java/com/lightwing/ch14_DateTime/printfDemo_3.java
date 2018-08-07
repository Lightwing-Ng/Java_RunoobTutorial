package com.lightwing.ch14_DateTime;

import java.util.Date;

/**
 * @ClassName printDemo_3
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:28
 * @Version 1.0
 **/
public class printfDemo_3 {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // 显示格式化时间
        System.out.printf("%s %tB %<te, %<tY",
                "Due date:", date);
    }
}
