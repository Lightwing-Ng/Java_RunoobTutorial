package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName _11_getURLHeaderInformation
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:01
 * @Version 1.0
 **/
public class _10_getURLHeaderInformation {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com");
        URLConnection conn = url.openConnection();

        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for (String key : keys) {
            String val = conn.getHeaderField(key);
            System.out.println(key + "    " + val);
        }
        System.out.println(conn.getLastModified());
    }
}
