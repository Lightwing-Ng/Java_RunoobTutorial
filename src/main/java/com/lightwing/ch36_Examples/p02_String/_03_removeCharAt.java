package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _03_removeCharAt
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:02
 * @Version 1.0
 **/
public class _03_removeCharAt {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
