package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _06_SearchStringEmp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:06
 * @Version 1.0
 **/
public class _06_SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Google PornHub Facebook";
        int intIndex = strOrig.indexOf("PornHub");
        if (intIndex == -1)
            System.out.println("没有找到字符串 PornHub");
        else
            System.out.println("PornHub 字符串位置 " + intIndex);

    }
}
