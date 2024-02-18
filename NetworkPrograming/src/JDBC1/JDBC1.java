
package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC1 {
    
    

        
        
        static final String DB_URL = "jdbc:derby://localhost:1527/Emp";
	static final String USER =   "root";
	static final String PASS =   "root";
	static final String QUERY = "SELECT id, first_name, last_name, email FROM Employees";

	public static void main(String[] args) {
		// Open a connection
		
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(QUERY);) {
			Employee emp=null; 
			// Extract data from result set
			while (rs.next()) {
				emp = new Employee();
				
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("first_name"));
				emp.setLname(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));  				

			}
			
			System.out.println(emp.toString());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
        }
}
