package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 * @ClassName _10_getURLHeaderDate
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:01
 * @Version 1.0
 **/
public class _09_getURLHeaderDate {
    public static void main(String args[])
            throws Exception {
        URL url = new URL("http://www.runoob.com");
        HttpURLConnection httpCon =
                (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();
        if (date == 0)
            System.out.println("无法获取信息。");
        else
            System.out.println("Date: " + new Date(date));
    }
}
