package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _15_OverloadingVarargs
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:34
 * @Version 1.0
 **/
public class _15_OverloadingVarargs {
    static void vaTest(int... no) {
        System.out.print(
                "vaTest(int ...): "
                        + "参数个数: " + no.length + " 内容: "
        );
        for (int n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    static void vaTest(boolean... bl) {
        System.out.print(
                "vaTest(boolean ...) " +
                        "参数个数: " + bl.length + " 内容: "
        );
        for (boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... no) {
        System.out.print(
                "vaTest(String, int ...): " +
                        msg + "参数个数: " + no.length + " 内容: "
        );
        for (int n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("测试: ", 10, 20);
        vaTest(true, false, false);
    }
}
