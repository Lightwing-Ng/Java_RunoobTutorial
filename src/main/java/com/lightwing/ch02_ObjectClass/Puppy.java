package com.lightwing.ch02_ObjectClass;

/**
 * @ClassName Puppy
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:03
 * @Version 1.0
 **/

public class Puppy {
    private int puppyAge;

    private Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是: " + name);
    }

    private void setAge() {
        puppyAge = 2;
    }

    private void getAge() {
        System.out.println("小狗的年龄为: " + puppyAge);
    }

    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy");
        // 通过方法来设定age
        myPuppy.setAge();
        // 调用另一个方法获取age
        myPuppy.getAge();
        // 你也可以像下面这样访问成员变量
        System.out.println("变量值: " + myPuppy.puppyAge);
    }
}