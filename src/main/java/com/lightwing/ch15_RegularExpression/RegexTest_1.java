package com.lightwing.ch15_RegularExpression;

import java.util.regex.Pattern;

/**
 * @ClassName RegexTest_1
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:39
 * @Version 1.0
 **/
public class RegexTest_1 {
    public static void main(String args[]) {
        String content = "The musical duo invokes disco funk sounds of the 70s, creating powerful" +
                " tunes that feature lush vocals paired with piano and guitar. Expect unique " +
                "takes on classic hits, such as Prince's 'Kiss,' as well as original compositions" +
                " on the group's 'Lust Calling' tour. " + "In the article posted on its official WeChat platform, the police department released its latest results on the crackdown of gropers in the city’s subway.";

        String pattern = ".*est.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'est' 子字符串? " + isMatch);
    }
}
