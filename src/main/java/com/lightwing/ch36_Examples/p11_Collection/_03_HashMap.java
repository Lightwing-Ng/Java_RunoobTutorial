package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Collection;
import java.util.HashMap;

/**
 * @ClassName _03_HashMap
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:14
 * @Version 1.0
 **/
public class _03_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hMap =
                new HashMap<>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection cl = hMap.values();
        for (Object aCl : cl)
            System.out.println(aCl);
    }
}
