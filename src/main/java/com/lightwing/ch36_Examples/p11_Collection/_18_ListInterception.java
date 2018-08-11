package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName _18_ListInterception
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:41
 * @Version 1.0
 **/
public class _18_ListInterception {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List: " + list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表: " + sublist);
        System.out.println("indexOfSubList: "
                + Collections.indexOfSubList(list, sublist));
        System.out.println("lastIndexOfSubList: "
                + Collections.lastIndexOfSubList(list, sublist));
    }
}
