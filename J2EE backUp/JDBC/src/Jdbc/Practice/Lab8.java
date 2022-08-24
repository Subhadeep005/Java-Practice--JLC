package Jdbc.Practice;

import java.sql.*;

public class Lab8 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		Statement st=null;
		try{
		//con=JDBCUtil.getMySQLConnection();
		con=JDBCUtil.getOracleConnection();
		int sid =95;
		String nm="Nivas";
		String em="nivas@jlc.com";
		long ph=959595L;
		String qry="insert into jlcstudents values(?,?,?,?)";
		ps=con.prepareStatement(qry);
		ps.setInt(1, sid);
		ps.setString(2, nm);
		ps.setString(3, em);
		ps.setLong(4, ph);
		int x=ps.executeUpdate();
		if(x==1) System.out.println("Record Insereted  Successfully");
		else System.out.println("No Record Found");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(ps, con);
		}
	}

}
