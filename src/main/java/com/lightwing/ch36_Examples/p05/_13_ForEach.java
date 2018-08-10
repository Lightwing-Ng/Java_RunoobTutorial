package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _13_ForEach
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:23
 * @Version 1.0
 **/
public class _13_ForEach {
    public static void main(String[] args) {
        int[] intAry = {
                1, 2, 3, 4
        };
        forDisplay(intAry);
        foreachDisplay(intAry);
    }

    private static void forDisplay(int[] a) {
        System.out.println("使用 for 循环数组");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void foreachDisplay(int[] data) {
        System.out.println("使用 foreach 循环数组");
        for (int a : data) {
            System.out.print(a + " ");
        }
    }
}
