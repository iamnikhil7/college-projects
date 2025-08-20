 /*create a swing gui with a text field and a button when the button is clicked "hello" 
should be displayed int the text field */
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling1 implements ActionListener {

    JFrame f1;
    JButton b1;
    JTextField t1;

    EventHandling1() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));

        t1 = new JTextField(15);
        f1.add(t1);
        b1 = new JButton("ok");
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {

        EventHandling1 ob = new EventHandling1();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        t1.setText("hello");
    }
    }
    
}
