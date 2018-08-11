package com.lightwing.ch36_Examples.p11_Collection;

/**
 * @ClassName _01_ArrayToCollection
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:07
 * @Version 1.0
 **/
public class _01_ArrayToCollection {
    public static void main(String args[]) {
        // 5 个元素
        int n = 5;
        String[] name = new String[n];
        for (int i = 0; i < n; i++)
            name[i] = String.valueOf(i);

        System.out.println();
        for (String li : name)
            System.out.print(li + " ");
    }
}
