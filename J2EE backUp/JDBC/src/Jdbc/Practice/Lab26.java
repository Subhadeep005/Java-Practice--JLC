package Jdbc.Practice;

import java.sql.*;

public class Lab26 {

	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/jlcdb";
		String UNAME="root";
		String PWORD="student";
		try(Connection con= DriverManager.getConnection(URL,UNAME,PWORD); 
				Statement st=con.createStatement(); 
				ResultSet rs=st.executeQuery("select * from jlcstudents");){
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
