package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @ClassName _15_EnumerationHashTable
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:36
 * @Version 1.0
 **/
public class _15_EnumerationHashTable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");
        Enumeration e = hashtable.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
