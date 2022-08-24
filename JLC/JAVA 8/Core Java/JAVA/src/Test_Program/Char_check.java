package Test_Program;

import java.io.IOException;

public class Char_check {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a character:");
		char ch=(char)System.in.read();
		System.out.println(ch);
		if(ch>=65 && ch<=90)
			System.out.println("Upper case Character:"+ch);
		else if(ch>=97 && ch<=122)
			System.out.println("Lower case Character:"+ch);
		else if(ch>=48 && ch<=57)
			System.out.println("Number:"+ch);
		else
			System.out.println("Special character:"+ch);
	}

}
