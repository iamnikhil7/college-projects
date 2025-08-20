//wap to execute a stored procedure insert_records() that takes 2parameters name faculty
package Database;

import java.sql.*;

public class InsertRecordUsingStoredProcedure {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bim5b";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            CallableStatement cst = con.prepareCall("{call insert_records(?,?)}");
            cst.setString(1, "Anish");
            cst.setString(2, "BIM");
            cst.execute();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
