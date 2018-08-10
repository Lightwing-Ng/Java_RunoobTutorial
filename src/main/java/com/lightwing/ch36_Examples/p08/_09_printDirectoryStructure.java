package com.lightwing.ch36_Examples.p08;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName _09_printDirectoryStructure
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:18
 * @Version 1.0
 **/
public class _09_printDirectoryStructure {
    public static void main(String[] a) {
        showDir(1, new File("d:\\Java"));
    }

    private static void showDir(int indent, File file) {
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File file1 : files)
                showDir(indent + 4, file1);
        }
    }
}
