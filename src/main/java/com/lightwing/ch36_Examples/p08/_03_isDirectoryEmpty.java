package com.lightwing.ch36_Examples.p08;

import java.io.File;
import java.util.Objects;

/**
 * @ClassName _03_isDirectoryEmpty
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:02
 * @Version 1.0
 **/
public class _03_isDirectoryEmpty {
    public static void main(String[] args) {
        File file = new File("./testdir");
        // 当前目录下的 testdir目录
        if (file.isDirectory())
            if (Objects.requireNonNull(file.list()).length > 0)
                System.out.println("目录不为空!");
            else
                System.out.println("目录为空!");
        else
            System.out.println("这不是一个目录!");
    }
}
