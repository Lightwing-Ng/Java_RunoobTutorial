package com.lightwing.ch02_ObjectClass;

/**
 * @ClassName EmployeeTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:08
 * @Version 1.0
 **/

public class EmployeeTest {
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("Lightwing Ng");
        Employee empTwo = new Employee("Jason Wong");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("Advanced Programmer");
        empOne.empSalary(19000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Starter Programmer");
        empTwo.empSalary(2500);
        empTwo.printEmployee();
    }
}
