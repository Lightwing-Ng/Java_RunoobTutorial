package com.lightwing.ch16_Method;

/**
 * @ClassName CommandLine
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:55
 * @Version 1.0
 **/
public class CommandLine {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
