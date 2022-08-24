package Java.lang.Practice;

import java.util.Scanner;

public class Lab460 {

	public static void main(String[] args) {
		String str="JLC";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter JLC String");
		String str1=sc.nextLine(); //Dynamic input(With new operator).
		System.out.println("Re Enter JLC String");
		String str2=sc.nextLine(); //Dynamic input(With new operator).
		String str3=str1.intern();
		String str4=str2.intern();
		System.out.println(str1==str2);//f
		System.out.println(str3==str4);//t
		System.out.println(str==str3);//t
	}

}
