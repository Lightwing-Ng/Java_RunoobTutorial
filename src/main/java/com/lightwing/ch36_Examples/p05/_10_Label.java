package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _10_Label
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 16:11
 * @Version 1.0
 **/
public class _10_Label {
    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testLabel:
        for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0)
                if (strSearch.charAt(j++) != substring.charAt(k++))
                    continue testLabel;

            found = true;
            break testLabel;
        }
        if (found)
            System.out.println("发现子字符串。");
        else
            System.out.println("字符串中没有发现子字符串。");
    }
}
