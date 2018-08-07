package com.lightwing.ch14_DateTime;

import java.text.ParseException;
import java.util.Date;

/**
 * @ClassName ParsingStringToTime
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 15:32
 * @Version 1.0
 **/
public class ParsingStringToTime {
    public static void main(String args[]) {
        // SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");

        Date t;

        // try {
            // t = ft.parse(input);
            // System.out.println(t);
        // } catch (ParseException e) {
            // System.out.println("Unparseable using " + ft);
        // }
    }
}
