import java.sql.*;
public class Proj1 {
	
		//JDBC Driver name and databse URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/yeager123";
		
		//1. Database username and password
		static final String USER = "student";
		static final String PWD = "Student123";
		
		public static void main(String [] args) {
			Connection con = null;
			Statement statement = null;
			try {
				//2. Register JDBC Driver.
				Class.forName(JDBC_DRIVER);
				
				//3. Open a connection
				System.out.println("Connecting to database...");
				con = DriverManager.getConnection(DB_URL, USER, PWD);
				
				//4. Execute a query
				System.out.println("Creating database...");
				statement = con.createStatement();
				
				String sql = "create database yeager123";
				boolean result = statement.execute(sql);
				System.out.println(result);
				System.out.println("Database created succesfully...");
				
				}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if (statement!=null)
						statement.close();
					if (con!=null)
						con.close();
						
				}
				catch (SQLException e){
					
				}
			}
		}
}
