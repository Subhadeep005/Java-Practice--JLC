package Test_Program;

import java.util.Scanner;

public class Last_word_of_string {

	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		int a=str.lastIndexOf(" ");
		char arr[]=str.toCharArray();
		for(int i=a+1;i<arr.length;i++)
		System.out.print(arr[i]);
	}

}
