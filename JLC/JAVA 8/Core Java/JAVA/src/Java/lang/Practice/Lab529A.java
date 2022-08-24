package Java.lang.Practice;

import java.io.IOException;

public class Lab529A {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter some input");
		int asc=System.in.read();
		System.out.println("Input data :"+(char)asc);
		System.out.println("Message using out");
		System.err.println("Message using err");
	}

}
