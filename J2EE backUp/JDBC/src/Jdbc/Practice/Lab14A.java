package Jdbc.Practice;

import java.sql.*;
import java.util.Scanner;

public class Lab14A {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		Statement st=null;
		ResultSet rs=null;
		int count=0,count1=0;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			String sql="insert into jlcstudents (sid,sname,email,phone) values (?,?,?,?)";
			ps=con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			char choice='Y';
			String s="SELECT * FROM jlcstudents;";
			st=con.createStatement();
			rs=st.executeQuery(s);
			while(rs.next()){
				count1++;
			}
			System.out.println(count1);
			int idarr[]=new int[count1];
			do{
				System.out.println("Enter Name");
				String nm=sc.nextLine();
				System.out.println("Enter Email:");
				String em=sc.nextLine();
				//sc.nextLine();
				System.out.println("Enter ID");
				int id=sc.nextInt();
					idarr[count]=id;
				System.out.println("Enter Phone :");
				long ph=sc.nextLong();
				sc.nextLine();
				ps.setInt(1, id);
				ps.setString(2, nm);
				ps.setString(3, em);
				ps.setLong(4, ph);
				ps.addBatch();
				count++;
				System.out.println("Do you want to add more(Y/N):");
				//sc.nextLine();
				choice=sc.nextLine().charAt(0);
			}while(choice=='Y' || choice=='y');
			
				int res[]=ps.executeBatch();
				for (int i = 0; i < res.length; i++) {
				System.out.println(res[i]);
				}
				for (int i = 0; i < idarr.length; i++) {
					int id=idarr[i];
				String sql1="select * from jlcstudents where sid=?";
				ps=con.prepareStatement(sql1);
				ps.setInt(1, id);
				rs=ps.executeQuery();
				while(rs.next()){
					int id1=rs.getInt(1);
					String nm=rs.getString(2);
					String em=rs.getString(3);
					long ph=rs.getLong(4);
					System.out.println(id1+"\t"+nm+"\t"+em+"\t"+ph);
				}
				}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs,ps, con);
		}
	}

}
