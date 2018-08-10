package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _13_Varargs
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:31
 * @Version 1.0
 **/
public class _14_Varargs {
    static int sumVarargs(int... intArrays) {
        int sum = 0, i;
        for (i = 0; i < intArrays.length; i++)
            sum += intArrays[i];

        return (sum);
    }

    public static void main(String args[]) {
        int sum;
        sum = sumVarargs(10, 12, 33);
        System.out.println("数字相加之和为: " + sum);
    }
}
