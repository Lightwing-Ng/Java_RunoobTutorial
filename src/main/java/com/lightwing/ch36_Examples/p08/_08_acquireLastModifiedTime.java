package com.lightwing.ch36_Examples.p08;

import java.io.File;
import java.util.Date;

/**
 * @ClassName _08_acquireLastModifiedTime
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:17
 * @Version 1.0
 **/
public class _08_acquireLastModifiedTime {
    public static void main(String[] args) {
        File file = new File("/Users/lightwingng/Desktop/JavaTutorial/src/main/java/com/lightwing/ch36_Examples/p08/_08_acquireLastModifiedTime.java");
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
    }
}
