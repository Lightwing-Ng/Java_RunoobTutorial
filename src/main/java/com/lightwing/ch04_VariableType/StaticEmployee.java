package com.lightwing.ch04_VariableType;

/**
 * @ClassName StaticEmployee
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:23
 * @Version 1.0
 **/
public class StaticEmployee {
    // DEPARTMENT 是一个常量
    private static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        // salary 是静态的私有变量
        double salary = 10000;
        System.out.println(DEPARTMENT+"平均工资: "+ salary);
    }
}
