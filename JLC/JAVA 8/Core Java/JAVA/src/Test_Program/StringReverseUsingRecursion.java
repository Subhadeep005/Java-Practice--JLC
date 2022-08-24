package Test_Program;

import java.util.Scanner;

public class StringReverseUsingRecursion {
	
	public static void main(String[] args) {
		System.out.println("Enter any string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		StringReverse stringReverse= new StringReverse(str);
		String st=stringReverse.revString(str.indexOf(str.charAt(str.length()-1)));
		System.out.println(st);
	}
}

class StringReverse{
	String str;
	public StringReverse(String str) {
		this.str=str;
	}
	String revString(int ch){
		if(ch==str.indexOf(str.charAt(0))){
			Character st=str.charAt(ch);
			return st.toString();
			}
		else{
			return str.charAt(ch)+revString(ch-1);
		}
	}
}