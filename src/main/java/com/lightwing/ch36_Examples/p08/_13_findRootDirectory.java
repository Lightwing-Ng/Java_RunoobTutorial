package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _13_findRootDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:26
 * @Version 1.0
 **/
public class _13_findRootDirectory {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录：");
        for (File root : roots)
            System.out.println(root.toString());
    }
}
