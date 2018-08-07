package com.lightwing.ch25_Interface;

/**
 * @ClassName Football
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:13
 * @Version 1.0
 **/
public interface Football extends Sports {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
