package com.lightwing.ch15_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexTest_5
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:48
 * @Version 1.0
 **/
public class RegexTest_5 {
    private static String INPUT = "The dog says meow. " +
            "All dogs say meow.";

    public static void main(String[] args) {
        String REGEX = "dog";
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        String REPLACE = "cat";
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
