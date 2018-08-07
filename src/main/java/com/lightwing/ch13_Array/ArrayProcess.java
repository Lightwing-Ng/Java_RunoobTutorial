package com.lightwing.ch13_Array;

/**
 * @ClassName ArrayProcess
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:18
 * @Version 1.0
 **/
public class ArrayProcess {
    public static void main(String[] args) {
        double[] myList = {
                1.9, 2.9, 3.4, 3.5
        };

        // 打印所有数组元素
        for (double aMyList : myList)
            System.out.println(aMyList + " ");

        // 计算所有元素的总和
        double total = 0;
        for (double aMyList : myList)
            total += aMyList;

        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++)
            if (myList[i] > max) max = myList[i];

        System.out.println("Max is " + max);
    }
}
