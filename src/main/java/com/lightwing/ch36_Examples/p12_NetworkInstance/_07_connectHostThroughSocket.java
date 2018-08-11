package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName _07_connectHostThroughSocket
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:57
 * @Version 1.0
 **/
public class _07_connectHostThroughSocket {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
