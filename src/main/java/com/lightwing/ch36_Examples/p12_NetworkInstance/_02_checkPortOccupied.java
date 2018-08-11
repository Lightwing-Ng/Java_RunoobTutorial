package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ClassName _02_checkPortOccupied
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:46
 * @Version 1.0
 **/
public class _02_checkPortOccupied {
    public static void main(String[] args) {
        Socket socket;
        String host = "localhost";
        if (args.length > 0)
            host = args[0];

        for (int i = 0; i < 1024; i++)
            try {
                System.out.println("查看 " + i);
                socket = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            } catch (UnknownHostException e) {
                System.out.println("Exception occurred" + e);
                break;
            } catch (IOException ignored) {
            }
    }
}
