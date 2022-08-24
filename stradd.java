//import java.util.Scanner;
import java.io.*;
class stradd
{
	public static void main(String args[])
	{
		try{
		String s1,s2,s3;
		//Scanner in = new Scanner(System.in);
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("enter the first string");
		s1=ob.readLine();
		System.out.println("enter the second string");
		s2=ob.readLine();
		System.out.println("first string is="+s1+"\nsecond string is="+s2);
		s3=s1+s2;
		System.out.println("Final string is="+s3);
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
	}
}