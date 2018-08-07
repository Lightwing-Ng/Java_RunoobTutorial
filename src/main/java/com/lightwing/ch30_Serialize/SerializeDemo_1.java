package com.lightwing.ch30_Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ClassName SerializeDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:50
 * @Version 1.0
 **/
public class SerializeDemo_1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("com.lightwing.ch30_Serialize");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in com.lightwing.ch30_Serialize");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
