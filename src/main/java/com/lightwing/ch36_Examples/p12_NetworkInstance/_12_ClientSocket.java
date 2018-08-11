package com.lightwing.ch36_Examples.p12_NetworkInstance;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ClassName _12_ClientSocket
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 16:08
 * @Version 1.0
 **/
public class _12_ClientSocket {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8888);

            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            // 向服务器端发送一条消息
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");
            bw.flush();

            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器：" + mess);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
