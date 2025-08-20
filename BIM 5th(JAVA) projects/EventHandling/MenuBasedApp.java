package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBasedApp implements ActionListener {

    JFrame f1;
    JMenuBar mbar;
    JMenu file, New, edit;
    JMenuItem frame, exit;

    MenuBasedApp() {
        f1 = new JFrame();
        f1.setLayout(new FlowLayout());
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mbar = new JMenuBar();
        file = new JMenu("file");
        New = new JMenu("new");
        edit = new JMenu("edit");
        frame = new JMenuItem("frame");
        exit=new JMenuItem("exit",new ImageIcon(getClass().getResource("images/pivot.jpg"))); //image insert after exit
        exit = new JMenuItem("exit");

        file.add(New);
        file.add(exit);
        New.add(frame);
        mbar.add(file);
        mbar.add(edit);
        f1.add(mbar);
        f1.setJMenuBar(mbar);
        frame.addActionListener(this);
        exit.addActionListener(this);
        // to open file menu using ALT+f
        file.setMnemonic('F');
        //to set CTRL_E shortcut command for exit
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));
                exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK)); //ctrl shortcut
//ctrl shortcut
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        MenuBasedApp ob = new MenuBasedApp();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame) {
            new SimpleInterest();
        } else if (e.getSource() == exit) {
            System.exit(0); //terminates the application
        }
    }
}
