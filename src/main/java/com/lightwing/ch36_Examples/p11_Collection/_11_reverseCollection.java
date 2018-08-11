package com.lightwing.ch36_Examples.p11_Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _11_reverseCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:28
 * @Version 1.0
 **/
public class _11_reverseCollection {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        for (String contents : s1) {
            System.out.print(contents);
        }
    }
}
