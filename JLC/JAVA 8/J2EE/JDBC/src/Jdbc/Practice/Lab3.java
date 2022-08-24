package Jdbc.Practice;
import java.sql.*;

public class Lab3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			con=JDBCUtil.getMySQLConnection();
			//con=JDBCUtil.getOracleConnection();
			String sql="insert into jlcstudents values(107,'vas','vas@jlc.com',989898)";
			st=con.createStatement();
			int x=st.executeUpdate(sql);
			if(x==1){
				System.out.println("Record Inserted");
			}else{
				System.out.println("Record not Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st, con);
		}
	}

}
