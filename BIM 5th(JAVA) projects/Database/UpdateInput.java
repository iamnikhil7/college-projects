//WAP to input id and faculty from user and update the faculty of the student matching given id.
package Database;

import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

public class UpdateInput {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter id and faculty that need to be updated");
        int id = ob.nextInt();
        String faculty = ob.next();
        String url = "jdbc.url//localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String sql = "UPDATE FROM student set faculty=? where id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,faculty);
            st.setInt(2, id);
            st.execute();
            System.out.println("id and faculty updated ");
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
