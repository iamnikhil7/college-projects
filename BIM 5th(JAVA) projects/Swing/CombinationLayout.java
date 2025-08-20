package Swing;

import javax.swing.*;
import java.awt.*;

public class CombinationLayout {

    JFrame f1;
    JButton b1, b2, b3, b4, b5, b6;
    JPanel p1, p2;

    CombinationLayout() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f1.setLayout(new FlowLayout());
//        f1.setLayout(new FlowLayout(FlowLayout.LEFT));
        f1.setLayout(new BorderLayout());
        b1 = new JButton("save");
        b2 = new JButton("First");
        b3 = new JButton("Next");
        b4 = new JButton("Previous");
        b5 = new JButton("Last");
        b6 = new JButton("Reset");
        p1 = new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        f1.add(p1, BorderLayout.SOUTH);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        CombinationLayout ob = new CombinationLayout();
    }

}
