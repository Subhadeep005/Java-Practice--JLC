package Jdbc.Practice;

import java.sql.*;

public class Lab16 {

	public static void main(String[] args) {
		Connection con=null;  Statement st=null;  ResultSet rs=null;
		try{
			con=JDBCUtil.getOracleConnection();
			//con=JDBCUtil.getMySQLConnection();
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//rs=st.executeQuery("select * from jlcstudents"); //For MySQL
			rs=st.executeQuery("select sid, sname, email, phone from jlcstudents"); //For Oracle
			
			System.out.println("***ALL RECORDS***");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			
			System.out.println("\n***INSERTING RECORD***");
			rs.moveToInsertRow();
			rs.updateInt(1, 199);   rs.updateString(2, "DK");   rs.updateString(3, "dk@jlc.com");   rs.updateLong(4, 31903290);
			rs.insertRow();
			System.out.println("Record Inserted");
			
			System.out.println("\n***UPDATEING 2nd RECORD***");
			rs.absolute(2);
			rs.updateString(2, "Manish");   rs.updateString(3, "manish@jlc.com");  rs.updateLong(4, 41275999);
			rs.updateRow();
			System.out.println("Record Updated");
			
			System.out.println("\n***DELETING 3rd RECORD***");
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("Row Deleted");
			
			System.out.println("\n***AFTER UPDATEING ALL THE  RECORDS***");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs, st, con);
		}
	}

}
