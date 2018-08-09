package com.lightwing.ch17_StreamFileIO;

import java.io.File;

/**
 * @ClassName DirList
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:09
 * @Version 1.0
 **/
public class DirList {
    public static void main(String args[]) {
        String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            assert s != null;
            for (String value : s) {
                File f = new File(dirname + "/" + value);
                if (f.isDirectory())
                    System.out.println(value + " 是一个目录");
                else
                    System.out.println(value + " 是一个文件");
            }
        } else
            System.out.println(dirname + " 不是一个目录");
    }
}
