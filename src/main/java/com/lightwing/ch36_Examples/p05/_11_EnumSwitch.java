package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _11_EnumSwitch
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:13
 * @Version 1.0
 **/
enum Car {
    Lamborghini, Phaeton, Audi, Fiat, Honda
}

public class _11_EnumSwitch {
    public static void main(String args[]) {
        Car c;
        c = Car.Phaeton;
        switch (c) {
            case Lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case Phaeton:
                System.out.println("你选择了顶配辉腾!");
                break;
            case Audi:
                System.out.println("你选择了 Audi!");
                break;
            case Fiat:
                System.out.println("你选择了 Fiat!");
                break;
            case Honda:
                System.out.println("你选择了 Honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }
    }
}
