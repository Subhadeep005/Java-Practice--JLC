package Jdbc.Practice;

import java.io.*;
import java.sql.*;
import java.util.StringTokenizer;

public class Lab23 {

	public static void main(String[] args) {
		String fileName="G:\\program\\bangalore\\core_java\\hello.jpg";
		String absFileName=fileName;
		StringTokenizer tok=new StringTokenizer(fileName,"\\");
		while(tok.hasMoreTokens())
			fileName=tok.nextToken();
		Connection con=null; PreparedStatement ps=null;  FileInputStream fis=null;
		try{
			con=JDBCUtil.getOracleConnection();
			//con=JDBCUtil.getMySQLConnection();
			String sql="insert into datatable (name,data) values(?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, fileName);
			File image=new File(absFileName);
			fis=new FileInputStream(image);
			ps.setBinaryStream(2,fis, (int)image.length());
			ps.execute();
			System.out.println("Ineserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(ps, con);
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		}

}
