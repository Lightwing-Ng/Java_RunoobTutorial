package com.lightwing.ch36_Examples.p02_String;

/**
 * @ClassName _07_JavaStringSplitEmp
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 14:08
 * @Version 1.0
 **/
public class _07_JavaStringSplitEmp {
    public static void main(String args[]) {
        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "-";  // 指定分割字符
        temp = str.split(delimeter); // 分割字符串
        // 普通 for 循环
        for (int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);

        System.out.println("------java for each循环输出的方法-----");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";  // 指定分割字符，.号需要转义
        temp1 = str1.split(delimeter1); // 分割字符串
        for (String x : temp1)
            System.out.println(x);
    }
}
