package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _09_continue
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:07
 * @Version 1.0
 **/
public class _09_continue {
    public static void main(String[] args) {
        StringBuffer searchStr = new StringBuffer("hello how are you.");
        int length = searchStr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchStr.charAt(i) != 'h')
                continue;
            count++;
            searchStr.setCharAt(i, 'h');
        }
        System.out.println(
                "发现 " +
                        count +
                        " 个 h 字符"
        );
        System.out.println(searchStr);
    }
}
