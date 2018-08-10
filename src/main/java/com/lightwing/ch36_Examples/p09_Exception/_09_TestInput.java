package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _09_TestInput
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:44
 * @Version 1.0
 **/
class WrongInputException extends Exception {  // 自定义的类
    WrongInputException(String s) {
        super(s);
    }
}

class Input {
    void method() throws WrongInputException {
        // 抛出自定义的类
        throw new WrongInputException("Wrong input");
    }
}

public class _09_TestInput {
    public static void main(String[] args) {
        try {
            new Input().method();
        } catch (WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }
}
