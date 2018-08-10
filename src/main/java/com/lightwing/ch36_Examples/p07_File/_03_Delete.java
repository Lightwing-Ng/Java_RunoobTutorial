package com.lightwing.ch36_Examples.p07_File;

import java.io.File;

/**
 * @ClassName _04_Delete
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:53
 * @Version 1.0
 **/
public class _03_Delete {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/lightwingng/Desktop/JavaTutorial/src/main/java/com" +
                    "/lightwing/ch36_Examples/p07_File/test.txt");
            if (file.delete()) {
                System.out.println(file.getName() + " 文件已被删除！");
            } else {
                System.out.println("文件删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
