package Jdbc.Practice;

import java.sql.*;

public class Lab9 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			//con=JDBCUtil.getMySQLConnection();
			con=JDBCUtil.getOracleConnection();
			int sid=95;
			String qry="select * from jlcstudents where sid=?";
			ps=con.prepareStatement(qry);
			ps.setInt(1,sid);
			rs=ps.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String nm=rs.getString(2);
				String em= rs.getString(3);
				Long ph=rs.getLong(4);
				System.out.println(id+"\t"+nm+"\t"+em+"\t"+ph);
			} else System.out.println("Sorry, Student not found");
	} catch(Exception e){
		e.printStackTrace();
	} finally {
		JDBCUtil.cleanup(rs,ps, con);
	}
	}

}
