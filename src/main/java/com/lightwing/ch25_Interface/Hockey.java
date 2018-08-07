package com.lightwing.ch25_Interface;

/**
 * @ClassName Hockey
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 19:13
 * @Version 1.0
 **/
public interface Hockey extends Sports {
    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}
