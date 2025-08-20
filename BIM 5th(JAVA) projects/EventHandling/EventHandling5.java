/*
 Create a swing GUI with a textField twp buttons(upper and lower).When the buttons are clicked,content of textfield 
should be changed into upper and lower case
 */
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling5 implements ActionListener {

    JFrame f1;
    JButton b1, b2, b3;
    JTextField t1;

    EventHandling5() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        t1 = new JTextField(10);
        f1.add(t1);
        b1 = new JButton("upper");
        f1.add(b1);
        b2 = new JButton("lower");
        f1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {

        EventHandling5 ob = new EventHandling5();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s = t1.getText();
            t1.setText(s.toUpperCase());
        } else {
            String s = t1.getText();
            t1.setText(s.toLowerCase());
        }
    }
}
