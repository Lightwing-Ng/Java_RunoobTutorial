package com.lightwing.ch36_Examples.p05;

/**
 * @ClassName _03_HanoiAlgorithm
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/10, 15:47
 * @Version 1.0
 **/
public class _03_HanoiAlgorithm {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    private static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println(
                    "Disk 1 from "
                            + from + " to " + to
            );
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println(
                    "Disk "
                            + topN + " from " + from + " to " + to
            );
            doTowers(topN - 1, inter, from, to);
        }
    }
}
