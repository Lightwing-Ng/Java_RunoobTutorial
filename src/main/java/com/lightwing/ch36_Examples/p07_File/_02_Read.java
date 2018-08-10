package com.lightwing.ch36_Examples.p07_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName _02_Read
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:51
 * @Version 1.0
 **/
public class _02_Read {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("test.log"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println((String) null);
        } catch (IOException ignored) {
        }
    }
}
