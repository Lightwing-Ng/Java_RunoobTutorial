package com.lightwing.ch36_Examples.p08;

import java.io.File;

/**
 * @ClassName RecursionCreate
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 20:51
 * @Version 1.0
 **/
public class _01_RecursionCreate {
    public static void main(String[] args) {
        String directories = "com.lightwing.ch36_Examples.p08\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
