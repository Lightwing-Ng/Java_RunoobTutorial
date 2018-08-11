package com.lightwing.ch36_Examples.p11_Collection;

import java.util.*;

/**
 * @ClassName _09_ReadOnlyCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:24
 * @Version 1.0
 **/
public class _09_ReadOnlyCollection {
    public static void main(String[] argv) {
        List stuff = Arrays.asList("a", "b");
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        } catch (UnsupportedOperationException ignored) {
        }
        System.out.println("集合现在是只读");
    }
}
