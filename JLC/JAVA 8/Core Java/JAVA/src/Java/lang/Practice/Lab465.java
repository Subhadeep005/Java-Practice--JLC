package Java.lang.Practice;

public class Lab465 {

	public static void main(String[] args) {
		String str1="JLC";
		String str2="INDIA";
		String str3=str1.concat(str2); //Always with new.
		System.out.println(str3);
		String str4="JLCINDIA"; //NF (Without new).
		System.out.println(str3==str4);
	}

}
