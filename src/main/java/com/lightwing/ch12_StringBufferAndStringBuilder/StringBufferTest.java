package com.lightwing.ch12_StringBufferAndStringBuilder;

/**
 * @ClassName StringBufferTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:16
 * @Version 1.0
 **/
public class StringBufferTest {
    public static void main(String args[]) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
