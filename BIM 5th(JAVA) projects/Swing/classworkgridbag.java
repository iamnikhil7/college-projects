
package Swing;

import javax.swing.*;
import java.awt.*;

public class classworkgridbag {

    JFrame f1;
    JLabel l1, l2, l3, l4, l5;
    JTextField j1, j2, j3, j4;
    JButton b1, b2;
    JPanel p1;

    classworkgridbag() {
        f1 = new JFrame();
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gL = new GridBagLayout();
        f1.setLayout(gL);
        GridBagConstraints gbc = new GridBagConstraints();

        l1 = new JLabel("Student Registration Form");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gL.setConstraints(l1, gbc);
        f1.add(l1);

        l2 = new JLabel("first name");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gL.setConstraints(l2, gbc);
        f1.add(l2);

        j1 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gL.setConstraints(j1, gbc);
        f1.add(j1);

        l3 = new JLabel("last name");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gL.setConstraints(l3, gbc);
        f1.add(l3);

        j2 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gL.setConstraints(j2, gbc);
        f1.add(j2);

        l4 = new JLabel("address");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gL.setConstraints(l4, gbc);
        f1.add(l4);

        j3 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gL.setConstraints(j3, gbc);
        f1.add(j3);

        l5 = new JLabel("contact");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gL.setConstraints(l5, gbc);
        f1.add(l5);

        j4 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gL.setConstraints(j4, gbc);
        f1.add(j4);

        b1 = new JButton("save");
        b2 = new JButton("reset");

        p1 = new JPanel();
        p1.add(b1);
        p1.add(b2);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gL.setConstraints(p1, gbc);
        f1.add(p1);

        f1.setVisible(true);
    }

    public static void main(String[] args) {
        classworkgridbag ob = new classworkgridbag();
    }
}

