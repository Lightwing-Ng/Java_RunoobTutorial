package com.lightwing.ch27_DataStructure;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName PropertyDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:34
 * @Version 1.0
 **/
public class PropertyDemo {
    public static void main(String args[]) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // Show all states and capitals in hashtable.
        states = capitals.keySet(); // get set-view of keys
        for (Object state : states) {
            str = (String) state;
            System.out.println("The capital of " +
                    str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}
