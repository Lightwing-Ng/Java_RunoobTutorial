package com.lightwing.ch36_Examples.p07_File;

import java.io.File;
import java.util.Date;

/**
 * @ClassName _13_acquireModifiedTime
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:59
 * @Version 1.0
 **/
public class _13_acquireModifiedTime {
    public static void main(String[] args) {
        File file = new File("_13_acquireModifiedTime.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
