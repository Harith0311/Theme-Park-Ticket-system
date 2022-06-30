import java.sql.*;

public class MySQL{  

    private static Connection con;

    public static Connection configDB() throws SQLException{
        try{  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");   
        }catch(SQLException e){ 
            System.out.println("Connection Failed" + e.getMessage());
        } 
        return con;
    } 
}