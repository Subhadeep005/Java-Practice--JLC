package Test_Program;

import java.util.Scanner;

public class Len_of_arr {

	public static void main(String[] args) {
		int size=0;
		System.out.println("Enter a char String");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
	//char arr[]=new char[str.length()+1];
		char arr[]=str.toCharArray();
		for (int i :arr) {
				size++;
				System.out.println((char)i);
		}
		System.out.println("arr size is:"+size);
	}

}
