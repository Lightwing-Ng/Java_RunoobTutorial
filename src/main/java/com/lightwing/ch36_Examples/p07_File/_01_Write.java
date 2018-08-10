package com.lightwing.ch36_Examples.p07_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName _01_Write
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:49
 * @Version 1.0
 **/
public class _01_Write {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException ignored) {
        }
    }
}
