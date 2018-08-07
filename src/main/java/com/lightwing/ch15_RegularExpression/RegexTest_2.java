package com.lightwing.ch15_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexTest_2
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:45
 * @Version 1.0
 **/
public class RegexTest_2 {
    public static void main(String args[]) {
        // 按指定模式在字符串查找
        String line = "The musical duo invokes disco funk sounds of the 70s, creating powerful" +
                " tunes that feature lush vocals paired with piano and guitar. Expect unique " +
                "takes on classic hits, such as Prince's 'Kiss,' as well as original compositions" +
                " on the group's 'Lust Calling' tour. " + "In the article posted on its official WeChat platform, the police department released its latest results on the crackdown of gropers in the city’s subway.";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
