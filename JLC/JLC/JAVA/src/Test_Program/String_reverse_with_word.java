package Test_Program;

import java.util.Scanner;

public class String_reverse_with_word {
	
	public static void main(String[] args) {
		
		String st="";
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
		st=st+arr[i]+" ";
		}
		System.out.println(st);
	}
}
