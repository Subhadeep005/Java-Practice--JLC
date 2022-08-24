package Jdbc.Practice;

import java.sql.*;

public class Lab4 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=JDBCUtil.getMySQLConnection();
			//con=JDBCUtil.getOracleConnection();
			String sql="select * from jlcstudents;";
			st=con.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
			do{
				int sid=rs.getInt(1);
				String sname=rs.getString(2);
				String email=rs.getString(3);
				long ph=rs.getLong(4);
				System.out.println(sid+"\t\t"+sname+"\t\t"+email+"\t\t"+ph);
				//System.out.format("%32d%10s%16s%10d\n",sid,sname,email,ph);
			}while(rs.next());
			}else System.out.println("No Record found");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs,st, con);
		}
	}

}
