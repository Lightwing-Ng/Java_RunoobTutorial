package com.lightwing.ch30_Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName DeserializeDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:54
 * @Version 1.0
 **/
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e;
        try {
            FileInputStream fileIn = new FileInputStream(
                    "com.lightwing.ch30_Serialize/employee.ser"
            );
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialize Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
