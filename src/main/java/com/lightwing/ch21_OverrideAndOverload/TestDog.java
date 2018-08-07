package com.lightwing.ch21_OverrideAndOverload;

/**
 * @ClassName TestDog
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:57
 * @Version 1.0
 **/

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        // 应用 super 类的方法
        super.move();
        System.out.println("狗可以跑和走");
    }
}

public class TestDog {
    public static void main(String args[]) {
        // Dog 对象
        Animal b = new Dog();
        //执行 Dog 类的方法
        b.move();
    }
}
