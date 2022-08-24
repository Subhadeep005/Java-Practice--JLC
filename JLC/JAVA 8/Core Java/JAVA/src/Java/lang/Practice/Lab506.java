package Java.lang.Practice;

public class Lab506 {

	public static void main(String[] args) {
		String str="AB";
		StringBuilder sb=new StringBuilder("A");
		System.out.println(str.hashCode()); //String class hashCode() method(Overriden method of Object class).
		System.out.println(sb.hashCode()); //Object class hashCode() method.
	}
}
