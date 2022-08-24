package Test_Program;

import java.util.Scanner;

public class Pattern_array {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the no of row");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		char arr[]=new char[no*(no-2)],ch='a';
		for (int i = 0; i <arr.length; i++) {
			arr[i]=ch;
			ch++;
		}
		for (int i = 1; i <= no; i++) {
			for(int j=1;j<=i;j++){
				System.out.print(arr[count]+" ");
				count++;
			}
			System.out.println();
		}
	}

}
