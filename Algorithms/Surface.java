package cg;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.Applet;

public class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setPaint(new Color(255, 0, 0));
        g2d.fillRect(20, 20, 80, 50);
        g2d.translate(150, 50);
        g2d.fillRect(20, 20, 80, 50);

        g2d.dispose();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

 class TranslateEx extends JFrame {

    public TranslateEx() {
        initUI();
    }

    private void initUI() {
        add(new Surface());
        setTitle("Translation");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        TranslateEx ex = new TranslateEx();
        ex.setVisible(true);
    }
}