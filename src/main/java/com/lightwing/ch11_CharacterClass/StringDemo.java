package com.lightwing.ch11_CharacterClass;

/**
 * @ClassName StringDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:13
 * @Version 1.0
 **/
public class StringDemo {
    public static void main(String args[]) {
        char[] helloArray = {
                'r', 'u', 'n', 'o', 'o', 'b'
        };
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}
