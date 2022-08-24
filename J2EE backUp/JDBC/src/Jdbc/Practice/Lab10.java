package Jdbc.Practice;

import java.sql.*;

public class Lab10 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//con=JDBCUtil.getMySQLConnection();
			con=JDBCUtil.getOracleConnection();
			String qry=null;
			//qry="insert into jlcstudents values(94,'Kumar','kumar@jlc.com',949494)";
			qry="select * from jlcstudents";
			//qry="update jlcstudents set phone=90909090 where sid=101";
			ps=con.prepareStatement(qry);
			boolean b1=ps.execute();
			if(b1){
				rs=ps.getResultSet();
				if(rs.next()){
					do{
						int id=rs.getInt(1);
						String nm=rs.getString(2);
						String em=rs.getString(3);
						long ph=rs.getLong(4);
						System.out.println(id+"\t"+nm+"\t"+em+"\t"+ph);
					}while(rs.next());
				}
			} else{
				int x=ps.getUpdateCount();
				System.out.println("Result :"+x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JDBCUtil.cleanup(rs, ps, con);
		}
	}

}
