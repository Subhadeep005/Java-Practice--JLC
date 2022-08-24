package Java.lang.Practice;

import java.io.*;

public class Lab531A {

	public static void main(String[] args) throws IOException {
		System.out.println("Msg Using out");
		System.err.println("Msg Using err");
		FileOutputStream fos=new FileOutputStream("out.txt");
		PrintStream ps=new PrintStream(fos);
		System.setOut(ps);
		for (int i = 0; i < args.length; i++) {
			System.out.println("Value is :"+args[i]);
		}
		System.err.println("Msg2 Using err");
	}

}
