

package com.mycompany.java_swing_learning;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Point;

public class Java_swing_learning {

    public static void main(String[] args) {
      Frame f = new Frame();
      f.setVisible(true);
      Dimension d = new Dimension(700, 500);
      f.setSize(d);
      Color c = new Color(2, 2, 40);
      f.setBackground(c);
      Point p = new Point(300, 100);
      f.setLocation(p);
      FlowLayout fl = new FlowLayout();
      f.setLayout(fl);
        Button b = new Button("Update");
        f.add(b);
        Button b1 = new Button("Play");
        f.add(b1);
        Button b2 = new Button("Ok");
        f.add(b2);
    }
}
