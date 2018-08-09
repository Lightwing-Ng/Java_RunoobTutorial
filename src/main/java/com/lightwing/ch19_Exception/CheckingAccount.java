package com.lightwing.ch19_Exception;

/**
 * @ClassName CheckingAccount
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:20
 * @Version 1.0
 **/
public class CheckingAccount {
    // balance为余额，number为卡号
    private double balance;
    private int number;

    CheckingAccount(int number) {
        this.number = number;
    }

    // 方法：存钱
    void deposit() {
        balance += 500.0;
    }

    // 方法：取钱
    void withdraw(double amount) throws
            InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    // 方法：返回余额
    public double getBalance() {
        return balance;
    }

    // 方法：返回卡号
    public int getNumber() {
        return number;
    }
}
