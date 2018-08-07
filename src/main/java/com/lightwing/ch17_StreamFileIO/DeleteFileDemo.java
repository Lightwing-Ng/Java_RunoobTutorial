package com.lightwing.ch17_StreamFileIO;

import java.io.File;

/**
 * @ClassName DeleteFileDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:10
 * @Version 1.0
 **/
public class DeleteFileDemo {
    public static void main(String args[]) {
        // 这里修改为自己的测试目录
        File folder = new File("/tmp/java/");
        deleteFolder(folder);
    }

    // 删除文件及目录
    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
