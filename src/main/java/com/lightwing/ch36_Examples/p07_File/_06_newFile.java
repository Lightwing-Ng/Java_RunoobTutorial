package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _06_newFile
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:54
 * @Version 1.0
 **/
public class _06_newFile {
    public static void main(String[] args) {
        File f;
        try {
            // 创建临时文件
            f = File.createTempFile("tmp", ".txt", new File("C:/"));

            // 输出绝对路径
            System.out.println("File path: " + f.getAbsolutePath());

            // 终止后删除临时文件
            f.deleteOnExit();

            // 创建临时文件
            f = File.createTempFile("tmp", null, new File("D:/"));

            // 输出绝对路径
            System.out.print("File path: " + f.getAbsolutePath());

            // 终止后删除临时文件
            f.deleteOnExit();

        } catch (Exception e) {
            // 如果有错误输出内容
            e.printStackTrace();
        }
    }
}
