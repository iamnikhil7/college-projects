package Database;

import java.sql.*;
public class UpdateRecord {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college_db";
        String uname="root";
        String pwd="";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,uname,pwd);
           String sql="update employess set salary=20000 where employee_id=6 "; 
           Statement st=con.createStatement();
           st.execute(sql);
           con.close();
            System.out.println("Record saved");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
