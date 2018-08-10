package com.lightwing.ch36_Examples.p07_File;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName _14_createFile
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:59
 * @Version 1.0
 **/
public class _14_createFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:/myfile.txt");
            if (file.createNewFile())
                System.out.println("文件创建成功！");
            else
                System.out.println("出错了，该文件已经存在。");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
