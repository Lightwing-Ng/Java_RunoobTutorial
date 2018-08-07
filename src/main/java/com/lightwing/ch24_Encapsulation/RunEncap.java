package com.lightwing.ch24_Encapsulation;

/**
 * @ClassName RunEncap
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:57
 * @Version 1.0
 **/
public class RunEncap {
    public static void main(String args[]) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge();
        encap.setIdNum("12343ms");

        System.out.print(
                "Name: " + encap.getName() +
                        " Age: " + encap.getAge()
        );
    }
}
