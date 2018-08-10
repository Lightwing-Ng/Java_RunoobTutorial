package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _15_comparePath
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:59
 * @Version 1.0
 **/
public class _15_comparePath {
    public static void main(String[] args) {
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/java/demo1.txt");
        if (file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
    }
}
