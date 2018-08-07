package com.lightwing.ch25_Interface;

/**
 * @ClassName MammalInt
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:03
 * @Version 1.0
 **/
public class MammalInt extends Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
