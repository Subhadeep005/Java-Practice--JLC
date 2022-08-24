package OOPS.program;

public class Lab322A {

	public static void main(String args) {
		System.out.println("main(String)");

	}
	public static void main(String[] args) {
		System.out.println("main(String[])");
		main("");
		main(10);
		main(new int[0]);

	}
	public static void main(int args) {
		System.out.println("main(int)");

	}
	public static void main(int[] args) {
		System.out.println("main(int[])");

	}

}
