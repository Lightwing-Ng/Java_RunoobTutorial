package com.lightwing.ch36_Examples.p08;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName _11_
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:24
 * @Version 1.0
 **/
public class _12_findFile {
    public static void main(String[] args) {
        File dir = new File("com/lightwing/ch36_Examples/p08");
        FilenameFilter filter = (dir1, name) -> name.startsWith("_");
        String[] children = dir.list(filter);
        if (children == null)
            System.out.println("目录不存在或它不是一个目录");
        else
            for (String filename : children)
                System.out.println(filename);
    }
}
