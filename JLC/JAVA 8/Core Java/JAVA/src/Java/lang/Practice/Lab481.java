package Java.lang.Practice;

public class Lab481 {

	public static void main(String[] args) {
		String str="Hi, Welcome to JLC (Java Lerning Center), Java World";
		System.out.println(str);
		String str1=str.replace('J','X');
		System.out.println(str1);
		String str2=str.replaceFirst("Java", "SD");
		System.out.println(str2);
		String str3=str.replaceAll("Java", "SD");
		System.out.println(str3);
		System.out.println(str);
	}

}
