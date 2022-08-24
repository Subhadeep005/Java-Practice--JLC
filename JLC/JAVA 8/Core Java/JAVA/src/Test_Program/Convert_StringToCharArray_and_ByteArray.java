package Test_Program;

import java.util.Scanner;

public class Convert_StringToCharArray_and_ByteArray {

	public static void main(String[] args) {
		System.out.println("Enter A String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Converting String to Char Array");
		char carr[]=new char[str.length()];
		for (int i = 0; i < carr.length; i++) {
			carr[i]=str.charAt(i);
		}
		for (int i = 0; i < carr.length; i++) {
			System.out.print(carr[i]);
		}
		System.out.println("\nConverting String to Byte Array");
		byte barr[]=new byte[str.length()];
		for (int i = 0; i < barr.length; i++) {
			char ch=str.charAt(i);
			byte b=(byte)ch;
			barr[i]=b;
		}
		for (int i = 0; i < barr.length; i++) {
			System.out.print((char)barr[i]);
		}
		
	}

}
