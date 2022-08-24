package Test_Program;

import java.util.Scanner;

public class next_char_in_string {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		
			for(int i=0;i<arr.length; i++){
				if(arr[i]>=65 && arr[i]<=91 || arr[i]>=97 && arr[i]<=123){
					if(arr[i]!='z')
						System.out.print((char)(arr[i]+1));
						else
							System.out.print('a');
				}
				else
					System.out.print(arr[i]);
				//else if(arr[i]>=65 && arr[i]<=91)
					//System.out.println(arr[i]);
		}
	}
}