/*Write java code to insert and retrieve the records from the database table.*/


import java.sql.*;
import java.io.*;

class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","12345");
//here employee is the database name, root is the username and 12345 is the password
Statement stmt=con.createStatement();

ResultSet result=stmt.executeQuery("insert into student(student_id, student_name, student_dept) values('1','rohit','IT')");

while(result.next())
System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3));


            String sql = "select * from student";
           	PreparedStatement p = con.prepareStatement(sql);
            result = p.executeQuery();
  
            // Printing id, name and dept
            
            System.out.println("student_id \t\t student_name \t\t student_dept");
  
            // Condiion check
            while (result.next()) {
  
                int student_id = result.getInt("id");
                String student_name = result.getString("name");
                String dtudent_dept = result.getString("dept");
                System.out.println("student_id \t\t student_name \t\t student_dept");
            }
        

con.close();

}catch(Exception e){ 
	System.out.println(e);
}

}
}