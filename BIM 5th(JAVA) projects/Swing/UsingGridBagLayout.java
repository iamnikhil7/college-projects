package Swing;
import javax.swing.*;
import java.awt.*;
public class UsingGridBagLayout {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
     UsingGridBagLayout(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout());
        GridBagLayout gL=new GridBagLayout();
        f1.setLayout(gL);
        GridBagConstraints gbc=new GridBagConstraints();
        b1=new JButton("1");
        gbc.gridx=0;
        gbc.gridy=0;
        gL.setConstraints(b1,gbc);
        f1.add(b1);
        b2=new JButton("2");
        gbc.gridx=1;
        gbc.gridy=0;
        gL.setConstraints(b2,gbc);
        f1.add(b2);
        b3=new JButton("3");
        gbc.gridx=2;
        gbc.gridy=0;
        gL.setConstraints(b3,gbc);
        f1.add(b3);
        b5=new JButton("5");
        gbc.gridx=2;
        gbc.gridy=1;
        gL.setConstraints(b5,gbc);
        f1.add(b5);
        b6=new JButton("6");
        gbc.gridx=2;
        gbc.gridy=2;
        gL.setConstraints(b6,gbc);
        f1.add(b6);
        b7=new JButton("7");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=3;
        gbc.fill=GridBagConstraints.HORIZONTAL;        
        gL.setConstraints(b7,gbc);
        f1.add(b7);
        b4=new JButton("4");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2;
        gbc.gridheight=2;
        gbc.fill=GridBagConstraints.BOTH;
        gL.setConstraints(b4,gbc);
        f1.add(b4);
        f1.setVisible(true);
        
        
    }

    public static void main(String[] args) {
        UsingGridBagLayout ob=new UsingGridBagLayout();
        
    }
}