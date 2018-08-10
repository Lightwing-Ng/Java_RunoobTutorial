package com.lightwing.ch36_Examples.p03;

import java.util.ArrayList;

/**
 * @ClassName _11_deleteElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:46
 * @Version 1.0
 **/
public class _11_deleteElement {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "第 0 个元素");
        objArray.add(1, "第 1 个元素");
        objArray.add(2, "第 2 个元素");
        System.out.println("数组删除元素前：" + objArray);
        objArray.remove(1);
        objArray.remove("第 0 个元素");
        System.out.println("数组删除元素后：" + objArray);
    }
}
