package com.lightwing.ch20_Inherit;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 16:24
 * @Version 1.0
 **/
public class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}

