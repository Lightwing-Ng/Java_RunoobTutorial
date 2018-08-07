package com.lightwing.ch34_AppletBase;

import java.applet.Applet;
import java.awt.*;

/**
 * @ClassName HelloWorldApplet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:22
 * @Version 1.0
 **/
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 25, 50);
    }
}
