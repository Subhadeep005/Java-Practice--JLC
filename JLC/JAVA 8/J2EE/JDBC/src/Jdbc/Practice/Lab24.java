package Jdbc.Practice;

import java.io.*;
import java.sql.*;

public class Lab24 {

	public static void main(String[] args) {
		String fileName="hello.jpg";
		Connection con=null;  PreparedStatement ps=null;  FileOutputStream fos=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			String sql="select name, data from datatable where name=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, fileName);
			ResultSet resultset=ps.executeQuery();
			while(resultset.next()){
				File image=new File("G:\\" +fileName);
				fos=new FileOutputStream(image);
				byte[] buffer=new byte[1];
				InputStream is=resultset.getBinaryStream(2);
				while(is.read(buffer)>0){
					fos.write(buffer);
				}
			}
			System.out.println("File Accessed in G:\\"+fileName);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(ps, con);
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
