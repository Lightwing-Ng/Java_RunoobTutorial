package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _15_travesalDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:29
 * @Version 1.0
 **/
public class _15_travesalDirectory {
    public static void main(String[] argv) throws Exception {
        System.out.println("遍历目录");
        // 要遍历的目录
        File dir = new File("/www/java");
        visitAllDirsAndFiles(dir);
    }

    private static void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            assert children != null;
            for (String aChildren : children)
                visitAllDirsAndFiles(new File(dir, aChildren));
        }
    }
}
