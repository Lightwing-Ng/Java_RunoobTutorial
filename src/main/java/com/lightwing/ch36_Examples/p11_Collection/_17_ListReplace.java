package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName _17_ListReplace
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:39
 * @Version 1.0
 **/
public class _17_ListReplace {
    public static void main(String[] args) {
        List list = Arrays.asList(
                "one Two three Four five six one three Four".split(" "));
        System.out.println("List :" + list);
        Collections.replaceAll(list, "one", "hundrea");
        System.out.println("replaceAll: " + list);
    }
}
