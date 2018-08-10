package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _08_renameFile
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:55
 * @Version 1.0
 **/
public class _09_renameFile {
    public static void main(String[] args) {
        File oldName = new File("C:/program.txt");
        File newName = new File("C:/java.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}
