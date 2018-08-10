package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _02_SearchlastString
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 13:43
 * @Version 1.0
 **/
public class _02_SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world, Hello Lightwing";
        int lastIndex = strOrig.lastIndexOf("Lightwing");
        if (lastIndex == -1)
            System.out.println("没有找到字符串 Lightwing");
        else
            System.out.println("Lightwing 字符串最后出现的位置： " + lastIndex);

    }
}
