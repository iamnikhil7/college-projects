package Database;

import java.sql.*;

public class DisplayRecord {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String sql = "select *from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("faculty"));
            }
            st.execute(sql);
            con.close();
            System.out.println("Record saved");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
