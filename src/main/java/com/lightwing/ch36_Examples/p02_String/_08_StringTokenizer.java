package com.lightwing.ch36_Examples.p02_String;

import java.util.StringTokenizer;

/**
 * @ClassName _08_StringTokenizer
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:10
 * @Version 1.0
 **/
public class _08_StringTokenizer {
    public static void main(String[] args) {
        String str = "This is String, split by StringTokenizer, created by Lightwing";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements())
            System.out.println(st.nextElement());

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements())
            System.out.println(st2.nextElement());
    }
}
