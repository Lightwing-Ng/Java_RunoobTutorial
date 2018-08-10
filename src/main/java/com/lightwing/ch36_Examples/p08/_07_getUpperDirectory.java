package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName _07_getUpperDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:15
 * @Version 1.0
 **/
public class _07_getUpperDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/lightwingng/Desktop/JavaTutorial/src/main/java/com/lightwing/ch36_Examples/p08/_07_getUpperDirectory.java");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为 : " + strParentDirectory);
    }
}
