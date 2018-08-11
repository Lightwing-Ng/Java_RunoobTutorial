package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName _04_getRemoteFileSize
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:51
 * @Version 1.0
 **/
public class _04_getRemoteFileSize {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("无法获取文件大小。");
        else
            System.out.println("文件大小为：" + size + " bytes");
        conn.getInputStream().close();
    }
}
