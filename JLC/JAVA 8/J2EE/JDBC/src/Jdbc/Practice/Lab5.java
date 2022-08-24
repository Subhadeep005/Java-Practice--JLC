package Jdbc.Practice;

import java.sql.*;

public class Lab5 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			//con=JDBCUtil.getMySQLConnection();
			con=JDBCUtil.getOracleConnection();
			int sid=97;
			String nm="Manish";
			String em="manish@jlc.com"; 
			long phn=979797l;
			String qry=String.format("insert into jlcstudents values(%d,'%s','%s',%d)", sid,nm,em,phn);
			//String qry1="delete from jlcstudents where sid=99";
			System.out.println(qry);
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			//int y=st.executeUpdate(qry1);
			if(x==1 /*&& y==1*/) System.out.println("Operation Successfully");
			else System.out.println("No Record Found");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st, con);
		}
	}
}
