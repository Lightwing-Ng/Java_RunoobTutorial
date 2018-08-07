package com.lightwing.ch08_BranchStructure;

/**
 * @ClassName SwitchTest
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:06
 * @Version 1.0
 **/
public class SwitchTest {
    public static void main(String args[]) {
        // char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
