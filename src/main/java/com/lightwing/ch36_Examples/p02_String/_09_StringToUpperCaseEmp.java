package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _09_StringToUpperCaseEmp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:12
 * @Version 1.0
 **/
public class _09_StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "string Lightwing";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串: " + str);
        System.out.println("转换为大写: " + strUpper);
    }
}
