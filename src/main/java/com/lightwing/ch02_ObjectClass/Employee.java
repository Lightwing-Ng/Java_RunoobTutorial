package com.lightwing.ch02_ObjectClass;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:07
 * @Version 1.0
 **/

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    // 设置age的值
    void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的值*/
    void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的值*/
    void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* 打印信息 */
    void printEmployee() {
        System.out.println("名字: " + name);
        System.out.println("年龄: " + age);
        System.out.println("职位: " + designation);
        System.out.println("薪水: " + salary);
    }
}