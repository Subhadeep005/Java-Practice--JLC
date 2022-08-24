package Jdbc.Practice;

import java.sql.*;

public class Lab17 {

	public static void main(String[] args) throws SQLException {
		
		//Connection con=JDBCUtil.getOracleConnection();
		Connection con=JDBCUtil.getMySQLConnection();
		DatabaseMetaData md=con.getMetaData();
		System.out.println("URL :"+md.getURL());
		System.out.println("User :"+md.getUserName());
		System.out.println("product Verson :"+md.getDatabaseProductVersion());
		System.out.println("Major Verson :"+md.getDatabaseMajorVersion());
		System.out.println("Minor Verson :"+md.getDatabaseMinorVersion());
		System.out.println("Full Join :"+md.supportsFullOuterJoins());
		System.out.println("Product Name :"+md.getDatabaseProductName());
		System.out.println("Multiple RS :"+md.supportsMultipleOpenResults());
		System.out.println("DB :"+md.getDatabaseProductName());
		System.out.println();
	}

}
