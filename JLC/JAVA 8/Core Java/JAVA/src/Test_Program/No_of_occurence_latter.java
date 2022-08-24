package Test_Program;

import java.util.Scanner;

public class No_of_occurence_latter {
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		//System.out.println("Enter a word");
		//Scanner sc1=new Scanner(System.in);
		//char ch=sc1.next().charAt(0);
		for (int i = 0; i < arr.length; i++) {
			int count=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=' '){
			if(arr[i]==arr[j])
				count++;
			}
		}
		if(count>0)
		System.out.println("No of Occurance character \'"+arr[i]+"\' is="+count);
		}
	}
	}
