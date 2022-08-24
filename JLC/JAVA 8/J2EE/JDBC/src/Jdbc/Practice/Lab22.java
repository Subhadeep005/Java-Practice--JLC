package Jdbc.Practice;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Lab22 {

	public static void main(String[] args) {
		int sid=99;
		int d=25;
		int m=12;
		int y=2015;
		Date dt=new Date(y-1900, m-1,d);
		System.out.println(dt);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			ps=con.prepareStatement("insert into datetest values(?,?)");
			ps.setInt(1, 200);
			ps.setDate(2, dt);
			ps.executeUpdate();
			System.out.println("Inserted");
			JDBCUtil.cleanup(ps, null);
			ps=con.prepareStatement("select * from datetest");
			rs=ps.executeQuery();
			while(rs.next()){
			int id=rs.getInt(1);  Date dop=rs.getDate(2);
			SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy");
			 String d1=f.format(dop);
				System.out.println(id+"\t"+d1);
			}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(rs, ps, con);
	}
	}
}
