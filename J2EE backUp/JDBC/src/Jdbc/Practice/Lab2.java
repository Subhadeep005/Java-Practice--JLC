package Jdbc.Practice;

import java.sql.*;

public class Lab2 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jlcdb","root","student");
			String sql="select * from jlcstudents";
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				int sid=rs.getInt(1);
				String sname=rs.getString(2);
				String email=rs.getString(3);
				long ph=rs.getLong(4);
				System.out.println(sid+"\t\t"+sname+"\t\t"+email+"\t\t"+ph);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
