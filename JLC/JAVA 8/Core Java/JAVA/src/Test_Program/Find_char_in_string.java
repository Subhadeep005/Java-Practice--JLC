package Test_Program;

import java.util.Scanner;

public class Find_char_in_string {

	public static void main(String[] args) {
		int count=0,a=0;
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println("Enter the particuler character which you want to find:");
		Scanner sc1 =new Scanner(System.in);
		char ch=sc1.next().charAt(0);
		
		for(int i=0;i<arr.length;i++){
			if(ch==arr[i])
				a++;
			}
		
		if(a>=1){
			System.out.print("Your searched character '"+ch+"' is position ");
			for(int i=0;i<=count;i++){
				count=str.indexOf(ch,count);
				//System.out.println(count);
				if(count>=0){
					count=count+1;
					System.out.print(count+",");
					}
				}
			}
		else
			System.out.println("your entered character not in this string");
		}
	}