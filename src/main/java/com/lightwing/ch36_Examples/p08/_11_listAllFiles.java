package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _11_listAllFiles
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:22
 * @Version 1.0
 **/
public class _11_listAllFiles {
    public static void main(String[] args) {
        File dir = new File("com.lightwing.ch36_Examples.p08._11_listAllFiles");
        String[] children = dir.list();
        if (children == null)
            System.out.println("目录不存在或它不是一个目录");
        else
            for (String filename : children)
                System.out.println(filename);
    }
}
