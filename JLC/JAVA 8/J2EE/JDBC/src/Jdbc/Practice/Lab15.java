package Jdbc.Practice;

import java.sql.*;

public class Lab15 {

	public static void main(String[] args) {
		Connection con=null;  Statement st=null;  ResultSet rs=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from jlcstudents");
			
			System.out.println("***FORWARD DIRECTION***");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			System.out.println("\n***REVERSE DIRECTION***");
			while(rs.previous()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			System.out.println("\n***1st Record***");
			rs.first();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("\n***Last Record***");
			rs.last();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("\n***4th Record***");
			rs.absolute(4);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("\n***From 4th next 2nd Record***");
			rs.relative(2);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs, st, con);
		}
	}

}
