package com.lightwing.ch20_Inherit;

/**
 * @ClassName TestSuperSub
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:29
 * @Version 1.0
 **/
class SuperClass {
    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super(300);
        System.out.println("SubClass");
    }

    SubClass(int n) {
        System.out.println("SubClass(int n):" + n);
    }
}

public class TestSuperSub {
    public static void main(String args[]) {
        SubClass sc = new SubClass();
        SubClass sc2 = new SubClass(200);
    }
}
