package Java.lang.Practice;

public class Lab501 {

	public static void main(String[] args) {
		String exp="^[A-Z][A-Za-z0-9]*";
		System.out.println("S".matches(exp));
		System.out.println("SRINIVAS".matches(exp));
		System.out.println("jlc".matches(exp));
		System.out.println("JLCindia99".matches(exp));
		System.out.println("99JLCindia".matches(exp));
	}

}
