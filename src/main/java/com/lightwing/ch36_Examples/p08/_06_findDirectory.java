package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _06_findDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:13
 * @Version 1.0
 **/
public class _06_findDirectory {
    public static void main(String[] argv) throws Exception {
        File dir = new File("../java");
        String[] children = dir.list();
        if (children == null)
            System.out.println("该目录不存在");
        else
            for (String filename : children)
                System.out.println(filename);
    }
}
