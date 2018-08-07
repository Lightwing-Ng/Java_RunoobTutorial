package com.lightwing.ch29_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:46
 * @Version 1.0
 **/
public class GenericTest_1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);
    }

    private static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}
