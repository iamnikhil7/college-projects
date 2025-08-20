package Swing;

import javax.swing.*;
import java.awt.*;

public class WithOutUsingLayout {

    JFrame f1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    JComboBox cb;

    WithOutUsingLayout() {
        f1 = new JFrame();
        f1.setSize(500, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        String f[] = {"bim", "bca", "bsw"};
        cb = new JComboBox(f);

        l1 = new JLabel("Name");
        l2 = new JLabel("Address");
        l3 = new JLabel("faculty");
        t1 = new JTextField();
        t2 = new JTextField();

        b2 = new JButton("cancel");
        l1.setBounds(10, 10, 50, 25);
        f1.add(l1);
        l2.setBounds(10, 40, 50, 25);
        f1.add(l2);
        l3.setBounds(10, 70, 50, 25);
        f1.add(l3);
        t1.setBounds(70, 10, 150, 25);
        f1.add(t1);
        t2.setBounds(70, 40, 150, 25);
        f1.add(t2);
        cb.setBounds(70, 70, 150, 25);
        f1.add(cb);
        b1.setBounds(70, 100, 60, 25);
        f1.add(b1);
        b2.setBounds(140, 100, 80, 25);
        f1.add(b2);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        WithOutUsingLayout ob = new WithOutUsingLayout();
    }
}
