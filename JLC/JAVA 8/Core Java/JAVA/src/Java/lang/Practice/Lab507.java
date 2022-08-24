package Java.lang.Practice;

public class Lab507 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("A");
		StringBuilder sb2=new StringBuilder("A");
		System.out.println(sb1.equals(sb2)); //Compare address (Object class method).
		System.out.println(sb1.toString()==sb2.toString()); //Compare address.
		String st1=sb1.toString();
		String st2=sb2.toString();
		System.out.println(st1.equals(st2));  //Compare address (String class method).
	}

}
