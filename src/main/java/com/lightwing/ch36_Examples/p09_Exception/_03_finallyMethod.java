package com.lightwing.ch36_Examples.p09_Exception;

/**
 * @ClassName _03_finallyMethod
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 21:34
 * @Version 1.0
 **/
public class _03_finallyMethod {
    public static void main(String[] argv) {
        new _03_finallyMethod().doTheWork();
    }

    private void doTheWork() {
        Object o = null;
        for (int i = 0; i < 5; i++) {
            try {
                o = makeObj(i);
            } catch (IllegalArgumentException e) {
                System.err.println(
                        "Error: (" + e.getMessage() + ")."
                );
                return;
            } finally {
                System.err.println("都已执行完毕");
                if (o == null)
                    System.exit(0);
            }
            System.out.println(o);
        }
    }

    private Object makeObj(int type)
            throws IllegalArgumentException {
        if (type == 1)
            throw new IllegalArgumentException
                    ("不是指定的类型: " + type);
        return new Object();
    }
}
