package Jdbc.Practice;

import java.sql.*;

public class Lab13 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			st=con.createStatement();
			String s1="insert into jlcstudents values(99,'Sri','sri@jlc.com',9989876)";
			st.addBatch(s1);
			String s2="insert into jlcstudents values(88,'Nivas','nivas@jlc.com',887659)";
			st.addBatch(s2);
			String s3="insert into jlcstudents values(77,'Dande','dande@jlc.com',776543)";
			st.addBatch(s3);
			String s4="insert into jlcstudents values(66,'Vas','vas@jlc.com',6654321)";
			st.addBatch(s4);
			String s5="update jlcstudents set phone=31903290 where email='vas@gmail.com'";
			st.addBatch(s5);
			String s6="delete from jlcstudents where sid=99";
			st.addBatch(s6);
			int x[]=st.executeBatch();
			for (int i = 0; i < x.length; i++) {
				System.out.println(x[i]);
			}
		}catch(Exception e){
				e.printStackTrace();
		}finally{
				JDBCUtil.cleanup(st, con);
		}
	}
}
