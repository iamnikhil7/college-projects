package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsingInnerClass {
    
    JFrame f1;
    JButton b1,b2;
       JTextField t1; 
    UsingInnerClass(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
        t1 = new JTextField(15);
        f1.add(t1);
        b1=new JButton("ok");
        f1.add(b1);
         b2=new JButton("clear");
        f1.add(b2);
        b1.addActionListener(new HandleEvent());
         b2.addActionListener(new HandleEvent());
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        UsingInnerClass ob=new UsingInnerClass();   
    }
    class HandleEvent implements ActionListener{
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==b1){
             t1.setText("Hello");
         }
         else
             t1.setText("");
     }
}
}