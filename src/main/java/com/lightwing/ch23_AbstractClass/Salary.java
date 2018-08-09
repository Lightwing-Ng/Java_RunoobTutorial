package com.lightwing.ch23_AbstractClass;

/**
 * @ClassName Salary
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:45
 * @Version 1.0
 **/
public class Salary extends Employee {
    // Annual salary
    private double salary;

    public Salary(String name, String address, int number, double
            salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println(
                "Mailing check to " + getName()
                        + " with salary " + String.format("%,.2f", salary)
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
        System.out.println(
                "Computing salary pay for " + getName()
        );
        return salary / 52;
    }
}
