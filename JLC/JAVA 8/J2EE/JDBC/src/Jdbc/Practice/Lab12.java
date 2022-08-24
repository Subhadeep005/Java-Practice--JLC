package Jdbc.Practice;

import java.sql.*;

public class Lab12 {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		try{
			int sid=98;
			con=JDBCUtil.getOracleConnection();
			//con=JDBCUtil.getMySQLConnection();
			cs=con.prepareCall("call UpdateStudentData(?,?,?,?)");
			
			//IN Parameter
			cs.setInt(1, sid);
			
			//OUT Parameter
			cs.registerOutParameter(2, Types.INTEGER);//(2,4)
			cs.registerOutParameter(3, Types.FLOAT);//(3,8)
			cs.registerOutParameter(4, Types.CHAR);//(4,4)
			cs.execute();
			System.out.println("Procedure Executed Successfully");
			
			//Accessing the value of OUT Parameter.
			int total=cs.getInt(2);
			float avg=cs.getFloat(3);
			String grade=cs.getString(4);
			System.out.println("Total :"+total);
			System.out.println("Average :"+avg);
			System.out.println("Grade :"+grade);
			
		}catch(SQLException e){
			System.out.println("Procedure Not Execute");
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(cs, con);
		}
	}

}
