package com.lightwing.ch36_Examples.p11_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName _12_LoopMove
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:31
 * @Version 1.0
 **/
public class _12_LoopMove {
    public static void main(String[] args) {
        List list = Arrays.asList(
                "one Two three Four five six".split(" ")
        );
        System.out.println("List :" + list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);
    }
}
