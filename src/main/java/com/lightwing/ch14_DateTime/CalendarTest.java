package com.lightwing.ch14_DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName CalendarTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:36
 * @Version 1.0
 **/
public class CalendarTest {
    public static void main(String args[]) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        int year;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gcalendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if (gcalendar.isLeapYear(year))
            System.out.println("当前年份是闰年");
        else
            System.out.println("当前年份不是闰年");
    }
}
