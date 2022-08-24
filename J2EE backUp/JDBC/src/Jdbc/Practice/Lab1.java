package Jdbc.Practice;

import java.sql.*;

public class Lab1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement  st=null;

		try {
			//Step 1: Load the driver class.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2: Establish the connection.
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","student");
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jlcdb", "root", "student");
			
			//Step 3: Prepare the SQL statement.
			String sql="insert into jlcstudents values(46,'Babai','babai@gmail.com','555555')";
			
			//Step 4: Create the JDBC statement.
			st=con.createStatement();
			
			//Step 5: Submit the SQL statement to Database using JDBC statement.
			int x=st.executeUpdate(sql);
			
			//Step 6: Process the result.
			if(x==1){
				System.out.println("Record Inserted");
			} else{
				System.out.println("Record not Inserted");
			}
		} catch (Exception e) {
			System.out.println("Duplicate Entry");
			e.printStackTrace();
		}finally {
			
			//Step 7: close all the resources.
				try {
					if(st!=null) st.close();
					if(con!=null) con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
	}
}
