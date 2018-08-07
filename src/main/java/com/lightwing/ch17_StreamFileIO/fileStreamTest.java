package com.lightwing.ch17_StreamFileIO;

import java.io.*;

/**
 * @ClassName fileStreamTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:06
 * @Version 1.0
 **/
public class fileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (byte aBWrite : bWrite)
                // writes the bytes
                os.write(aBWrite);

            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++)
                System.out.print((char) is.read() + "  ");

            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
