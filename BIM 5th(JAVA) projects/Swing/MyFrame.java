
package Swing;

import javax.swing.*;

public class MyFrame {

    JFrame f1;

    MyFrame() {
        f1 = new JFrame("Title");
        //f1.setTitle("title");
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //DISPOSE_ON_CLOSE,HIDE_ON_CLOSE,DO_NOTHING_ON_CLOSE
        f1.setVisible(true);
        f1.setResizable(false);
    }

    public static void main(String[] args) {
        MyFrame ob = new MyFrame();

    }

}
