package Test_Program;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println("Reverse of given string is: ");
		for(int i=arr.length-1; i>=0;i--)
			System.out.print(arr[i]);
	}

}
