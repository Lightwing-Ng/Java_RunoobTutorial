package com.lightwing.ch36_Examples.p02_String;

import java.util.Locale;

public class _13_StringFormat {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        // 指定本地为中国（CHINA）
        System.out.format(
                Locale.CHINA,
                "%-10.4f%n%n",
                e
        );
    }
}