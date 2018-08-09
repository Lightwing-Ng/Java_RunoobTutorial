package com.lightwing.ch19_Exception;

/**
 * @ClassName InsufficientFundsException
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:19
 * @Version 1.0
 **/
public class InsufficientFundsException extends Exception {
    // 此处的 amount 用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }
}
