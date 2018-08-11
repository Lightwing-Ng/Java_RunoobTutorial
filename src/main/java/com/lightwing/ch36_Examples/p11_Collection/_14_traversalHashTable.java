package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @ClassName _14_traversalHashTable
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:34
 * @Version 1.0
 **/
public class _14_traversalHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
