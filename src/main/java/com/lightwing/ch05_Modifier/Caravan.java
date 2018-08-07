package com.lightwing.ch05_Modifier;

/**
 * @ClassName Caravan
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:31
 * @Version 1.0
 **/
abstract class Caravan {
    private double price;
    private String model;
    private String year;

    // 抽象方法
    public abstract void goFast();
    public abstract void changeColor();
}
