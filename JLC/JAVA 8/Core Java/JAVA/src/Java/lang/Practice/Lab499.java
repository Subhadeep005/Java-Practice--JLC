package Java.lang.Practice;

public class Lab499 {

	public static void main(String[] args) {
		String exp="[A-Z]*";
		System.out.println("H".matches(exp));
		System.out.println("S".matches(exp));
		System.out.println("HI".matches(exp));
		System.out.println("SRINIVAS".matches(exp));
		System.out.println("JLCINDIA".matches(exp));
		System.out.println("jlc".matches(exp));
	}

}
