package Test_Program;

import java.util.Scanner;

public class second_Last_of_string {

	public static void main(String[] args) {
		String st="";
		System.out.println("Enter A string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		System.out.println(arr[arr.length-2]);
		
		/*for(int i=arr.length-1;i>=0;i--){
			st=st+arr[i]+" ";
			}
		String arr1[]=st.split(" ");
		System.out.println(arr1[1]);*/
		
			/*int a=st.indexOf(" ");
			int b=st.indexOf(" ",(a+1));
			for(int j=a+1;j<b+1;j++)
				System.out.print(st.charAt(j));*/
	}
}
