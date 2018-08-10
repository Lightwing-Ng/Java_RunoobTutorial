package com.lightwing.ch36_Examples.p04_TimeParse;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleDateFormat
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:40
 * @Version 1.0
 **/
public class _01_SimpleDateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
