package Swing;

import javax.swing.*;
import java.awt.*;

public class UsingGridLayout {

    JFrame f1;
    JButton b1, b2, b3, b4, b5;

    UsingGridLayout() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1.setLayout(new GridLayout(2, 2, 2, 2));

        b1 = new JButton("one");  //button haru create gareko//
        b2 = new JButton("two");
        b3 = new JButton("three");
        b4 = new JButton("four");
        b5 = new JButton("five");

        f1.add(b1);  //button create garera add gareko//
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);

        f1.setVisible(true);  //set visible jaela last mah //

    }

    public static void main(String[] args) {
        UsingGridLayout ob = new UsingGridLayout();
    }
}
