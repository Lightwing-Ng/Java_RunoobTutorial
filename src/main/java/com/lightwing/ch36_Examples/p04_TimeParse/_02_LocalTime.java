package com.lightwing.ch36_Examples.p04_TimeParse;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName _02_LocalTime
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:40
 * @Version 1.0
 **/
public class _02_LocalTime {
    public static void main(String[] args) {
        // 格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat();
        // a为am/pm的标记
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        // 获取当前时间
        Date date = new Date();
        // 输出已经格式化的现在时间（24小时制）
        System.out.println("现在时间：" + sdf.format(date));
    }
}
