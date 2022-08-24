package Test_Program;

import java.util.Scanner;

public class string_convert_next_subcqnt_char {

	public static void main(String[] args) {
		
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=65 && arr[i]<=91 || arr[i]>=97 && arr[i]<=123){
				if(arr[i]!='z' && arr[i]!='Z')
		 System.out.print((char)(str.charAt(i)+1));
				else if(arr[i]=='z')
					System.out.print('a');
				else
					System.out.print('A');
			}
			else
				System.out.print(arr[i]);
		}
	}
}
