package com.lightwing.ch36_Examples.p07_File;

import java.io.File;
import java.util.Date;

/**
 * @ClassName _04_modifyLastDate
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:54
 * @Version 1.0
 **/
public class _07_modifyLastDate {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("/Users/lightwingng/Desktop/JavaTutorial/src/main/java/com/lightwing/ch36_Examples/p07_File/myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
