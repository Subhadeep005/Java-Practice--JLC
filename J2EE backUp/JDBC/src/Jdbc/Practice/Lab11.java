package Jdbc.Practice;

import java.sql.*;

public class Lab11 {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		try{
			int sid=98;
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			cs=con.prepareCall("call UpdateStudentResult(?)");
			cs.setInt(1, sid);
			cs.execute();
			System.out.println("Procedure executed Successfully");
		}catch(SQLException e){
			System.out.println("Error in Calling Procedure");
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(cs,con);
		}
	}

}
