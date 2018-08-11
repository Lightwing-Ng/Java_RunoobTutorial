package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName _02_CollectionComparison
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:10
 * @Version 1.0
 **/
public class _02_CollectionComparison {
    public static void main(String[] args) {
        String[] coins = {
                "Penny", "nickel", "dime", "Quarter", "dollar"
        };
        Set<String> set = new TreeSet<>(Arrays.asList(coins));

        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        System.out.println("-----------\n");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}
