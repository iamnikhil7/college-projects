  package Database;

import java.sql.*;
public class DeleteRecord {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/bim5b";
        String uname="root";
        String pwd="";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,uname,pwd);
           String sql="delete from student where id=1"; 
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

