//Wap to input id,name,faculty of a student and insert into a table.
package Database;

import java.sql.*;
import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter id,name,faculty:");
        int id = ob.nextInt();
        String name = ob.next();
        String faculty = ob.next();
        String url = "jdbc.url//localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String sql = "insert into student(id,name,faculty)values(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, faculty);
            st.execute();
            System.out.println("recored saved");

            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
