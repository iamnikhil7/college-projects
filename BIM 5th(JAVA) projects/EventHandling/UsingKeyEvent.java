package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsingKeyEvent extends KeyAdapter {
    JTextField t1, t2;
    JFrame f1;
    JLabel l1, l2;
    UsingKeyEvent() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        l1 = new JLabel("Name");
        t1=new JTextField(15);
        l2 = new JLabel("Contact");
        t2 = new JTextField(15);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        UsingKeyEvent ob = new UsingKeyEvent();
    }
    public void keyTyped(KeyEvent e){
        char ch=e.getKeyChar();
   
      if(e.getSource()==t1){
          if(!(ch>='a'&& ch<='z' || ch>='A' && ch<='Z' || ch==' ')){
              e.consume();
          }
      }  else {
          String count=t2.getText();
     if(!(ch>='0' && ch<='9')||count.length()>=10){
            e.consume();
          
     }
      }
    }

}
