/*Write java code to insert  the records from the database table.*/

import java.sql.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","12345");
//here employee is the database name, root is the username and 12345 is the password

java.sql.Statement stmt=con.createStatement();
//Execute a query
System.out.println("Inserting records into the table...");          
String sql = "INSERT INTO employee VALUES ( 'Auli', 'IT', 18)";
stmt.executeUpdate(sql);
sql = "INSERT INTO employee VALUES ( 'Pia', 'CSE', 25)";
stmt.executeUpdate(sql);
sql = "INSERT INTO employee VALUES ( 'Tara', 'MECH', 30)";
stmt.executeUpdate(sql);
sql = "INSERT INTO employee VALUES('Zubair', 'ECE', 28)";
stmt.executeUpdate(sql);
System.out.println("Inserted records into the table...");



}


catch(Exception e){ 
	System.out.println(e);}
}
}
