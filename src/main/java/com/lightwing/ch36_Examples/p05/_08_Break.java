package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _08_Break
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:06
 * @Version 1.0
 **/
public class _08_Break {
    public static void main(String[] args) {
        int[] intAry = {
                99, 12, 22, 34, 45, 67, 5678, 8990
        };
        int no = 5678;
        int i = 0;
        boolean found = false;
        for (; i < intAry.length; i++)
            if (intAry[i] == no) {
                found = true;
                break;
            }

        if (found)
            System.out.println(no + " 元素的索引位置在: " + i);
        else
            System.out.println(no + " 元素不在数组总");
    }
}
