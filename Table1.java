import java.sql.*;

public class Table1 {
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
					System.out.println("Creating table...");
					statement = con.createStatement();
					
					String sql = "create table user " +

						"(roll_number integer not null, " +
						
						" first_name varchar(50), " +
						
						" last_name varchar(50), " +
						
						" age integer, " +
						
						" primary key ( roll_number ))";
					
					int i = statement.executeUpdate(sql);
					
					System.out.println("Table created,"+"Value of i="+i);
					
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
