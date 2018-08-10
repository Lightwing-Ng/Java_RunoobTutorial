package com.lightwing.ch36_Examples.p08;

import java.io.File;
import java.io.FileFilter;

/**
 * @ClassName _10_traversalDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:20
 * @Version 1.0
 **/
public class _10_traversalDirectory {
    public static void main(String[] args) {
        File dir = new File("com.lightwing.ch36_Examples.p08._10_traversalDirectory");
        File[] files;
        FileFilter fileFilter = File::isDirectory;
        files = dir.listFiles(fileFilter);
        assert files != null;
        System.out.println(files.length);
        if (files.length == 0)
            System.out.println("目录不存在或它不是一个目录");
        else
            for (File filename : files)
                System.out.println(filename.toString());
    }
}
