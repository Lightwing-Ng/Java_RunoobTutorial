package com.lightwing.ch19_Exception;

/**
 * @ClassName BankDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:21
 * @Version 1.0
 **/
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit();
        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $"
                    + e.getAmount());
            e.printStackTrace();
        }
    }
}
