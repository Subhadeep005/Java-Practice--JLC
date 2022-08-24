package Test_Program;

import java.util.Scanner;

public class Square_of_2 {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		while(no!=1){
			if(no%2!=0){
				count++;
				break;
			}
			no=no/2;
		}
		if(count==0) System.out.println("It is a Factor of 2");
		else System.out.println("It is not a Factor of 2");
	}
}
