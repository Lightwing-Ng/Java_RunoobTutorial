package com.lightwing.ch03_BasicDataType;

/**
 * @ClassName ForcedTypeConversion
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:15
 * @Version 1.0
 **/
public class ForcedTypeConversion {
    public static void main(String[] args) {
        int i1 = 123;
        // 强制类型转换为 byte
        byte b = (byte) i1;
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }
}
