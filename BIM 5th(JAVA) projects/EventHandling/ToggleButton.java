/*create a swing GUI with a toggle button.When the toggle button is [pressed display "button is ON"
in a message dialog, when the button is released "button is OFF" in a message dialog.*/
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ToggleButton implements ActionListener {
    
    JFrame f1;
    JList L1;
    JTextField t1;
    JToggleButton b1;
    
    ToggleButton() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        b1 = new JToggleButton("on");
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ToggleButton ob = new ToggleButton();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (b1.isSelected()) {  //if(b1.isSelected==true)
            JOptionPane.showMessageDialog(null, "button is on");
        } else {
            JOptionPane.showMessageDialog(null, "button is off");
        }
        
    }
    
}
