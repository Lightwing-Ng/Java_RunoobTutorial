package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _09_readOnly
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:55
 * @Version 1.0
 **/
public class _10_readOnly {
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
