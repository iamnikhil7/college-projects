//7.Create a swing GUI to perform addition /subtraction/multiplication and division.
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class EventHandling7 implements ActionListener {

    JFrame f1;
    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3;

    EventHandling7() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        l1 = new JLabel("Num1");
        l2 = new JLabel("Num2");
        l3 = new JLabel("Result");
        t1 = new JTextField(18);
        t2 = new JTextField(18);
        t3 = new JTextField(18);
        Font f = new Font("algerian", Font.BOLD, 20);
        t1.setFont(f);
        t2.setFont(f);
        t3.setFont(f);
        t3.setEditable(false);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        b1 = new JButton("add");
        f1.add(b1);
        b2 = new JButton("sub");
        f1.add(b2);
        b3 = new JButton("mul");
        f1.add(b3);
        b4 = new JButton("Div");
        f1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        EventHandling7 ob = new EventHandling7();
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a * b;
        } else if (e.getSource() == b4) {
            c = a / b;
        }
        t3.setText(c + "");
    }
}
