package com.lightwing.ch36_Examples.p03;

/**
 * @ClassName _03_getArrayLength
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:33
 * @Version 1.0
 **/
public class _03_getArrayLength {
    public static void main(String args[]) {
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);
        System.out.println("第二维数组长度: " + data[0].length);
    }
}
