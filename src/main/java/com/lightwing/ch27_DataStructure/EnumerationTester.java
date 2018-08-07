package com.lightwing.ch27_DataStructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName Enumeration
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:29
 * @Version 1.0
 **/
public class EnumerationTester {
    public static void main(String args[]) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
