//Wap to input id from user and delete the records matching that id from a table.
package Database;

import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

public class DeleteInput {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter id that need to be deleted");
        int id = ob.nextInt();
        String url = "jdbc.url//localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String sql = "DELETE FROM student where id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            System.out.println("recored deleted");

            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
