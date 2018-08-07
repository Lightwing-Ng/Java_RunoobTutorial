package com.lightwing.ch06_Operator;

/**
 * @ClassName BitTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:41
 * @Version 1.0
 **/
public class BitTest {
    public static void main(String[] args) {
        // 60 = 0011 1100
        int a = 60;
        // 13 = 0000 1101
        int b = 13;
        int c;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }
}
