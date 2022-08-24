package OOPS.program;

public class Lab408 {

	public static void main(String[] args) {
		Hai18 hai=new Hai18(10);
		hai.show();
	}

}
abstract class Hello69{
	int a;
	Hello69(int a){
		this.a=a;
		System.out.println("Hello (int) Construtor");
	}
	{
		System.out.println("Hello --> I.B");
	}
	void show(){
		System.out.println("Hello --> show()");
	}
}
class Hai18 extends Hello69{
	Hai18(int a){
		super(a);
	}
}