package com.lightwing.ch22_Polymorphism;

/**
 * @ClassName Salary
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:36
 * @Version 1.0
 **/
public class Salary extends Employee {
    // 全年工资
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Salary 类的 mailCheck 方法 ");
        System.out.println(
                "邮寄支票给: " + getName()
                + " ，工资为: " + String.format("%,.2f", salary)
        );
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double newSalary) {
        if (newSalary >= 0.0)
            salary = newSalary;
    }

    public double computePay() {
        System.out.println("计算工资，付给: " + getName());
        return salary / 52;
    }
}
