//create a swing GUI with a listbox and a textfield.When item in the listbox is/are selected,
//display it/them in the text field.
package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class UsingListBox implements ListSelectionListener {

    JFrame f1;
    JList L1;
    JTextField t1;

    UsingListBox() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        String items[] = {"Coke", "Fanta", "Sprite", "coffee", "tea", "Hot Lemon", "Dew"};
        L1 = new JList(items);
        JScrollPane jp = new JScrollPane(L1);
        f1.add(jp);
        L1.setVisibleRowCount(5);
        L1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        t1 = new JTextField(20);
        f1.add(t1);
        L1.addListSelectionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        UsingListBox ob = new UsingListBox();

    }

    public void valueChanged(ListSelectionEvent e) {
        String value = L1.getSelectedValuesList() + "";
        t1.setText(value);
    }
   
}
