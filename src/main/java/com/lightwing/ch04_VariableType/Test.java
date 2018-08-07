package com.lightwing.ch04_VariableType;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:19
 * @Version 1.0
 **/
public class Test {
    private void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
