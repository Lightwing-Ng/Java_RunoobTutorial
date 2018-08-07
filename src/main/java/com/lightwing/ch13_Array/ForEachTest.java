package com.lightwing.ch13_Array;

/**
 * @ClassName ForEachTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:20
 * @Version 1.0
 **/
public class ForEachTest {
    public static void main(String[] args) {
        double[] myList = {
                1.9, 2.9, 3.4, 3.5
        };

        // 打印所有数组元素
        for (double element : myList)
            System.out.println(element);
    }
}
