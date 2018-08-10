package com.lightwing.ch36_Examples.p08;

/**
 * @ClassName _14_checkCurrentDirectory
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:28
 * @Version 1.0
 **/
public class _14_checkCurrentDirectory {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);
    }
}
