package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _01_Overload
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:46
 * @Version 1.0
 **/

public class _01_Overload {
    public static void main(String[] args) {
        _01_MyClass t = new _01_MyClass(3);
        t.info();
        t.info("重载方法");
        // 重载构造函数
        new _01_Overload();
    }
}
