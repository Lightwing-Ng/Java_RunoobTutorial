package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _05_StringReverseExample
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:04
 * @Version 1.0
 **/
public class _05_StringReverseExample {
    public static void main(String[] args) {
        String string = "lightwing";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前: " + string);
        System.out.println("字符串反转后: " + reverse);
    }
}
