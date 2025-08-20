/*6.Create a swing GUI with a textfield and a button.When the button
is clicked,value of text field should be checked and display odd/even in a message dialog(pop up window).*/
package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventHandling6 implements ActionListener{
    
    JFrame f1;
    JButton b1;
       JTextField t1; 
    EventHandling6(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
        t1 = new JTextField(15);
        f1.add(t1);
        b1=new JButton("value");
        f1.add(b1);
         
        b1.addActionListener(this);
         
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        EventHandling6 ob=new EventHandling6();   
    }
     public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        if(a%2==0){
            JOptionPane.showMessageDialog(null,"Even");
        }else{
            JOptionPane.showMessageDialog(null,"Odd");
        }
             }
     }

