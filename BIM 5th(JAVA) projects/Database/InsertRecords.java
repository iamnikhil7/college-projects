package Database;

import java.sql.*;
public class InsertRecords {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/bim5b";
        String uname="root";
        String pwd="";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,uname,pwd);
           String sql="insert into student values(1,'Ram','BIM')";
           Statement st=con.createStatement();
           if(st.execute(sql)==true){
               ResultSet  rs=st.executeQuery(sql);
               while(rs.next()){
                   System.out.println("id");
                   System.out.println("name");
                   System.out.println("faculty");
               }
           }
           else{ 
               System.out.println("recored inserted");
           }
           st.execute(sql);
           con.close();
            System.out.println("Record saved");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
