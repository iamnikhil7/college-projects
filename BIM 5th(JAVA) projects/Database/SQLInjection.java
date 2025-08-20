  package Database;

import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SQLInjection implements ActionListener {

    JFrame f1;
    JLabel l1, l2;
    JButton b1;
    JTextField t1;
    JPasswordField p1;

    SQLInjection() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        l1 = new JLabel("Username");
        f1.add(l1);
        t1 = new JTextField(15);
        f1.add(t1);
        l2 = new JLabel("Password");
        f1.add(l2);
        p1 = new JPasswordField(15);
        f1.add(p1);
        b1 = new JButton("Login");
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        SQLInjection ob = new SQLInjection();
    }

    public void actionPerformed(ActionEvent e) {
        String username = t1.getText();
        String password = new String(p1.getPassword());
        String url = "jdbc:mysql://localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
//           String sql="select *from login where username='"+username+"'and password='"+password+"'"; 
//           Statement st=con.createStatement();
//     ResultSet rs=st.executeQuery(sql);
            String sql = "select * from Login where username=?and password=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Success");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
