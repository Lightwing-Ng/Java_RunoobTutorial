package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.InetAddress;

/**
 * @ClassName _03_getLocalIP
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:48
 * @Version 1.0
 **/
public class _03_getLocalIP {
    public static void main(String[] args)
            throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: " + addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: " + hostname);
    }
}
