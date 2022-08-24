package Test_Program;

public class Final_static_var {

	public static void main(String[] args) {
		System.out.println(Hello.a); //Final variable memory allocation is happened at compilation time. 
	}

}
class Hello{
	final static int a=99;
	static{
		System.out.println("Hello S.B");
	}
}
