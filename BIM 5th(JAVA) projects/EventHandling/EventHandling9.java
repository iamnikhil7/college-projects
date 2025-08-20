/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling9 implements FocusListener {

    JTextField t1, t2;
    JFrame f1;

    EventHandling9() {
        f1 = new JFrame();
        f1.setSize(500, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        f1.add(t1);
        f1.add(t2);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        EventHandling9 ob = new EventHandling9();
    }

    public void focusGained(FocusEvent e) {
        if (e.getSource() == t1) {
            t1.setBackground(Color.GRAY);
        } else {
            t2.setBackground(Color.GRAY);

        }
    }

    public void focusLost(FocusEvent e) {
        if (e.getSource() == t1) {
            t1.setBackground(Color.WHITE);
        } else {
            t2.setBackground(Color.WHITE);
        }
    }
}
