public class Test3 {

	public static void main(String[] args) {
		System.out.println(Hello.a);
	}

}
class Hello{
	final static int a=99;
	static{
		System.out.println("Hello S.B");
	}
}
