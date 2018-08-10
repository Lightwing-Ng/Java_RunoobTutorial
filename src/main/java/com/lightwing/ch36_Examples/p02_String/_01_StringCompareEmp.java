package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName StringCompareEmp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 13:41
 * @Version 1.0
 **/
public class _01_StringCompareEmp {
    public static void main(String args[]) {
        String str_1 = "Hello World";
        String str_2 = "hello world";

        System.out.println(str_1.compareTo(str_2));
        System.out.println(str_1.compareToIgnoreCase(str_2));  //忽略大小写
        System.out.println(str_1.compareTo(((Object) str_1).toString()));
    }
}
