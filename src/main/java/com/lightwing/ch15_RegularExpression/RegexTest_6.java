package com.lightwing.ch15_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexTest_6
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:49
 * @Version 1.0
 **/
public class RegexTest_6 {
    public static void main(String[] args) {
        String REGEX = "a*b";
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        String INPUT = "aabfooaabfooabfoobkkk";
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String REPLACE = "-";
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
