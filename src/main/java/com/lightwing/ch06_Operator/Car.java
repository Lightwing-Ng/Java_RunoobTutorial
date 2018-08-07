package com.lightwing.ch06_Operator;

/**
 * @ClassName Car
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:51
 * @Version 1.0
 **/
class Vehicle {
}

public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}
