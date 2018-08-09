package com.lightwing.ch23_AbstractClass;

/**
 * @ClassName AbstractDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:43
 * @Version 1.0
 **/
public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary(
                "Mohd Mohtashim", "Ambehta, UP", 3, 3600.00
        );
        Employee e = new Salary(
                "John Adams", "Boston, MA", 2, 2400.00
        );
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
