package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName _01_getHostIP
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:44
 * @Version 1.0
 **/
public class _01_getHostIP {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.google.cn");
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
