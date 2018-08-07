package com.lightwing.ch05_Modifier;

/**
 * @ClassName SuperClass
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:32
 * @Version 1.0
 **/
abstract class SuperClass {
    // 抽象方法
    abstract void m();
}

class SubClass extends SuperClass {
    // 实现抽象方法
    void m() {
        System.out.println("SubClass");
    }
}
