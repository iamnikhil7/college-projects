/*create a swing form where user can input id,name,faculty.After "submit" button is pressed
save the data to a table.*/
package Database;

import javax.swing.*;
import java.awt.*;

public class InputUser {

    JFrame f1;
    JLabel l1, l2, l3, l4;
    JTextField j1, j2, j3;
    JButton b1;

    InputUser() {
        f1 = new JFrame();
        f1.setSize(500, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());

        l1 = new JLabel("id");
        l2 = new JLabel("name");
        l3 = new JLabel("faculty");
        j1 = new JTextField(20);
        j2 = new JTextField(20);
        j3 = new JTextField(20);
        b1 = new JButton("submit");
        f1.add(l1);
        f1.add(j1);

        f1.add(l2);
        f1.add(j2);
        f1.add(l3);
        f1.add(j3);
        f1.add(b1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        InputUser ob = new InputUser();
    }
}
