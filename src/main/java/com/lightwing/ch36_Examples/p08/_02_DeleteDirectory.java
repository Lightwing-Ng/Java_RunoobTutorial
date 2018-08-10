package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _02_DeleteDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:00
 * @Version 1.0
 **/
public class _02_DeleteDirectory {
    public static void main(String[] argv) throws Exception {
        // 删除当前目录下的 test 目录
        deleteDir(new File("./test"));
    }
    private static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            assert children != null;
            for (String aChildren : children) {
                boolean success = deleteDir
                        (new File(dir, aChildren));
                if (!success)
                    return false;
            }
        }
        if(dir.delete()) {
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目录删除失败！");
            return false;
        }
    }
}
