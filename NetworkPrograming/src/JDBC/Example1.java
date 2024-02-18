
package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Example1 {
    
    
   static final String DB_URL = "jdbc:derby://localhost:1527/Student";
   static final String USER = "khalid";
   static final String PASS ="123";
   static final String QUERY = "select * From Info";
    
    
    
    public static void main(String[] args) throws SQLException {
        
       // Open a connection
//       Connection con =null; 
//       java.sql.Statement st =null ;
//       ResultSet rs =null ;
       
      try 
          (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
          java.sql.Statement st =   con.createStatement();
          ResultSet rs = st.executeQuery(QUERY);) {
          
         // Extract data from result set
         
         while (rs.next()) {
          //     Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Name: " + rs.getString("Name"));
            System.out.print(", Email: " + rs.getString("Email"));
            
            
             System.out.println("");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    
    }
    
    
    
}
    
    
    
    
    


