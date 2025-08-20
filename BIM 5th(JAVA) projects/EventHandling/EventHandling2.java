/*
 create a swing gui with a textfield and two buttons (ok and clear).when "ok" button is clicked, display
"hello" in the text field.when "clear" buton is clicked text field should be cleared
 */
package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling2 implements ActionListener {

    JFrame f1;
    JButton b1,b2;
    JTextField t1;

    EventHandling2() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));

        t1 = new JTextField(30);
        f1.add(t1);
        b1 = new JButton("ok");
        f1.add(b1);
        b2=new JButton("clear");
        f1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {

        EventHandling2 ob = new EventHandling2();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){

        t1.setText("hello ");
    }else{
            t1.setText("");
        }
    }
}

