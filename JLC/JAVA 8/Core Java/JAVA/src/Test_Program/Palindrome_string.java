package Test_Program;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int mid=(arr.length/2), flag=0;
		for(int i=0 ,j=(arr.length-1); i<=mid && j>=mid;i++,j--){
			if(arr[i]!=arr[j]){
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}

}
