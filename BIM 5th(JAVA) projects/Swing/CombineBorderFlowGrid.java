package Swing;
import javax.swing.*;
import java.awt.*;
public class CombineBorderFlowGrid {
JFrame f1;
    JPanel p1,p2;
    JLabel l1,l2,l3,l4;
    JTextField j1,j2,j3,j4;
    JButton b1,b2,b3,b4,b5,b6;
    CombineBorderFlowGrid(){
      f1 = new JFrame();
      f1.setSize(500,300);
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new BorderLayout());

      l1 = new JLabel("First Name");
      l2 = new JLabel("Last Name");
      l3 = new JLabel("Email");
      l4 = new JLabel("Contact");
      j1 = new JTextField();
      j2 = new JTextField();
      j3 = new JTextField();
      j4 = new JTextField();
     
      p1 = new JPanel();
      p1.setLayout(new GridLayout(4,2,5,5));
      p1.add(l1);p1.add(j1);
      p1.add(l2);p1.add(j2);  
      p1.add(l3);p1.add(j3);
      p1.add(l4);p1.add(j4);
      f1.add(p1,BorderLayout.CENTER);
    
      b1 = new JButton("save");
      b2 = new JButton("first");
      b3 = new JButton("next");
      b4 = new JButton("previous");
      b5 = new JButton("last");
      b6 = new JButton("reset");
      p2 = new JPanel();
      p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);  p2.add(b5);  p2.add(b6);
      f1.add(p2,BorderLayout.SOUTH);
     
      f1.setVisible(true);
    }
    public static void main(String[] args) {
        CombineBorderFlowGrid ob= new CombineBorderFlowGrid();
    }
    
}
