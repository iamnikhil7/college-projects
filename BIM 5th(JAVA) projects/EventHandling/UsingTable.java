/* making a table*/
package EventHandling;
import java.awt.*;
import javax.swing.*;

public class UsingTable {

    JFrame f1;
    JTable t1;

    UsingTable() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        Object data[][] = {{1, "ram", 200}, {2, "hari", 3000}};
        String cols[] = {"Sno", "name", "salary"};
        t1 = new JTable(data, cols);
        JScrollPane jp = new JScrollPane(t1);
        f1.add(jp);
        t1.setEnabled(false);
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        UsingTable ob = new UsingTable();
    }
}
