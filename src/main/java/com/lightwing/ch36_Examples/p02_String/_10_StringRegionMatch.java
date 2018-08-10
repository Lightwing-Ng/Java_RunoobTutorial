package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _10_StringRegionMatch
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:13
 * @Version 1.0
 **/
public class _10_StringRegionMatch {
    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.
                regionMatches(
                        11,
                        second_str,
                        12,
                        9
                );
        boolean match2 = first_str.
                regionMatches(
                        true,
                        11,
                        second_str,
                        12,
                        9
                ); //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}
