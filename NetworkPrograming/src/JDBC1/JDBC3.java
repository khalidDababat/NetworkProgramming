package JDBC1;

import static JDBC1.JDBC2.DB_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC3 {

    static final String DB_URL = "jdbc:derby://localhost:1527/Emp";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "inser into Employees values (?,?,?,?)";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {

            PreparedStatement p = conn.prepareStatement(QUERY);

            p.setInt(1, 19);
            p.setString(2, "khalid");
            p.setString(3, "Abu mazen");
            p.setString(4, "eeee");

            int row = p.executeUpdate();

            System.out.println(row + " records inserted");

        } catch (Exception e) {

        }

    }

}
