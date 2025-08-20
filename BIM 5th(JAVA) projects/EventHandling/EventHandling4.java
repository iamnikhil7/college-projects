/* Create a swing GUI with 3 buttons (red,green,blue) when the buttons are clicked background color of frame
should be changed
 */
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling4 implements ActionListener {

    JFrame f1;
    JButton b1, b2, b3;
    JTextField t1;

    EventHandling4() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        t1 = new JTextField(10);
        b1 = new JButton("red");
        f1.add(b1);
        b2 = new JButton("green");
        f1.add(b2);
        b3 = new JButton("blue");
        f1.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {

        EventHandling4 ob = new EventHandling4();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            f1.getContentPane().setBackground(Color.red);
        } else if (e.getSource() == b2) {

            f1.getContentPane().setBackground(Color.green);
        } else {
            f1.getContentPane().setBackground(Color.blue);
        }
    }
}
