package cg;

import java.io.*;
import java.awt.*;
import java.applet.*;
import java.util.*; 

import java.applet.Applet;

public class MidPoint extends Applet {

    public void paint(Graphics g) {
        int r = 150;
        int d = (5 / 4) - r;
        int x = 0;
        int y = r;
        g.drawString("MidPoint Circle", 200, 200);
        do {
            g.setColor(Color.red);
            g.drawLine(y + 200, x + 200, y + 200, x + 200);
            g.setColor(Color.blue);
            g.drawLine(x + 200, y + 200, x + 200, y + 200);
            g.setColor(Color.black);
            g.drawLine(x + 200, -y + 200, x + 200, -y + 200);

            g.setColor(Color.cyan);
            g.drawLine(y + 200, -x + 200, y + 200, -x + 200);
            g.setColor(Color.green);
            g.drawLine(-y + 200, -x + 200, -y + 200, -x + 200);
            g.setColor(Color.pink);
            g.drawLine(-x + 200, -y + 200, -x + 200, -y + 200);
            g.setColor(Color.darkGray);
            g.drawLine(-x + 200, y + 200, -x + 200, y + 200);
            g.setColor(Color.orange);
            g.drawLine(-y + 200, x + 200, -y + 200, x + 200);
            if(d<0)
            
                {
                    d=d+2*x+3;
                
                }
            else{
                d=d+2*(x-y)+5;
                y=y-1;
            }
            x=x+1;
        }
        while(x<y);
        }
        }
    
        
        
            
            
