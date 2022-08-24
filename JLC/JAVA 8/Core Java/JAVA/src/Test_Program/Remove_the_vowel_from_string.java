package Test_Program;

import java.util.Scanner;

public class Remove_the_vowel_from_string {

	public static void main(String[] args) {
		
		int a=0;
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U' &&
					arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u')
					System.out.print(arr[i]);
		}
		
	}

}