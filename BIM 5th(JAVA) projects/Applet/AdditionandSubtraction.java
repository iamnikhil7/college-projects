//Create an applet with 3textfields and two buttons "add","subtract"Perform addition &
//subtraction when the buttons are clicked
package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AdditionandSubtraction  extends Applet implements ActionListener{
    TextField t1,t2,t3;
    Button b1,b2;
    public void init(){
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1=new Button("add");
        b2=new Button("subtract");
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
       int a=Integer.parseInt(t1.getText());
       int b=Integer.parseInt(t2.getText());
       int c=0;
       if(e.getSource()==b1){
           c=a+b;
       } else{
           c=a-b;
       }
        t3.setText(c+"");
    }
}