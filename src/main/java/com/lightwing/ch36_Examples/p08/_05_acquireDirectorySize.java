package com.lightwing.ch36_Examples.p08;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @ClassName _05_acquireDirectorySize
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:09
 * @Version 1.0
 **/
public class _05_acquireDirectorySize {
    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("C:/test"));
        System.out.println(
                "Size: " + size + " bytes"
        );
    }
}
