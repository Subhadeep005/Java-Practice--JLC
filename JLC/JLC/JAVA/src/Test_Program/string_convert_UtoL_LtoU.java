package Test_Program;

import java.util.Scanner;

public class string_convert_UtoL_LtoU {

	public static void main(String[] args) {
		
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=65 && arr[i]<=91)
		 System.out.print(str.toLowerCase().charAt(i));
			else if(arr[i]>=97 && arr[i]<=123)
				System.out.print(str.toUpperCase().charAt(i));
			else
				System.out.print(arr[i]);
	}
	}

}
