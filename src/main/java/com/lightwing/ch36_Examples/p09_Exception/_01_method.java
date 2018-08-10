package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _01_method
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:31
 * @Version 1.0
 **/
public class _01_method {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
