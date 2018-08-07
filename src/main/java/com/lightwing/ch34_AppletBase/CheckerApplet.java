package com.lightwing.ch34_AppletBase;

import java.applet.Applet;
import java.awt.*;

/**
 * @ClassName CheckerApplet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:23
 * @Version 1.0
 **/
public class CheckerApplet extends Applet {
    // public void init() {
    //     String squareSizeParam = getParameter("squareSize");
    //     parseSquareSize(squareSizeParam);
    //     String colorParam = getParameter("color");
    //     Color fg = parseColor(colorParam);
    //     setBackground(Color.black);
    //     setForeground(fg);
    // }
    //
    // private void parseSquareSize(String param) {
    //     if (param == null) return;
    //     try {
    //         // 初始化默认大小
    //         int squareSize = Integer.parseInt(param);
    //     } catch (Exception e) {
    //         // 保留默认值
    //     }
    // }
    //
    // private void parseSquareSize(String param) {
    // }

    private Color parseColor(String param) {
        return null;
    }

    public void paint(Graphics g) {
    }
}
