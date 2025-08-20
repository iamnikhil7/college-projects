//wap to execute a stored procedure display_records() to display the student details 
//(id,name,faculty)
package Database;

import java.sql.*;

public class DisplayRecordUsingStoredProcedure {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            CallableStatement cst = con.prepareCall("{call display_records()}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("faculty"));
            }
            con.close();
            System.out.println("Record saved");

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}
