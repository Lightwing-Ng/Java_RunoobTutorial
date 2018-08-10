package com.lightwing.ch36_Examples.p07_File;

import java.io.*;

/**
 * @ClassName _05_appendData
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:54
 * @Version 1.0
 **/
public class _05_appendData {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename", true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}
