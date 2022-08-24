package Jdbc.Practice;

import javax.sql.RowSet;
import javax.sql.rowset.*;

public class Lab27 {

	public static void main(String[] args) {
		try{
			RowSetFactory  factory=RowSetProvider.newFactory();
			RowSet rs =factory.createCachedRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/jlcdb");
			rs.setUsername("root");
			rs.setPassword("student");
			rs.setCommand("select sid,sname,email,phone from jlcstudents");
			rs.execute();
			while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
