package com.lightwing.ch36_Examples.p03;

/**
 * @ClassName _09_ArrayExpansion
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:44
 * @Version 1.0
 **/
public class _09_ArrayExpansion {
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended)
            System.out.println(str);
    }
}
