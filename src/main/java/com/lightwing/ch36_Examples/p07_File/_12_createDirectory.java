package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _12_createDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:58
 * @Version 1.0
 **/
public class _12_createDirectory {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("C:/");
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
