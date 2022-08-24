package OOPS.program;

public class Lab407 {

	public static void main(String[] args) {
		System.out.println(Hello68.A);
		Hello68.show();
	}

}
abstract class Hello68{
	static int A=1234;
	static void show(){
		System.out.println("Hello --> show()");
	}
}