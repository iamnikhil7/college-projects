/*wap to handle MouseEvent ovveride all methods of MouseListener */
package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsingMouseListener extends MouseAdapter{
    JFrame f1;
    JLabel l1;
    JTextField t1;
    UsingMouseListener(){
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        t1=new JTextField(15);
        l1 = new JLabel("status");
        f1.add(l1);
        f1.add(t1);
        f1.addMouseListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        UsingMouseListener ob=new UsingMouseListener();
    }
    public void mouseEntered(MouseEvent e){
        f1.getContentPane().setBackground(Color.blue);
    }
    public void mouseExited(MouseEvent e){
        f1.getContentPane().setBackground(Color.yellow);
    }
    public void mousePressed(MouseEvent e){
        l1.setText("mouse pressed"+e.getX()+ ","+e.getY());
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("mouse released");
    }
    public void mouseClicked(MouseEvent e){
        l1.setText("mouse clicked");
    }
}
