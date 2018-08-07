package com.lightwing.ch21_OverrideAndOverload;

/**
 * @ClassName Overloading
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 17:05
 * @Version 1.0
 **/
public class Overloading {
    private int test() {
        System.out.println("test1");
        return 1;
    }

    private void test(int a) {
        System.out.println("test2");
    }

    // 以下两个参数类型顺序不同
    private String test(int a, String s) {
        System.out.println("test3");
        return "returntest3";
    }

    private String test(String s, int a) {
        System.out.println("test4");
        return "returntest4";
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));
    }
}
