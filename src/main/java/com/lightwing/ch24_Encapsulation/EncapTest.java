package com.lightwing.ch24_Encapsulation;

/**
 * @ClassName EncapTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 18:55
 * @Version 1.0
 **/
public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    void setAge() {
        age = 20;
    }

    public void setName(String newName) {
        name = newName;
    }

    void setIdNum(String newId) {
        idNum = newId;
    }
}
