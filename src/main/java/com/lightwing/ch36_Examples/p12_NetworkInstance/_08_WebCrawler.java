package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @ClassName _08_WebCrawler
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:59
 * @Version 1.0
 **/
public class _08_WebCrawler {
    public static void main(String[] args)
            throws Exception {
        URL url = new URL("http://www.runoob.com");
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("data.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
