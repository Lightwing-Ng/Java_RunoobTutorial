package com.lightwing.ch17_StreamFileIO;

import java.io.File;

/**
 * @ClassName CreateDir
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:08
 * @Version 1.0
 **/
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}
