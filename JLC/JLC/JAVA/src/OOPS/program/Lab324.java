package OOPS.program;

public class Lab324 {

	public static void main(String[] args) {
		Hai3 hai=new Hai3();
		System.out.println(hai.a);
		System.out.println(hai.b);
		
		Hello53 hello =new Hello53();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}

class Hai3{
	int a=99;
}
class Hello53 extends Hai3{
	int b=88;
}