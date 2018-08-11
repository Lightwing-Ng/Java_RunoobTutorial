package com.lightwing.ch36_Examples.p11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName _05_ShuffleCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:17
 * @Version 1.0
 **/
public class _05_ShuffleCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        System.out.println("打乱前:");
        System.out.println(list);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱：");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}
