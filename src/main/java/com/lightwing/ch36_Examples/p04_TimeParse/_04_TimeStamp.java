package com.lightwing.ch36_Examples.p04_TimeParse;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName _04_TimeStamp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:41
 * @Version 1.0
 **/
public class _04_TimeStamp {
    public static void main(String[] args) {
        // 获取当前时间戳
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 时间戳转换成时间
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd2);
    }
}
