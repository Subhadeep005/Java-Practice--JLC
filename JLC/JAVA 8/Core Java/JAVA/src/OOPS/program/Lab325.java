package OOPS.program;

public class Lab325 {

	public static void main(String[] args) {
		
		Hai4 hai=new Hai4();
		System.out.println(hai.a);
		
		Hello54 hello =new Hello54();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}

class Hai4{
	int a=99;
}
class Hello54 extends Hai3{
	int b=88;
}
