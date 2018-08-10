package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _04_isDirectoryHidder
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:06
 * @Version 1.0
 **/
public class _04_isDirectoryHidder {
    public static void main(String[] args) {
        File file = new File("C:/Demo.txt");
        System.out.println(file.isHidden());
    }
}
