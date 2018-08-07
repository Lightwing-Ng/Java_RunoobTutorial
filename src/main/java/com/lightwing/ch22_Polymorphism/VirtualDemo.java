package com.lightwing.ch22_Polymorphism;

/**
 * @ClassName VirtualDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:38
 * @Version 1.0
 **/
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}
