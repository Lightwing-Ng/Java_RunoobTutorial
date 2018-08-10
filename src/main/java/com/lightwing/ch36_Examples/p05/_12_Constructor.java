package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _12_Constructor
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:18
 * @Version 1.0
 **/

enum Auto {
    Lamborghini(9888888), Phaeton(1758888), Audi(500000), Fiat(150000), Honda(120000);
    private int price;

    Auto(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class _12_Constructor {
    public static void main(String args[]) {
        System.out.println("所有汽车的价格：");
        for (Auto c : Auto.values())
            System.out.println(
                    c + " 需要 HK$" +
                            String.format("%,d", c.getPrice())
            );
    }
}
