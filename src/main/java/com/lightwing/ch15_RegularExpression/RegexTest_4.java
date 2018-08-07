package com.lightwing.ch15_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexTest_4
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:47
 * @Version 1.0
 **/
public class RegexTest_4 {
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "ooooofoooooooooooo";

    public static void main(String args[]) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
        System.out.println("lookingAt(): " + matcher2.lookingAt());
    }
}
