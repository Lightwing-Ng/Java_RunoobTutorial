package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName _05_MultiThreadServer
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:53
 * @Version 1.0
 **/
public class _05_MultiThreadServer implements Runnable {
    Socket csocket;

    _05_MultiThreadServer(Socket csocket) {
        this.csocket = csocket;
    }

    public static void main(String args[])
            throws Exception {
        ServerSocket ssock = new ServerSocket(1234);
        System.out.println("Listening");
        while (true) {
            Socket sock = ssock.accept();
            System.out.println("Connected");
            new Thread(new _05_MultiThreadServer(sock)).start();
        }
    }

    public void run() {
        try {
            PrintStream pstream = new PrintStream
                    (csocket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                pstream.println(
                        i +
                        " bottles of beer on the wall"
                );
            }
            pstream.close();
            csocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
