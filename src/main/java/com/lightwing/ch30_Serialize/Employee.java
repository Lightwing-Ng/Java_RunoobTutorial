package com.lightwing.ch30_Serialize;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:50
 * @Version 1.0
 **/
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println(
                "Mailing a check to " + name
                + " " + address
        );
    }
}
