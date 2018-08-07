package com.lightwing.ch04_VariableType;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:21
 * @Version 1.0
 **/

public class Employee {
    // 这个实例变量对子类可见
    private String name;
    // 私有变量，仅在该类可见
    private double salary;

    // 在构造器中对 name 赋值
    private Employee(String empName) {
        name = empName;
    }

    // 设定 salary 的值
    private void setSalary() {
        salary = (double) 1000;
    }

    // 打印信息
    private void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary();
        empOne.printEmp();
    }
}
