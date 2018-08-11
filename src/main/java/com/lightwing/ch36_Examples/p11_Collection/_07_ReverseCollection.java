package com.lightwing.ch36_Examples.p11_Collection;

import java.util.*;

/**
 * @ClassName _07_ReverseCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:21
 * @Version 1.0
 **/
public class _07_ReverseCollection {
    public static void main(String[] args) {
        String[] coins = {"A", "B", "C", "D", "E"};
        List l = new ArrayList(Arrays.asList(coins));
        ListIterator liter = l.listIterator();
        System.out.println("反转前");
        while (liter.hasNext())
            System.out.println(liter.next());
        Collections.reverse(l);
        liter = l.listIterator();
        System.out.println("反转后");
        while (liter.hasNext())
            System.out.println(liter.next());
    }
}
