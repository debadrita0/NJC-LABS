import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlcondelete {

	public static void main(String[] args) {
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","12345");
			//here employee is the database name, root is the username and 12345 is the password

			java.sql.Statement stmt=con.createStatement();
			final String QUERY = "SELECT employee_name, dept_name, dept_id FROM employee";

			String sql = "DELETE FROM employee " +
	            "WHERE dept_id = 28";
	         stmt.executeUpdate(sql);
	         ResultSet rs = stmt.executeQuery(QUERY);
	         while(rs.next()){
	            //Display values
	            System.out.print("NAME: " + rs.getString("employee_name"));
	            System.out.print(", DEPARTMENT: " + rs.getString("dept_name"));
	            System.out.print(", ID: " + rs.getInt("dept_id"));
	            
	         }
	         rs.close();
	

	}catch(Exception e){ 
		System.out.println(e);}
	}
	}

