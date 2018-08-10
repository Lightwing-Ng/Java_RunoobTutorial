package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _04_StringReplaceEmp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:03
 * @Version 1.0
 **/
public class _04_StringReplaceEmp {
    public static void main(String args[]) {
        String str = "Hello World";
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));
    }
}
