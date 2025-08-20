/*Wap to display the records of all students from "student" table that contains id,name,faculty.
[assume databse name yourself]*/
package Database;

import java.sql.*;

public class DisplayRecordStudents {

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
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            while (rs.next()) {

                for (int i = 1; i <= count; i++) {
                    System.out.println(rs.getString(i));
                }
            }
            con.close();
            System.out.println("Record saved");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
