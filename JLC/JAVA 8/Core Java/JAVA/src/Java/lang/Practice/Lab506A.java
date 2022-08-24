package Java.lang.Practice;

public class Lab506A {

	public static void main(String[] args) {
		String str="AB";
		StringBuilder sb=new StringBuilder("A");
		System.out.println(str.hashCode()); //String class hashCode() method.
		System.out.println(sb.hashCode()); //Object class hashCode() method.
		System.out.println(str); //String class toString() method.
		System.out.println(sb); //Overriden method of String class toString() method.
	}
}
/*class StringBuilder{
	String sb;
	StringBuilder(String sb) {
		this.sb=sb;
	}
	@Override
	public int hashCode() {
		return 123;
	}
	@Override //Override Object class toString() method.
	public String toString() {
		return super.toString();
	}
}*/
