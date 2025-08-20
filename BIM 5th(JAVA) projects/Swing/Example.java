package Swing;

import javax.swing.*;
import java.awt.*;

public class Example {

    JFrame f1;
    JPanel p1;  
    JButton b1, b2, b3, b4, b5;

    Example() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout(15,15));
       // f1.setLayout(new BorderLayout());
        b1 = new JButton("one");
        b2 = new JButton("two");
        b3 = new JButton("three");
        b4 = new JButton("four");
        b5 = new JButton("five");
        p1=new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        f1.add(p1,BorderLayout.SOUTH);
        f1.add(b5,BorderLayout.CENTER);
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        Example ob = new Example();
    }
}

