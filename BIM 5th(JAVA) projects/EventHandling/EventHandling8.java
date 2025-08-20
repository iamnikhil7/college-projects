//create a swing gui with a textfield and a combo box.when
//the item in the combo box is selected,it should be displayed in the
//textfield
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling8 implements ItemListener {

    JFrame f1;
    JTextField t1;
    JComboBox cb;

    EventHandling8() {
        f1 = new JFrame();
        f1.setSize(500, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        t1 = new JTextField(15);
        String item[] = {"coke", "fanta", "sprite", "dew"};
        cb = new JComboBox(item);
        f1.add(t1);
        f1.add(cb);
        cb.addItemListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        EventHandling8 ob = new EventHandling8();
    }

    public void itemStateChanged(ItemEvent e) {
        t1.setText(cb.getSelectedIndex() + "");
    }
}
