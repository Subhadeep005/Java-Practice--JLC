package Java.util.Practice;

import java.util.StringTokenizer;

public class Lab677 {
	
	public static void main(String[] args) {
		String str= "Hi This is JLC, Java Learning Center";
		StringTokenizer tok= new StringTokenizer(str);
		System.out.println("Count : "+tok.countTokens());
		while(tok.hasMoreElements()){
			String data=tok.nextToken();
			System.out.println(data);
		}
		System.out.println("Count : "+tok.countTokens());
		System.out.println("\n\nWith , Delimiter\n");
		String data= "99,Srinivas,sri@jlc.com,65799999";
		StringTokenizer tkns=new StringTokenizer(data,",");
		int id= Integer.parseInt(tkns.nextToken());
		String nm= tkns.nextToken();
		String eml = tkns.nextToken();
		long phn=Long.parseLong(tkns.nextToken());
		System.out.println("Id : "+id);
		System.out.println("Name : "+nm);
		System.out.println("Email : "+eml);
		System.out.println("Phone : "+phn);
	}
}
