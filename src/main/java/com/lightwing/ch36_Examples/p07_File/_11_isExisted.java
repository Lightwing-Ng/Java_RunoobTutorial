package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _10_isExisted
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:56
 * @Version 1.0
 **/
public class _11_isExisted {
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.exists());
    }
}
