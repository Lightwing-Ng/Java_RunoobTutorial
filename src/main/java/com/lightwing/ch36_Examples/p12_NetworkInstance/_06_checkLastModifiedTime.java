package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName _06_checkLastModifiedTime
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:55
 * @Version 1.0
 **/
public class _06_checkLastModifiedTime {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://127.0.0.1/java.bmp");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("java.bmp 文件最后修改时间 :" + timestamp);
    }
}
