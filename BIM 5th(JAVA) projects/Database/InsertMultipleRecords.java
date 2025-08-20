package Database;

import java.sql.*;
public class InsertMultipleRecords {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/bim5b";
        String uname="root";
        String pwd="";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,uname,pwd);
           String sql="Insert into student(name,faculty)values('Hari','BBA'),('sita','BIM')";
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
