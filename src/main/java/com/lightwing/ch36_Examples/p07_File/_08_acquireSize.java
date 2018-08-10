package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _07_acquireSize
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:55
 * @Version 1.0
 **/
public class _08_acquireSize {
    private static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        long size = getFileSize("/Users/lightwingng/Desktop/JavaTutorial/src/main/java/com/lightwing/ch36_Examples/p07_File/java.txt");
        System.out.println("java.txt文件大小为: " + size);
    }
}
