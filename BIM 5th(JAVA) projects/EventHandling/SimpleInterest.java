package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest extends KeyAdapter implements ActionListener {

    JFrame f1;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1, b2;

    SimpleInterest() {
        f1 = new JFrame();
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        

        l1 = new JLabel("Simple Interest Calculator");
        l1.setBounds(90, 20, 150, 50);
        f1.add(l1);

        l2 = new JLabel("Principle Amount");
        l2.setBounds(20, 60, 120, 50);
        f1.add(l2);

        t1 = new JTextField();
        t1.setBounds(140, 75, 120, 20);
        f1.add(t1);

        l3 = new JLabel("Rate of Interest");
        l3.setBounds(20, 100, 120, 50);
        f1.add(l3);

        t2 = new JTextField();
        t2.setBounds(140, 115, 120, 20);
        f1.add(t2);

        l4 = new JLabel("Time in years");
        l4.setBounds(20, 140, 120, 50);
        f1.add(l4);

        t3 = new JTextField();
        t3.setBounds(140, 155, 120, 20);
        f1.add(t3);

        l5 = new JLabel("Interest Amount");
        l5.setBounds(20, 180, 120, 50);
        f1.add(l5);

        t4 = new JTextField();
        t4.setBounds(140, 195, 120, 20);
        t4.setEditable(false);
        f1.add(t4);

        b1 = new JButton("Calculate");
        b1.setBounds(50, 220, 90, 30);
        f1.add(b1);

        b2 = new JButton("Reset");
        b2.setBounds(150, 220, 90, 30);
        f1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        SimpleInterest ob = new SimpleInterest();

    }

    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();

        if (e.getSource() == t1) {

            if (!(ch >= '0' && ch <= '9')) {
                e.consume();
            }

        } else if (e.getSource() == t2) {

            if (!(ch >= '0' && ch <= '9' || ch == '.')) {
                e.consume();
            }

        } else {
            if (!(ch >= '0' && ch <= '9')) {
                e.consume();
            }

        }
    }

    public void actionPerformed(ActionEvent e) {

        String m = t1.getText().trim();
        String n = t2.getText().trim();
        String o = t3.getText().trim();
        if (m.equals("") || n.equals("") || o.equals("")) {
            JOptionPane.showMessageDialog(null, "please fill the values");
        } else {
            double a = Double.parseDouble(m);
            double b = Double.parseDouble(n);
            double c = Double.parseDouble(o);
        double i = 0;
        if (e.getSource() == b1) {
            i = (a * b * c) / 100;

        } else {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);

        }
        t4.setText(i + " ");

    }

    }
}
