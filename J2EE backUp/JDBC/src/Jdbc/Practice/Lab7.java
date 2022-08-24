package Jdbc.Practice;
import java.sql.*;
public class Lab7 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//con=JDBCUtil.getMySQLConnection();
			con=JDBCUtil.getOracleConnection();
			String qry=null;
			//qry="insert into jlcstudents values(95,'Dande','dande@jlc.com',969696)";
			//qry="select * from jlcstudents";
			qry="update jlcstudents set phone=919191 where sid=101";
			st=con.createStatement();
			boolean b1=st.execute(qry);
			if(b1){
				rs=st.getResultSet();
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
				int x=st.getUpdateCount();
				System.out.println("Result :"+x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JDBCUtil.cleanup(rs, st, con);
		}
	}

}
