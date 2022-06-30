import java.sql.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		new TicketGenerator();
		// Create a database
		try{
			// Open a connection
			Connection conn = (Connection)MySQL.configDB();
			// Creating statement object
			Statement stmt = conn.createStatement();
			// Create database themepark if it does not exists
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS themepark");
			// Create table ticketinfo if it does not exists
			stmt.executeUpdate("USE themepark");
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticketinfo (" 
            + "ID int(11) NOT NULL AUTO_INCREMENT,"
			+ "Name varchar(255) NOT NULL,"
			+ "Category varchar(255) NOT NULL,"
			+ "`No. of adult` int(25) NOT NULL,"
			+ "`No. of children` int(25) NOT NULL, "
			+ "`Total Price` varchar(244) NOT NULL, "
			+ " PRIMARY KEY(ID))");
			// Close statement and connection
			stmt.close();
			conn.close();
		}catch (SQLException e){
			// Print connection failed and show the details of error
			System.out.println("Connection Failed " + e.getMessage());
		}
	}
}