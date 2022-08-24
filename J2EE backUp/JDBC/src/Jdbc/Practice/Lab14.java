package Jdbc.Practice;

import java.sql.*;
import java.util.Scanner;

public class Lab14 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			String sql="insert into jlcstudents (sid,sname) values (?,?)";
			ps=con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			char choice='Y';
			do{
				System.out.println("Enter Name");
				String nm=sc.nextLine();
				System.out.println("Enter ID");
				int id=sc.nextInt();
				sc.nextLine();
				ps.setInt(1, id);
				ps.setString(2, nm);
				ps.addBatch();
				System.out.println("Do you want to add more(Y/N):");
				//sc.nextLine();
				choice=sc.nextLine().charAt(0);
			}while(choice=='Y' || choice=='y');
			int res[]=ps.executeBatch();
			for (int i = 0; i < res.length; i++) {
			System.out.println("Res :"+res[i]);
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				JDBCUtil.cleanup(ps, con);
			}
	}

}
