package Jdbc.Practice;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Lab21 {

	public static void main(String[] args) {
		int sid=99;
		int d=25;
		int m=12;
		int y=2015;
		Date dt=new Date(y-1900, m-1, d);
		System.out.println(dt);
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getOracleConnection();
			//con=JDBCUtil.getMySQLConnection();
			DatabaseMetaData md=con.getMetaData();
			String db=md.getDatabaseProductName();
			String dop="";
			System.out.println(db);
			if(db.equals("Oracle")){
				SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy");
				dop=f.format(dt);
			}else if(db.equals("MySQL")){
					SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
					dop=f.format(dt);
			}
			st=con.createStatement();
			String sql=String.format("insert into datetest values(%d,'%s')",sid,dop);
			st.executeUpdate(sql);
			System.out.println("Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st, con);
		}
	}

}
